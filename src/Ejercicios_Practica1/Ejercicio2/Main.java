package Ejercicios_Practica1.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadenaDatos cadenaDatos = new CadenaDatos();

        System.out.println("Ingresa una cadena: ");
        String texto = sc.nextLine();
        cadenaDatos.setCadena(texto);

        String invertida = InversionRecursividad.invertir(cadenaDatos.getCadena());

        System.out.println("Cadena invertida: " + invertida);
    }
}
