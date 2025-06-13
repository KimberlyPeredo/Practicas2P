package Practica13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números para insertar en el árbol (escriba -1 para terminar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            if (numero == -1) break;
            arbol.insertar(numero);
        }


        System.out.println("Números ordenados:");
        arbol.mostrarInOrden();

    }
}
