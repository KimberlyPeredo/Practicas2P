package Ejercicios_Practica1.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos elementos tendra el vector?: ");
        int tamano = sc.nextInt();

        int[] datos = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }
        VectorDatos vectorDato = new VectorDatos();
        vectorDato.setVector(datos);

        int suma = SumaRecursiva.sumar(vectorDato.getVector(), 0);

        System.out.println("La suma de los elementos es: " + suma);

    }
}
