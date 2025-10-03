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
