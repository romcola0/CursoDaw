package Ejercicios;

import java.util.Scanner;

/*
Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia)
NOTA El valor de PI se obtiene con Math.PI

*ENTRADA/SALIDA*

Escribe un radio entero: **15**

Longitud de la circunferencia: 94.24777960769379

Area de circulo: 706.8583470577034
 */
public class EjercicioClase7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el radio de la circunferencia: ");
        double radio = lector.nextDouble();
        lector.close();
        double longitud = 2*Math.PI*radio;
        double area = Math.PI * Math.pow(radio,2);
        System.out.printf("La longitud del circulo es %.2f\n",longitud);
        System.out.printf("El área del circulo es %.2f",area);

    }
}
