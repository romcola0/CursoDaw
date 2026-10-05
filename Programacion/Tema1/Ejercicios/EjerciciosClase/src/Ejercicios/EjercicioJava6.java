package Ejercicios;

import java.util.Scanner;

/*
Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).
¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)
*ENTRADA/SALIDA*

Valor de la compra (entre 0.00 y 500.00):**298,45**

IVA (entre 0 y 25%):**12**

Compra: 266.47

IVA: 31.98

======

298.45
 */
public class EjercicioJava6 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el precio de la compra: ");
        double compra = lector.nextDouble();
        //cuando meto por teclado decimal es la ,
        System.out.println("Indica que IVA se aplica a la compra: ");
        int iva = lector.nextInt();

        double ivaTotal = (double) iva/100*compra;
        double compraTotal = ivaTotal+compra;
        System.out.println("Precio compra sin IVA: "+compra);
        System.out.println("IVA de la compra: "+ivaTotal);
        System.out.println("Compra más IVA: "+compraTotal);
    }
}
