package Ejercicios_Practica2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        MatrizDato matrizDato = new MatrizDato();

        int[][][] matriz1 = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };
        int[][][] matriz2 = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };

        matrizDato.setMatriz1(matriz1);
        matrizDato.setMatriz2(matriz2);

        boolean iguales = Comparar.comparar(matrizDato.getMatriz1(), matrizDato.getMatriz2(), 0, 0, 0);
        if (iguales) {
            System.out.println("Las matrices son iguales.");
        } else {
            System.out.println("Las matrices son diferentes");
        }
    }
}
