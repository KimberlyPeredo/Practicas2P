package Practica2;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada listaDoblementeEnlazada=new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        for (int i=20; i>0; i--){
            listaDoblementeEnlazada.insertar(i);
        }

        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
        listaDoblementeEnlazada.mostrarAtras();
    }
}
