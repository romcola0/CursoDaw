public class Operadores {
    public static void main(String[] args){
        double precio = 19.99;
        int cantidad = 3;
        final double IVA = 0.21;

        double base = precio * cantidad; //Multiplica el precio del producto por la cantidad que hay
        double total = base + base * IVA; //Multiplica el precio por el IVA y se suma al precio base para dar el total
        int precioTruncado = (int) total;


        System.out.printf("Base %.2f / Total %.4f / Precio Truncado %d%n", base, total, precioTruncado);

        /*
        Como calcular el porcentaje ya que sin convertir el int a double habria salido 0
         */
        int alumnosAprobados = 21;
        int totalAlumnos = 30;
        double porcentajeAlumnosAprobados = (double) alumnosAprobados / totalAlumnos * 100;

        System.out.println("El porcentaje de alumnos aprobados son: " + porcentajeAlumnosAprobados + "%");
    }
}
