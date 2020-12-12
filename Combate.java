import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Combate {

	public void elegirPokemons(Jugador jugador1, Jugador jugador2){
		int seleccionNumerica; //Para las elecciones del jugador
		int limiteEleccion; //Limite de equipo
		int elegirPokemon, elegirApodo ;
		String apodoPokemon; //Por si se quiere un apodo, sino, se pone uno por defecto.
	
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
							elegirPokemon = randomNum.nextInt(2); // de 0 a 17 (18 en total)
					}else{
						System.out.println("Opcion no valida, se tomara como aleatorio");
						elegirPokemon = randomNum.nextInt(2);
					}
					System.out.println("Desea asignar un apodo a su Pokemon " + i + "?\n1. Si\n2.No");
					elegirApodo = lecturaNum.nextInt();
					if (elegirApodo == 1){
						System.out.println("Escriba el apodo de su pokemon " + i +":");
						apodoPokemon=lecturaNum.nextLine(); //Leemos el apodo
					 }else{
					 	System.out.println("Pokemon " + i + " no tendra un apodo personalizado. Se usara un predeterminado");
					 }
					switch(elegirPokemon){ //Por cada case, una instancia de Pokemon y su asignacion al arrayList de jugador
						case 0: // Bellosom
							if(elegirApodo == 1){ //(Apodo, Vida, ataque, defensa, velocidad, estado )
								jugador1.addPokemon(new Bellosom(apodoPokemon, 150+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									165+(randomNum.nextInt(40)-20), 130+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Bellosom(apodoPokemon, 150+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									165+(randomNum.nextInt(40)-20), 130+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 1: // Meganium
							if(elegirApodo == 1){
								jugador1.addPokemon(new Meganium(apodoPokemon, ));
							}else{
								jugador1.addPokemon(new Meganium("Meganium", ));
							}
							break;
						case 2: // Sceptile
							if(elegirApodo == 1){
								jugador1.addPokemon(new Sceptile(apodoPokemon, ));
							}else{
								jugador1.addPokemon(new Sceptile("Sceptile", ));
							}
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
							elegirPokemon = randomNum.nextInt(2); // de 0 a 17 (18 en total)
					}else{
						System.out.println("Opcion no valida, se tomara como aleatorio");
						elegirPokemon = randomNum.nextInt(2);
					}
					switch(elegirPokemon){ //Por cada case, una instancia de Pokemon y su asignacion al arrayList de jugador
						case 0: // Bellosom
							if(elegirApodo == 1){
								jugador1.addPokemon(new Bellosom(apodoPokemon, ));
							}else{
								jugador1.addPokemon(new Bellosom("Bellosom", ));
							}
							break;
						case 1: // Meganium
							if(elegirApodo == 1){
								jugador1.addPokemon(new Meganium(apodoPokemon, ));
							}else{
								jugador1.addPokemon(new Meganium("Meganium", ));
							}
							break;
						case 2: // Sceptile
							if(elegirApodo == 1){
								jugador1.addPokemon(new Sceptile(apodoPokemon, ));
							}else{
								jugador1.addPokemon(new Sceptile("Sceptile", ));
							}
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