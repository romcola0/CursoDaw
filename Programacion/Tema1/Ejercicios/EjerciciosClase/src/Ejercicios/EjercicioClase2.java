package Ejercicios;
/*
Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.

Ejemplo de salida por consola:

Puntuación inicial: 0
Después de primera modificación: 5
Después de segunda modificación: 10
Puntuación final: 15
 */
public class EjercicioClase2 {
    public static void main(String[] args) {

        String nombre = "Carlos";
        int edad = 30;
        boolean estudiante = true;
        double altura = 1.75;
        char inicial = 'C';

        System.out.println("Nombre: "+nombre+" - Tipo: String");
        System.out.println("Edad: "+edad+" - Tipo: int");
        System.out.println("¿Eres estudiante?: "+estudiante+" - Tipo: boolean");
        System.out.println("Altura: "+altura+" - Tipo: double");
        System.out.println("Inicial: "+inicial+" - Tipo: char");
    }
}
