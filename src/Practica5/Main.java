package Practica5;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.estaVacia());

        for (int i = 1; i <= 5; i++) {
            cola.insertar(i);
        }
        cola.mostrar();

        cola.eliminar();
        cola.eliminar();
        cola.mostrar();

    }
}
