package Ejercicios;

import java.util.Scanner;

/*
Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:

a) Son iguales
b) La primera es menor que la segunda *
c) Son distintas

(CompararCadenas)

*ENTRADA/SALIDA*

Escribe una palabra: **hola**
Escribe una palabra: **adios**
Son iguales: false
La primera es menor que la segunda: false
Son distintas: true
 */
public class EjercicioJava12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica una frase");
        String frase1 = lector.nextLine();
        System.out.println("Indica otra frase");
        String frase2 = lector.nextLine();
        boolean compararIguales = frase1.equals(frase2);
        boolean compararLong = frase1.length() < frase2.length();
        System.out.println("Comparar iguales "+compararIguales);
        System.out.println("Primera mas larga que la segunda?  "+compararLong);
        System.out.println("Comparar distintas "+!compararIguales);



        lector.close();
    }
}
