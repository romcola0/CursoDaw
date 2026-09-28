public class Entrada {
    //Comentarios
    /*
    TODO. Sirve para marcar cosas por hacer -> View/tool windows/TODO
     */

    //Para hacer un metodo ->
    // mod_acceso (Quien tiene acceso)
    // Retorno (Da el metodo para usarlo o no)
    // Nombre del metodo
    // (argumentos) lo que necesita el metodo para funcionar
    //Ejecucucion del metodo (Como funciona)

    public String global = "Hola"; //esto es accesible desde todos lados
    public static void main(String[] args){

        //Println salta de linea como un enter, print normal no.
        System.out.println("Mi primer programa");
        System.out.println(90);
        System.out.println("Mi primer programa " + "en 20 minutos");

        //EL printf (formateo) para no concatenar con + se usan banderas (%s)
        //%s --> Palabra
        //%d --> Numero sin decimales
        //%f --> Numero con decimales
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años\n", "Pepito", "Martin", "Martin", 20);


        //Las variables sirven para guardar datos y utilizarlos luego -> tipos: nombre valor
        //HAY VARIOS TIPOS COMO:
        //1.segun el tipo de dato tengo guardado: palabras-clave / numeros / boolean
        //variables con lowerCamelCase -> primera en minuscula y luego mayus
        //Las variables tienes que declararlas antes de usarlas
        //2.segun el origen de dato tengo guardado: primmitivos -> int, double, boolean (en minusc) / complejos -> String(en mayus porque es una clase)
        //3.segun su posibilidad de cambiar valor; mutables / no mutables (constante)
        //4.segun su scope - de clase o metodo (Dentro del public static void main, si intento acceder a una variable en otro metodo no puedo)

        String nombreLegal = "Pepito";
        nombreLegal = "Pepito M";

        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años", nombreLegal, "Martin", "Martin", 20);

        nombreLegal = "Pepito M";

        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años\n", nombreLegal, "Martin", "Martin", 20);

        //las variables char tiene que ser con '' en vez de ""

        char letra = 'a';
        letra = 'b';

        //Los numero los puedes guardar en byte, short, long
        int edad = 20;
        //Float tiene que tener la f al final
        double altura = 1.80;
        float alturaFloat = 1.80f;
        //boolean solo false o true
        boolean acierto = false;
        //Object es la clase padre pero si la usamos siempre podemos ir perdiendo informacion
        Object cosa = 1;
        //Agregar final hace que sea no mutables y se suelen llamar en mayusculas. Ej;DNI
        final String DNI = "123A";

    }

    public void main2(){
        System.out.println(global);//accesible desde todos lados ya que su scope es mayor
    }
}
