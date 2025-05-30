package Ejercicios_Practica2.Ejercicio3;

public class Comparar {
    public static boolean comparar(int[][][] m1, int[][][] m2, int i, int j, int k) {
        if (i == m1.length) return true;
        if (m1[i][j][k] != m2[i][j][k]) return false;

        if (k + 1 < m1[0][0].length) {
            return comparar(m1, m2, i, j, k + 1);
        } else if (j + 1 < m1[0].length) {
            return comparar(m1, m2, i, j + 1, 0);
        } else {
            return comparar(m1, m2, i + 1, 0, 0);
        }
    }
}
