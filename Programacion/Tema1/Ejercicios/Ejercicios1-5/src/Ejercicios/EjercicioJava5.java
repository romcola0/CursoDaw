package Ejercicios;

import java.util.Scanner;

/*
Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

*ENTRADA/SALIDA*

Número de segundos: **24973**

Horas: 6

Minutos: 56

Segundos: 13
 */
public class EjercicioJava5 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Número de segundos: ");

        int segundos = lector.nextInt();
        lector.close();

        int totalSegundos = segundos % 60;
        int minutos = segundos / 60;
        int totalMinutos = minutos % 60;
        int totalHoras = minutos / 60;

        System.out.println("Horas: "+ totalHoras);
        System.out.println("Minutos: "+ totalMinutos);
        System.out.println("Segundo: "+ totalSegundos);
    }
}
