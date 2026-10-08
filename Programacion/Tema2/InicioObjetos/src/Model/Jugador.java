package Model;

public class Jugador {

    //representa el "molde" de lo que será un jugador real
    //atributo que cualifican -> nombre, apellido, nivel ...
    public String nombre, clan ;
    public int vidas, nivel ;
    public boolean estrella ;

    //constructor -> la manera en la que se inicia el jugador -> de 1 a n
        //modificador de acceso (public para poder llamarlo) Jugador ( parametro ) { }
    public Jugador(String nombreParametro, String clanParametro,
                   int vidasParametro, int nivelParametro) {
        nombre = nombreParametro;
        clan = clanParametro;
        vidas = vidasParametro;
        nivel = nivelParametro;
        //estrella = flase;
    }

    //metodos -> las funcionalidades del elemento cuando sea real
        //modificador de acceso (private/public/protected) retorno (void/int/double) nombre ( parametro ) { }

}
