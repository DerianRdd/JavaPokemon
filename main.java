//Imports
import java.util.Scanner;

public class main{

	static Scanner lectura = new Scanner(System.in);

	public static void main(String[] args){
		String nombreJugador;
		System.out.println("Juego poderoso de Pokemon");

		//Vamos a definir a los jugadores
		System.out.println("Por favor, ingresa tu nombre, jugador 1: ");
		nombreJugador = lectura.nextLine(); //Leemos el nombre de jugador1
		Jugador jugador1 = new Jugador(nombreJugador); // Creamos el primer jugador con su nombre asignado
		//Jugador 2
		System.out.println("Por favor, ingresa tu nombre, jugador 2: ");
		nombreJugador = lectura.nextLine(); //Nombre de jugador 2
		Jugador jugador2 = new Jugador(nombreJugador); //Segundo jugador creado
		System.out.println("SE BATIRAN EN DUELO: " + jugador1.nombre + " VS " + jugador2.nombre + "!");

		System.out.println("Preparanse para el combate!");
		//Ya elegidos, comenzamos el combate
		Combate pelea = new Combate(); //Objeto combate, para el flujo de la pelea
		pelea.elegirPokemons(jugador1, jugador2); //Iniciamos el combate
		
	}

}


