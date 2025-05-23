package Ejercicios.Ejercicio1;

public class SumaRecursiva {
    public static int sumar(int[] vector, int indice) {
        if (indice == vector.length) {
            return 0;
        }
        return vector[indice] + sumar(vector, indice + 1);
    }
}
