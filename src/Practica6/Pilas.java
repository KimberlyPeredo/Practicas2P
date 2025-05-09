package Practica6;

import Practica1.Nodo;
import Practica5.Cola;

public class Pilas extends Cola {
    @Override
    public void eliminar() {
        if (!estaVacia()) {
            Nodo ultimo = primero;
            Nodo penultimo = null;
            while (ultimo.getSiguiente() != null) {
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();
            }
            penultimo.setSiguiente(null);
        }
    }
}
