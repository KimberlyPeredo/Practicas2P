package Practica2;

public class Nodo {
    private Nodo anterior;
    private Object dato;
    private Nodo siguiente;

    public Nodo(Nodo anterior, Object dato, Nodo siguiente){
        this.anterior=anterior;
        this.dato=dato;
        this.siguiente=siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
