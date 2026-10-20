package ejercicio1;

public class Cuenta {
    //Como creo un objeto
    //Nombre de la clase + nombre objeto + new + nombre constructor + ()
    //Crear un atributo
    //modificador de acceso public/privated/protected + tipo + nombre
    //public es accesible fuera y dentro de una clase
    //privated SOLO DENTRO DE SU CLASE
    //Encapsulacion: atributos privados + metodos publicos get y set
    public String cliente ;
    public double interes ;
    public String numeroCuenta;
    public double saldo ;

    //COSTRUCTORES -> POR DEFECTO, POR PARAMETROS, COPIA
    //public + nombre de la clase (parametros)

    public Cuenta(String cliente, double interes, String numeroCuenta, double saldo){
        this.cliente = cliente;
        this.interes = interes;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //GET -> public + tipo + nombre() {
    // return valor;
    // }

    public String getCliente (){
        return cliente;
    }
    public double getInteres(){
        return interes;
    }
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }

    //Setter -> public + void + nombre(ATRIBUTO OBLIGATORIO){
    // this.atributo = parametro;
    // }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public void setInteres(double interes){
        this.interes = interes;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
