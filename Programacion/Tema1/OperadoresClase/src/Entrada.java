import java.util.Locale;
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
    }
}
