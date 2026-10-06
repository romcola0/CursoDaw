package Ejercicios;

import java.util.Scanner;

/*
Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
decimales). (Temperaturas)
 */
public class EjercicioJava8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero de grados Cº");
        double gradosC = lector.nextDouble();
        double gradosF = (9*gradosC)/5+32;
        double gradosK = gradosC+273.15;
        System.out.printf("Vas a pasar %.2f C\n", gradosC);
        System.out.printf("Los grados en F son %.2f y en K son %.2f\n",gradosF, gradosK);
        System.out.println("Indica el numero de grados F");
        gradosF = lector.nextDouble();
        gradosC = 5*(gradosF-32)/9;
        gradosK= gradosC + 273.15;
        System.out.printf("Vas a pasar %.2f F\n", gradosF);
        System.out.printf("Los grados en C son %.2f y en K son %.2f\n",gradosC, gradosK);
        System.out.println("Indica el numero en grados K");
        gradosK = lector.nextDouble();
        gradosC = gradosK-273.15;
        gradosF = (9*(gradosC))/5+32;
        System.out.printf("Vas a pasar %.2f K\n", gradosK);
        System.out.printf("Los grados en C son %.2f y en F son %.2f\n",gradosC, gradosF);
        lector.close();
    }
}
