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
    // Método para buscar un número
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;  // No encontrado
        }
        if (raiz.dato == valor) {
            return true;   // Encontrado
        }
        return valor < raiz.dato ? buscarRec(raiz.izq, valor) : buscarRec(raiz.der, valor);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion, valor;

        do {
            System.out.println("Menú Árbol Binario:");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar un número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número a insertar: ");
                    valor = sc.nextInt();
                    arbol.insertar(valor);
                    break;
                case 2:
                    System.out.print("Recorrido inorden: ");
                    arbol.recorrerInOrden();
                    break;

                case 3:
                    System.out.print("Ingrese número a buscar: ");
                    valor = sc.nextInt();
                    if (arbol.buscar(valor)) {
                        System.out.println("Número encontrado en el árbol.");
                    } else {
                        System.out.println("Número NO encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
            System.out.println();

        } while (opcion != 4);

        sc.close();
    }
}



