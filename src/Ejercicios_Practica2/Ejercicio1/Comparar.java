package Ejercicios_Practica2.Ejercicio1;

public class Comparar {
    public static boolean comparar(int[] v1, int[] v2, int indice) {
        if (v1.length != v2.length) {
            return false;
        }
        if (indice == v1.length) {
            return true;
        }
        if (v1[indice] != v2[indice]) {
            return false;
        }
        return comparar(v1, v2, indice + 1);
    }
}
