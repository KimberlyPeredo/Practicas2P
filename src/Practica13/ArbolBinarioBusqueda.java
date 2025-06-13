package Practica13;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return new Nodo(dato);
        }

        if (dato < actual.dato) {
            actual.izquierda = insertarRecursivo(actual.izquierda, dato);
        } else if (dato > actual.dato) {
            actual.derecho = insertarRecursivo(actual.derecho, dato);
        }

        return actual;
    }

    public void mostrarInOrden() {
        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inOrden(nodo.derecho);
        }
    }
}
