package ejercicios_lab_05;

import java.util.*;

public class Ejercicios {
    
    //-------------------------------------------------------------------------
    // 1. Buscar un elemento genérico en una lista
    public static <T> boolean buscarElemento(List<T> lista, T valor){
        for (T elemento : lista) {
            if (elemento.equals(valor)) {
                return true;
            }
        }
        return false;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // 2. Invertir una lista generica
    public static <T> List<T> invertirLista(List<T> lista){
        List<T> listaInvertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }
        return listaInvertida;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // 3. Insertar un nodo al final
    public static <T> Node<T> insertarAlFinal(Node<T> head, T valor){
        Node<T> nuevo = new Node<>(valor);
        if (head == null) {
            return nuevo;
        }
        Node<T> actual = head;
        while (actual.getSigNode() != null) {
            actual = actual.getSigNode();
        }
        actual.setSigNod(nuevo);
        return head;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // 4. Contar los nodos
    public static <T> int contarNodos(Node<T> head){
        int contador = 0;
        Node<T> actual = head;
        while (actual != null) {
            contador++;
            actual = actual.getSigNode();
        }                                               
        return contador;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // 5. Comparar dos listas
    public static <T> boolean sonIguales(Node<T> lista1, Node<T> lista2){
        while (lista1 != null && lista2 != null) {
            if (!lista1.getDato().equals(lista2.getDato())) {
                return false;
            }
            lista1 = lista1.getSigNode();
            lista2 = lista2.getSigNode();
        }
        return lista1 == null && lista2 == null;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // 6. Concatenar dos listas
    public static <T> Node<T> concatenarListas(Node<T> lista1, Node<T> lista2){
        if (lista1 == null) return lista2;
        Node<T> actual = lista1;
        while (actual.getSigNode() != null) {
            actual = actual.getSigNode();
        }
        actual.setSigNod(lista2);
        return lista1;
    }
    //-------------------------------------------------------------------------
}
