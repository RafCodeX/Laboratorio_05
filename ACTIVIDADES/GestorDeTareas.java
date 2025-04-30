package actividad_01_lab_05;

import java.util.*;

public class GestorDeTareas<T>{                         // Clase genérica GestorDeTareas
    private Node<T> head;                      // Referencia al primer nodo de la lista
    private List<T> TareasCompletadas;         // Lista de tareas completadas
                                     // Constructor
    public GestorDeTareas(){                            
        this.head = null;
        this.TareasCompletadas = new ArrayList<>();
    }
                                                // Método para agregar una tarea
    public void agregarTarea(T tarea){                  
        Node<T> nuevo = new Node<>(tarea);
        if (head == null){
            head = nuevo;
        } else {
            Node<T> actual = head;
            while (actual.getSigNode() != null){
                actual = actual.getSigNode();
            }
            actual.setSigNod(nuevo);
        }
    }
                                               // Método para eliminar una tarea
    public boolean eliminarTarea(T tarea){              
        if (head == null)
            return false;
        if (head.getDato().equals(tarea)){
            head = head.getSigNode();
            return true;
        }
        Node<T> actual = head;
        while (actual.getSigNode() != null){
            if (actual.getSigNode().getDato().equals(tarea)) {
                actual.setSigNod(actual.getSigNode().getSigNode());
                return true;
            }
            actual = actual.getSigNode();
        }
        return false;
    }
                          // Método para verificar si una tarea está en la lista
    public boolean contieneTarea(T tarea){  
        Node<T> actual = head;
        while (actual != null){
            if (actual.getDato().equals(tarea))
                return true;
            actual = actual.getSigNode();
        }
        return false;
    }
                                   // Método para imprimir las tareas pendientes
    public void imprimirTareas(){    
        Node<T> actual = head;
        while (actual != null){
            System.out.println(actual.getDato());
            actual = actual.getSigNode();
        }
    }
                                     // Método para contar las tareas pendientes
    public int contarTareas(){    
        int contador = 0;
        Node<T> actual = head;
        while (actual != null){
            contador++;
            actual = actual.getSigNode();
        }
        return contador;
    }
                             // Método para obtener la tarea con mayor prioridad
    public T obtenerTareaMasPrioritaria(){   
        if (head == null) return null;
        T masPrioritaria = head.getDato();
        Node<T> actual = head.getSigNode();
        while (actual != null){
            if (actual.getDato() instanceof Tarea tareaActual &&
                masPrioritaria instanceof Tarea tareaMasPrioritaria &&
                tareaActual.getPrioridad() > tareaMasPrioritaria.getPrioridad()){
                masPrioritaria = actual.getDato();
            }
            actual = actual.getSigNode();
        }
        return masPrioritaria;
    }
                                  // Método para invertir el orden de las tareas
    public void invertirTareas(){       
        Node<T> anterior = null;
        Node<T> actual = head;
        Node<T> siguiente;
        while (actual != null){
            siguiente = actual.getSigNode();
            actual.setSigNod(anterior);
            anterior = actual;
            actual = siguiente;
        }
        head = anterior;
    }
                                 // Método para marcar una tarea como completada
    public void completarTarea(T tarea){               
        if (eliminarTarea(tarea)){
            TareasCompletadas.add(tarea);
        }
    }
                                  // Método para imprimir las tareas completadas
    public void imprimirTareasCompletadas(){            
        for (T t : TareasCompletadas) {
            System.out.println("Completada: " + t);
        }
    }
}
