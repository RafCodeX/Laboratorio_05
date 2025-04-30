package ejercicios_lab_05;

public class Node<T>{                        // Clase genérica Node
    private T Dato;                           // Atributo que almacena el dato
    private Node<T> SigNode;                  // Referencia al siguiente nodo
    
    public Node(T Dato){                     // Constructor
        this.Dato = Dato;
        this.SigNode = null;
    }

    public T getDato(){                      // Getter para Dato
        return Dato;
    }

    public Node<T> getSigNode(){             // Getter para el siguiente nodo
        return SigNode;
    }

    public void setDato(T Dato){             // Setter para Dato
        this.Dato = Dato;
    }

    public void setSigNod(Node<T> SigNode){  // Setter para el siguiente nodo
        this.SigNode = SigNode;
    }
}
