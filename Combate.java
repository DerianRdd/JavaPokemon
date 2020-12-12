import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Combate {

	public void elegirPokemons(Jugador jugador1, Jugador jugador2){
		int seleccionNumerica; //Para las elecciones del jugador
		int limiteEleccion; //Limite de equipo
		int elegirPokemon;
	
		Scanner lecturaNum = new Scanner(System.in);
		Random randomNum = new Random();

		System.out.println("\n---------------FASE DE SELECCION---------------");

		try{
			//Preguntamos con cuantos pokemon quieren combatir
			System.out.println("Con cuantos pokemon quieren combatir? Minimo 1, maximo 6");
			do{
				limiteEleccion = lecturaNum.nextInt();
				if(limiteEleccion <= 1 || limiteEleccion > 6){
					System.out.println("Seleccion invalida, intente de nuevo");
				}
			}while(limiteEleccion <= 1 || limiteEleccion > 6);


			//Hora de armar los pokemons - PRIMERO JUGADOR 1
			System.out.println(jugador1.nombre + " debe elegir su equipo");
			System.out.println("Para elegirlos manualmente, digita 1 y pulsa enter");
			System.out.println("Para elegirlos aleatoriamiente, digita 2 y pulsa enter");	
			seleccionNumerica = lecturaNum.nextInt();
			do{
				for(int i = 0; i < limiteEleccion; i++){
					if(seleccionNumerica == 1){ //Se asigna manualmente
						//Se supone antes de esto se despliega una lista de pokemons
						System.out.println("Selecciona el numero de pokemon a asignar");
						elegirPokemon = lecturaNum.nextInt();
					}else if(seleccionNumerica == 2){//se asigna aleatoriamiente
							elegirPokemon = randomNum.nextInt(17); // de 0 a 17 (18 en total)
					}else{
						System.out.println("Opcion no valida, se tomara como aleatorio");
						elegirPokemon = randomNum.nextInt(17);
					}
					switch(elegirPokemon){ //Por cada case, una instancia de Pokemon y su asignacion al arrayList de jugador
						case 0:
							break;
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							break;
						case 7:
							break;
						case 8:
							break;
						case 9:
							break;
						case 10:
							break;
						case 11:
							break;
						case 12:
							break;					
						case 13:
							break;
						case 14:
							break;
						case 15:
							break;
						case 16:
							break;
						case 17:
							break;
						default: // En teoria, no llegamos aqui
							System.out.println("Que raro, haz salido de la matrix");
					}
				}
			}while(seleccionNumerica != 1 && seleccionNumerica != 2);

			//-------ELECCION DE JUGADOR 2 ---------------------------------
			System.out.println(jugador2.nombre + " debe elegir su equipo");
			System.out.println("Para elegirlos manualmente, digita 1 y pulsa enter");
			System.out.println("Para elegirlos aleatoriamiente, digita 2 y pulsa enter");
			seleccionNumerica = lecturaNum.nextInt();
			do{
				for(int i = 0; i < limiteEleccion; i++){
					if(seleccionNumerica == 1){ //Se asigna manualmente
						//Se supone antes de esto se despliega una lista de pokemons
						System.out.println("Selecciona el numero de pokemon a asignar");
						elegirPokemon = lecturaNum.nextInt();
					}else if(seleccionNumerica == 2){//se asigna aleatoriamiente
							elegirPokemon = randomNum.nextInt(17); // de 0 a 17 (18 en total)
					}else{
						System.out.println("Opcion no valida, se tomara como aleatorio");
						elegirPokemon = randomNum.nextInt(17);
					}
					switch(elegirPokemon){ //Por cada case, una instancia de Pokemon y su asignacion al arrayList de jugador
						case 0:
							break;
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							break;
						case 7:
							break;
						case 8:
							break;
						case 9:
							break;
						case 10:
							break;
						case 11:
							break;
						case 12:
							break;					
						case 13:
							break;
						case 14:
							break;
						case 15:
							break;
						case 16:
							break;
						case 17:
							break;
						default: //En teoria no deberiamos llegar a default
							System.out.println("Que raro, haz salido de la matrix");
					}
				}
			}while(seleccionNumerica != 1 && seleccionNumerica != 2);

		//Fin del Try, falta el catch
		}catch(InputMismatchException e){
			System.out.println("\nERROR. Solo aceptamos numeros en las opciones");
			elegirPokemons(jugador1, jugador2);
		}//fin de try-catch InputMismatchException

	System.out.println("\n---------------FIN DE FASE DE SELECCION---------------");
	//Se llama al metodo iniciarCombate, recibe a los objetos jugadores
	iniciarCombate(jugador1, jugador2);

	}//Fin metodo elegirPokemons

	public void iniciarCombate(Jugador jugador1, Jugador jugador2){
		//Aqui se desempeña toda la atzion, los pokemon ya fueron creados y las pociones ya fueron asignadas
		System.out.println("\n---------------FASE DE COMBATE---------------");
		

	}//Fin metodo iniciar combate

}//Fin de clase Combate