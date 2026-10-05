package Ejercicios;
/*
Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00 €).
También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10).
Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)

*ENTRADA/SALIDA*

Número de bebidas (entre 0 y 20): **3**

Número de bocadillos (entre 0 y 20): **5**

Precio de cada bebida (entre 0,00 y 3,00): **1,20**

Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**

Número de alumnos (entre 1 y 10): **5**
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EjercicioJava9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        final double PRECIO_BOCATA = 2.05;
        final double PRECIO_BEBIDA = 1.20;

        System.out.println("Número de bebidas: ");
        int bebidas = lector.nextInt();
        System.out.println("Número de bocadillos ");
        int bocadillos = lector.nextInt();
        lector.close();

        double costeBebidas = bebidas*PRECIO_BEBIDA;
        double costeBocatas = bocadillos*PRECIO_BOCATA;
        double costeTotal = costeBebidas*costeBocatas;
        System.out.printf("El coste de las bebidas es de %.2f\n", costeBebidas);
        System.out.printf("El coste de los bocatas es de %.2f\n" ,costeBocatas);
        System.out.printf("El coste total es de %.2f ",costeTotal);
    }
}
