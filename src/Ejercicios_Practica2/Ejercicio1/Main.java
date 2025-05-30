package Ejercicios_Practica2.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectorDato vectorDato = new VectorDato();

        System.out.print("¿Cuantos elementos tendran los vectores?: ");
        int n = sc.nextInt();

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        System.out.println("Ingrese los elementos del 1er vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            v1[i] = sc.nextInt();
        }

        System.out.println("Ingrese los elementos del 2do vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            v2[i] = sc.nextInt();
        }

        vectorDato.setVector1(v1);
        vectorDato.setVector2(v2);

        boolean iguales = Comparar.comparar(vectorDato.getVector1(), vectorDato.getVector2(), 0);
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }

    }
}
