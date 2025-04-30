package actividad_01_lab_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----------MENU GESTOR DE TAREAS ----------");
            System.out.println("1 -----> Agregar tarea");
            System.out.println("2 -----> Eliminar tarea");
            System.out.println("3 -----> Verificar si una tarea existe");
            System.out.println("4 -----> Imprimir tareas actuales");
            System.out.println("5 -----> Contar tareas");
            System.out.println("6 -----> Obtener tarea con mayor prioridad");
            System.out.println("7 -----> Invertir lista de tareas");
            System.out.println("8 -----> Completar una tarea");
            System.out.println("9 -----> Ver tareas completadas");
            System.out.println("0 -----> Salir");
            System.out.println("------------------------------------------");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el titulo de la tarea: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese la descripcion de la tarea: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese la prioridad (entero): ");
                    System.out.print("1 --> Baja 2 --> Media 3 --> Alta");
                    int prioridad = sc.nextInt();
                    sc.nextLine(); 

                    gestor.agregarTarea(new Tarea(titulo, descripcion, prioridad));
                    System.out.println("Tarea agregada.");
                }
                case 2 -> {
                    System.out.print("Ingrese el titulo de la tarea a eliminar: ");
                    String titulo = sc.nextLine();
                    boolean eliminada = gestor.eliminarTarea(new Tarea(titulo, "", 0));
                    if (eliminada) {
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Tarea no encontrada.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el titulo de la tarea a buscar: ");
                    String titulo = sc.nextLine();
                    boolean encontrada = gestor.contieneTarea(new Tarea(titulo, "", 0));
                    if (encontrada) {
                        System.out.println("La tarea existe en la lista.");
                    } else {
                        System.out.println("La tarea no existe.");
                    }
                }
                case 4 -> {
                    System.out.println("Tareas actuales:");
                    gestor.imprimirTareas();
                }
                case 5 -> {
                    int total = gestor.contarTareas();
                    System.out.println("Total de tareas: " + total);
                }
                case 6 -> {
                    Tarea prioritaria = (Tarea) gestor.obtenerTareaMasPrioritaria();
                    if (prioritaria != null) {
                        System.out.println("Tarea con mayor prioridad:");
                        System.out.println(prioritaria);
                    } else {
                        System.out.println("No hay tareas en la lista.");
                    }
                }
                case 7 -> {
                    gestor.invertirTareas();
                    System.out.println("Lista invertida.");
                }
                case 8 -> {
                    System.out.print("Ingrese el titulo de la tarea a completar: ");
                    String titulo = sc.nextLine();
                    gestor.completarTarea(new Tarea(titulo, "", 0));
                    System.out.println("Tarea marcada como completada.");
                }
                case 9 -> {
                    System.out.println("Tareas completadas:");
                    gestor.imprimirTareasCompletadas();
                }
                case 0 -> {
                    System.out.println("Saliendo del programa.");
                }
                default -> {
                    System.out.println("Opcion invalida. Intente nuevamente.");
                }
            }
        } while (opcion != 0);
        sc.close();
    }
}
