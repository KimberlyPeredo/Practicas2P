package Ejercicios.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PotenciaDato potenciaDato = new PotenciaDato();

        System.out.println("Ingresa la base: ");
        potenciaDato.setBase(sc.nextInt());

        System.out.println("Ingrese el exponente(no negativo y que sea entero): ");
        potenciaDato.setExponente(sc.nextInt());

        int resul = PotenciaRecursividad.potencia(potenciaDato.getBase(), potenciaDato.getExponente());

        System.out.println(potenciaDato.getBase() + "^" + potenciaDato.getExponente() + " = " + resul);
    }
}
