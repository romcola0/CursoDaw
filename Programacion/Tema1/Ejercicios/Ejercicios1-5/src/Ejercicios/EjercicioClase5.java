package Ejercicios;

/*
Crea un programa que use constantes para almacenar información que no debe cambiar (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar. Muestra todos los valores.

Ejemplo de salida por consola:

Aplicación: MiApp
Versión: 1.0.0
Valor de PI: 3.14159
Usuario actual: Laura
Nivel: 1
Puntuación: 0
Usuario actualizado: Miguel
Nivel actualizado: 2
Puntuación actualizada: 150
 */
public class EjercicioClase5 {
    public static void main(String[] args) {

        //Variables mutables e inmutables

        final String nombreApp = "MiApp";
        System.out.println("Aplicación: "+ nombreApp);
        String version = "1.0.0";
        System.out.println("Versión: "+ version);
        final double pi = 3.141559;
        System.out.println("Valor de PI: "+ pi);
        String usuario = "Laura";
        System.out.println("Usuario actual: "+ usuario);
        int nivel = 1;
        System.out.println("Nivel: "+ nivel);
        int puntuacion = 0;
        System.out.println("Puntuación: "+ puntuacion);


        //Actualización de variables

        usuario = "Miguel";
        System.out.println("Usuario actualizado: "+ usuario);
        nivel = 2;
        System.out.println("Nivel actualizado: "+ nivel);
        puntuacion = 150;
        System.out.println("Puntuación actualizada: "+ puntuacion);


    }
}
