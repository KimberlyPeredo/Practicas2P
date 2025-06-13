package Practica11;

public class Ejercicios {
    /*
    Metodo recursivo para comparar dos vectores de enteros elemento por elemento
    vector1={5, 6, 2}
    vector2={2, 9, 2}
    diferen= 3 + 3 + 0= 6
    */

    private static int compararVectores(int[] vector1, int[] vector2, int indice) {
        int sumaDiferencias;

        if (indice == vector1.length - 1) {
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        } else { //llamado recursiva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }
        return sumaDiferencias;
    }

    public static boolean compararVectores(int[] vector1, int[] vector2) {
        return compararVectores(vector1, vector2, 0) == 0;
    }
}
