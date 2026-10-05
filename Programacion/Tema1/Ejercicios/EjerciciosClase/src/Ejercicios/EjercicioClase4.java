package Ejercicios;
/*
Crea un programa que simule la información de un libro usando variables con nombres descriptivos. Muestra toda la información del libro en la consola.

Ejemplo de salida por consola:

Título: Don Quijote de la Mancha
Autor: Miguel de Cervantes
Año de publicación: 1605
Número de páginas: 863
¿Disponible en biblioteca?: true
 */
public class EjercicioClase4 {
    public static void main(String[] args) {

        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int anioPublicacion = 1605;
        int numPaginas = 863;
        boolean disponible = true;

        System.out.println("Título: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año de publicación: "+ anioPublicacion);
        System.out.println("Número de páginas: "+ numPaginas);
        System.out.println("¿Disponible en biblioteca?: "+ disponible);
    }
}

