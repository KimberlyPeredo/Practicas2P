package Ejercicios.Ejercicio2;

public class InversionRecursividad {

    public static String invertir(String cadena){
        if (cadena==null || cadena.length() <=1){
            return cadena;
        }
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }
}
