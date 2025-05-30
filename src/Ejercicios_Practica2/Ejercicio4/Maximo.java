package Ejercicios_Practica2.Ejercicio4;

public class Maximo {
    public static int maximo(int[][][] matriz, int i, int j, int k) {
        int actual = matriz[i][j][k];

        if (k + 1 < matriz[0][0].length) {
            return Math.max(actual, maximo(matriz, i, j, k + 1));
        } else if (j + 1 < matriz[0].length) {
            return Math.max(actual, maximo(matriz, i, j + 1, 0));
        } else if (i + 1 < matriz.length) {
            return Math.max(actual, maximo(matriz, i + 1, 0, 0));
        } else {
            return actual;
        }
    }
}
