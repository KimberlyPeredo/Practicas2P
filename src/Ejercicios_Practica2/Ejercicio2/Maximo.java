package Ejercicios_Practica2.Ejercicio2;

public class Maximo {
    public static int maximo(int[] vector, int indice) {
        if (indice == vector.length - 1) {
            return vector[indice];
        }
        int maximoResto = maximo(vector, indice + 1);
        return Math.max(vector[indice], maximoResto);

    }
}
