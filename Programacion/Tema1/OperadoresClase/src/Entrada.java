import java.util.Locale;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Programa para explicar los operadores");
        //Scanner permite realizar lecturas por teclado
        //Es una variable compleja y empieza por mayuscula y guarda un dato y un monton de complementos (primitivos solo un dato)
        Scanner lector = new Scanner(System.in);
        System.out.println("Indicame tu nombre:");
        //Depende del tipo de dato que quieras leer la variable lector tiene metodos para ello
        String nombre = lector.nextLine(); //NextLine añade espacios, si mezclas next y nextline puede dat fallo igual que si ponemos espacios usando Next
        System.out.println("En que ciclo de has matriculado: ");
        String ciclo = lector.nextLine();
        System.out.println("Que nota quieres sacar en "+ciclo);
        double media = lector.nextDouble();
        System.out.println("Nombre: "+nombre.toUpperCase()); //A traves del operador punto accedes a la funcionalidad
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+media); //Aqui al media ser primitivo no tiene acceso a las funcionalidades del .

        //4 Grandes tipos de operadores:
        //Aritmeticos -> operaciones + - * / %
        //Asignacion -> da un valor = += -= *= /= %=
        //Relacionales - Comparacion -> comparan dos o mas variables entre si < <= > >= == !=
        //Logicos -> sentencias && ||

        // Aritmeticos -> operaciones + - * / % (cuidado con la +  de dos string)
        int operador1 = 5;
        int operador2 = 2;
        int suma = operador1 + operador2;
        int resta = operador1 - operador2;
        int multiplicacion = operador1 * operador2;
        double division = (double) operador1 / operador2;
        // % el resto de la division de dos numeros
        int resto = 5 % 2; // par // segundos entran en unos minutos
        String numero = "5";
        String numero2 = "7";
        System.out.println("Concatenar string " + (operador1 + operador2));
        System.out.println("El resto es: " + resto);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

        // Asignacion -> da un valor = +=  -=  *=  /=  %= ++ --

        operador1 = 10;
        operador2 = 11;
        operador1++; // 11
        operador1++; // 12
        operador1++; // 13
        operador1++; // 14
        operador2--; // 10 -> operador2 = operador2 - 1
        operador2--; // 9
        operador2--; // 8
        // sumar 14 al operador 1
        // operador1 = operador1+14;
        operador1 += 14; // operador1 = operador1+14 -> 28
        operador2 -= 10; // -2
        operador1 *= 2; // 56
        operador1 %= 2; // 0 -> operador1 = operador1 % 2
        System.out.println("El valor despues de haber operado es Operador1: " + operador1);
        System.out.println("El valor despues de haber operado es Operador2: " + operador2);

        // Relacionales -> Comparacion. comparan dos o mas variables entre si < <= > >= == != . Se obtiene un boolean
        operador1 = 10;
        operador2 = 10;
        boolean comparacion = operador1 > operador2; // false
        System.out.println("La comparacion > es " + comparacion);
        comparacion = operador1 >= operador2; // true
        System.out.println("La comparacion >= es " + comparacion);
        comparacion = operador2 < operador1; // false
        System.out.println("La comparacion < es " + comparacion);
        comparacion = operador2 <= operador1; // true
        System.out.println("La comparacion <= es " + comparacion);
        comparacion = operador1 == operador2; // true
        System.out.println("La comparacion == es " + comparacion);
        comparacion = operador1 != operador2; // false
        System.out.println("La comparacion != es " + comparacion);
        String palabra1 = "programacion";
        String palabra2 = "Programaciones";
        boolean compararPalabrasIguales = palabra1.equals(palabra2); // false
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2); // false -> true por la exclamacion
        compararPalabrasIguales = palabra1.equalsIgnoreCase(palabra2); // true
        System.out.println("La comparacion de palabras es " + compararPalabrasIguales);

        // Logicos -> sentencias && -> shift+6 || -> alt+1
        // && -> AND || -> OR
        operador1 = 10;
        operador2 = 20;
        boolean comparacionAND = operador2 > 0 && operador1 < 10; // false
        boolean comparacionOR = operador1 < 10 || operador2<20 && operador1*2 >=operador2; // true
        //                      F               || F -> F
    }
}
