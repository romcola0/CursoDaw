package Ejercicios;
/*
Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
a) Suma
b) Resta
c) Multiplicación
d) División entera
e) Resto
f) División real
g) Resto real
(Operaciones)

ENTRADA/SALIDA
ENTERO: 24
ENTERO: 7
 */
import java.util.Scanner;

public class EjercicioJava3 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando: ");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando: ");
        int operando2 = lector.nextInt();

        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multiplicacion = operando1 * operando2;
        int division = operando1 / operando2;
        int modulo = operando1 % operando2;
        double divisionReal = (double) operando1 / operando2;
        double moduloReal = (double) operando1 % operando2;

        System.out.println("La suma de los valores es "+ suma);
        System.out.printf("La resta de %d y %d es %d\n", operando1,operando2,resta);
        System.out.printf("La multiplicación de %d y %d es %d\n", operando1,operando2,multiplicacion);
        System.out.printf("La división de %d y %d es %d\n", operando1,operando2,division);
        System.out.printf("El módulo de %d y %d es %d\n", operando1,operando2,modulo);
        System.out.printf("La división real de %d y %d es %.1f\n", operando1,operando2,divisionReal);
        System.out.printf("El módulo real de %d7 y %d es %.1f\n", operando1,operando2,moduloReal);
        lector.close();
    }
}
