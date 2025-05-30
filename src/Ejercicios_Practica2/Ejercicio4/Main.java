package Ejercicios_Practica2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        MatrizDato matrizDato = new MatrizDato();

        int[][][] matriz = {
                {{4, 2}, {9, 1}},
                {{7, 3}, {5, 8}}
        };
        matrizDato.setMatriz(matriz);

        int maximo = Maximo.maximo(matrizDato.getMatriz(), 0, 0, 0);

        System.out.println("El valor maxímo en la matriz es: " + maximo);
    }
}
