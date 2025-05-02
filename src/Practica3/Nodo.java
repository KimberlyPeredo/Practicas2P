package Practica3;

public class Nodo {
    private Object dato;
    private Nodo siguente;

    public Nodo() {

    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }
}
