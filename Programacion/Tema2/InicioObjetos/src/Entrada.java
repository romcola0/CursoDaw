import Model.Jugador;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Iniciando programa de juego");
        Jugador jugador1 = new Jugador("Jugador1","Clan1",10,100);
        Jugador jugador2 = new Jugador("Manuel", "Clan2", 5,9);
        Jugador jugador3 = new Jugador("Marta", "Clan1",10,100);
        Jugador jugador4 = new Jugador("Marcos", "Clan2",7,40);

        System.out.println("El clan del jugador 3 es: "+jugador3.clan);
    }
}
