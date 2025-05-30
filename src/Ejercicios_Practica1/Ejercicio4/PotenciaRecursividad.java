package Ejercicios_Practica1.Ejercicio4;

public class PotenciaRecursividad {
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
