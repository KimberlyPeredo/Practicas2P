package Practica1;

public class Main {
    public static void main(String[] args) {
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        //insertar elementos a nuestra lista
        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);

        //mostramos nuestra lista
        listaSimplementeEnlazada.mostrar();
        //eliminar algunos elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();
        //mostramos nuestra lista
        listaSimplementeEnlazada.mostrar();

    }
}
