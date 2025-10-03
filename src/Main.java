import java.util.Scanner;

class Nodo {
    int dato;
    Nodo izq, der;

    public Nodo(int valor) {
        dato = valor;
        izq = der = null;
    }
}
class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;  // inicializa la raiz vacía
    }

    // Método para insertar un nuevo valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }
    private Nodo insertarRec(Nodo raiz, int valor) {
        // Si el árbol está vacío, se crea el nodo nuevo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Si el valor es menor se inserta en la izquierda
        if (valor < raiz.dato) {
            raiz.izq = insertarRec(raiz.izq, valor);
        } else { // Si es mayor o igual, en la derecha
            raiz.der = insertarRec(raiz.der, valor);
        }

        return raiz;
    }
    // Método para mostrar el árbol en recorrido inorden
    public void recorrerInOrden() {
        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.izq);
            System.out.print(raiz.dato + " ");
            inOrden(raiz.der);
        }
    }
