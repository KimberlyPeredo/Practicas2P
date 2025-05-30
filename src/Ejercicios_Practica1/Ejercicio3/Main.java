package Ejercicios_Practica1.Ejercicio3;

import Ejercicios_Practica1.Ejercicio1.VectorDatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectorDatos vectorDatos = new VectorDatos();

        System.out.println("¿Cuantos elementos tendra el vector? : ");
        int tamano = sc.nextInt();

        int[] datos = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }

        vectorDatos.setVector(datos);

        double promedio = PromedioRecursividad.promedio(vectorDatos.getVector());

        System.out.println("El promedio de los elementos es: " + promedio);
    }
}
