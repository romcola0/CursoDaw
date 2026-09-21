public class Operadores {
    public static void main(String[] args){
        double precio = 19.99;
        int cantidad = 3;
        final double IVA = 0.21;

        double base = precio * cantidad;
        double total = base + base * IVA;
        int truncado = (int) total;

        System.out.printf("Base %.2f / Total %.4f / Truncado %d%n", base, total, truncado);
    }
}
