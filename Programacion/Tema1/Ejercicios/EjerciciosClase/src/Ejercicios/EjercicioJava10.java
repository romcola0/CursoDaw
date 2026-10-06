package Ejercicios;

import java.util.Scanner;

/*
Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades), y se obtiene el número correspondiente. (Numero)

*ENTRADA/SALIDA*
Decenas de mil: **7**
Unidades de mil: **9**
Centenas: **0**
Decenas: **5**
Unidades: **0**

Numero introducido: 79050
 */
public class EjercicioJava10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica dmillar");
        int dmillar = lector.nextInt();
        System.out.println("Indica umillar");
        int umillar = lector.nextInt();
        System.out.println("Indica centenas");
        int centenas = lector.nextInt();
        System.out.println("Indica decenas");
        int decenas = lector.nextInt();
        System.out.println("Indica unidades");
        int unidades = lector.nextInt();


        System.out.println("Numero introducido "+ dmillar+umillar+centenas+decenas+unidades);
        System.out.println(""+dmillar+umillar+centenas+decenas+unidades); //Asi salen concatenados
        System.out.println(dmillar+umillar+centenas+decenas+unidades);//Asi salen sumandose
        //Otra forma
        System.out.println("Ahora indica un numero completo");
        int numeroUsuario = lector.nextInt(); //12345
        dmillar = numeroUsuario/10000; //1,2345
        umillar = (numeroUsuario%10000)/1000;//2,345
        centenas = ((numeroUsuario%10000)%1000)/100; //3,45
        decenas = (((numeroUsuario%10000)%1000)%100)/10;//4,5
        unidades = ((((numeroUsuario%10000)%1000)%100)%10);//5
        //tambien se puede unidades = numeroUsuario%10; //1234,5 te quedas con el 5
        System.out.println("El numero es");
        System.out.println("dmillar "+dmillar);
        System.out.println("umillar "+umillar);
        System.out.println("centenas "+centenas);
        System.out.println("decenas "+decenas);
        System.out.println("unidades "+unidades);
        lector.close();
    }
}
