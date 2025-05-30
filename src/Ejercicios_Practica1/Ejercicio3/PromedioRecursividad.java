package Ejercicios_Practica1.Ejercicio3;

public class PromedioRecursividad {
    public static int sumar(int[] vector, int indice) {
        if (indice == vector.length) {
            return 0;
        }
        return vector[indice] + sumar(vector, indice + 1);
    }

    public static double promedio(int[] vector) {
        if (vector.length == 0) {
            return 0;
        }
        int suma = sumar(vector, 0);
        return (double) suma / vector.length;
    }
}
