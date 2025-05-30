package Ejercicios_Practica2.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectorDato vectorDato = new VectorDato();

        System.out.print("¿Cuantos elementos tendra el vector?: ");
        int n = sc.nextInt();

        int[] datos = new int[n];

        System.out.println("Ingresa los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }
        vectorDato.setVector(datos);

        int maximo = Maximo.maximo(vectorDato.getVector(), 0);

        System.out.println("El valor maxímo del vector es: " + maximo);
    }
}
