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

		apodoPokemon="";
		elegirApodo=0;
	
		Scanner lecturaNum = new Scanner(System.in);
		Scanner lecturaString = new Scanner(System.in);
		Random randomNum = new Random();

		System.out.println("\n---------------FASE DE SELECCION---------------");

		try{
			//Preguntamos con cuantos pokemon quieren combatir
			System.out.println("Con cuantos pokemon quieren combatir? Minimo 1, maximo 6");
			do{
				limiteEleccion = lecturaNum.nextInt();
				if(limiteEleccion < 1 || limiteEleccion > 6){
					System.out.println("Seleccion invalida, intente de nuevo");
				}
			}while(limiteEleccion < 1 || limiteEleccion > 6);


			//Hora de armar los pokemons - PRIMERO JUGADOR 1
			System.out.println(jugador1.nombre + " debe elegir su equipo");
			System.out.println("Para elegirlos manualmente, digita 1 y pulsa enter");
			System.out.println("Para elegirlos aleatoriamiente, digita 2 y pulsa enter");	
			seleccionNumerica = lecturaNum.nextInt();
			do{
				for(int i = 1; i <= limiteEleccion; i++){
					if(seleccionNumerica == 1){ //Se asigna manualmente
						//Se supone antes de esto se despliega una lista de pokemons
						System.out.println("Selecciona el numero de pokemon a asignar");
						elegirPokemon = lecturaNum.nextInt();
					}else if(seleccionNumerica == 2){//se asigna aleatoriamiente
							elegirPokemon = randomNum.nextInt(17); // de 0 a 17 (18 en total)
					}else{
						System.out.println("Opcion no valida, se tomara como aleatorio");
						elegirPokemon = randomNum.nextInt(17); // de 0 a 17 (18 en total)
					}
					System.out.println("Desea asignar un apodo a su Pokemon " + i + "?\n1. Si\n2.No");
					elegirApodo = lecturaNum.nextInt();
					if (elegirApodo == 1){
						System.out.println("Escriba el apodo de su pokemon " + i +":");
						apodoPokemon = lecturaString.nextLine(); //Leemos el apodo
					 }else{
					 	System.out.println("Pokemon " + i + " no tendra un apodo personalizado. Se usara un predeterminado");
					 }
					switch(elegirPokemon){ //Por cada case, una instancia de Pokemon y su asignacion al arrayList de jugador
						case 0: // Arbok
							if(elegirApodo == 1){ //(Apodo, Vida, ataque, defensa, velocidad, estado )
								jugador1.addPokemon(new Arbok(apodoPokemon, 150+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									165+(randomNum.nextInt(40)-20), 130+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Arbok("Arbok", 150+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									165+(randomNum.nextInt(40)-20), 130+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 1: // Bellosom
							if(elegirApodo == 1){
								jugador1.addPokemon(new Bellosom(apodoPokemon, 160+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), 
									172+(randomNum.nextInt(40)-20), 100+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Bellosom("Bellosom", 160+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), 
									172+(randomNum.nextInt(40)-20), 100+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 2: // Blastoise
							if(elegirApodo == 1){
								jugador1.addPokemon(new Blastoise(apodoPokemon, 240+(randomNum.nextInt(40)-20), 190+(randomNum.nextInt(40)-20), 
									161+(randomNum.nextInt(40)-20), 120+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Blastoise("Blastoise", 240+(randomNum.nextInt(40)-20), 190+(randomNum.nextInt(40)-20), 
									161+(randomNum.nextInt(40)-20), 120+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 3: // Blaziken
							if(elegirApodo == 1){
								jugador1.addPokemon(new Blaziken(apodoPokemon, 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Blaziken("Blaziken", 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}
							break; //NOTA: RECUERDA //(Apodo, Vida, ataque, defensa, velocidad, estado )
						case 4: // Electabuzz
							if(elegirApodo == 1){
								jugador1.addPokemon(new Electabuzz(apodoPokemon, 159+(randomNum.nextInt(40)-20), 171+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Electabuzz("Electabuzz", 159+(randomNum.nextInt(40)-20), 171+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 5: // Flygon
							if(elegirApodo == 1){
								jugador1.addPokemon(new Flygon(apodoPokemon, 200+(randomNum.nextInt(40)-20), 186+(randomNum.nextInt(40)-20), 
									190+(randomNum.nextInt(40)-20), 150+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Flygon("Flygon", 200+(randomNum.nextInt(40)-20), 186+(randomNum.nextInt(40)-20), 
									190+(randomNum.nextInt(40)-20), 150+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 6: // Jolteon
							if(elegirApodo == 1){
								jugador1.addPokemon(new Jolteon(apodoPokemon, 230+(randomNum.nextInt(40)-20), 195+(randomNum.nextInt(40)-20), 
									199+(randomNum.nextInt(40)-20), 181+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Jolteon("Jolteon", 230+(randomNum.nextInt(40)-20), 195+(randomNum.nextInt(40)-20), 
									199+(randomNum.nextInt(40)-20), 181+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 7: // Magmar
							if(elegirApodo == 1){
								jugador1.addPokemon(new Magmar(apodoPokemon, 220+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Magmar("Magmar", 220+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 8: // Meganium
							if(elegirApodo == 1){
								jugador1.addPokemon(new Meganium(apodoPokemon, 242+(randomNum.nextInt(40)-20), 197+(randomNum.nextInt(40)-20), 
									168+(randomNum.nextInt(40)-20), 101+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Meganium("Meganium", 242+(randomNum.nextInt(40)-20), 197+(randomNum.nextInt(40)-20), 
									168+(randomNum.nextInt(40)-20), 101+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 9: // Nidoking
							if(elegirApodo == 1){
								jugador1.addPokemon(new Nidoking(apodoPokemon, 170+(randomNum.nextInt(40)-20), 179+(randomNum.nextInt(40)-20), 
									181+(randomNum.nextInt(40)-20), 177+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Nidoking("Nikoding", 170+(randomNum.nextInt(40)-20), 179+(randomNum.nextInt(40)-20), 
									181+(randomNum.nextInt(40)-20), 177+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 10: // Pikachu
							if(elegirApodo == 1){
								jugador1.addPokemon(new Pikachu(apodoPokemon, 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Pikachu("Pikachu", 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 11: // Rhydon
							if(elegirApodo == 1){
								jugador1.addPokemon(new Rhydon(apodoPokemon, 182+(randomNum.nextInt(40)-20), 169+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 174+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Rhydon("Rhydon", 182+(randomNum.nextInt(40)-20), 169+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 174+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 12: // Sceptile
							if(elegirApodo == 1){
								jugador1.addPokemon(new Sceptile(apodoPokemon, 223+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Sceptile("Sceptile", 223+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;					
						case 13: // Seviper
							if(elegirApodo == 1){
								jugador1.addPokemon(new Seviper(apodoPokemon, 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Seviper("Seviper", 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}
							break; //NOTA: RECUERDA //(Apodo, Vida, ataque, defensa, velocidad, estado )
						case 14: // Swampert 
							if(elegirApodo == 1){
								jugador1.addPokemon(new Swampert(apodoPokemon, 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Swampert("Swampert", 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 15: // Torkoal
							if(elegirApodo == 1){
								jugador1.addPokemon(new Torkoal(apodoPokemon, 181+(randomNum.nextInt(40)-20), 161+(randomNum.nextInt(40)-20), 
									186+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Torkoal("Torkoal", 181+(randomNum.nextInt(40)-20), 161+(randomNum.nextInt(40)-20), 
									186+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 16: // Venonat
							if(elegirApodo == 1){
								jugador1.addPokemon(new Venonat(apodoPokemon, 241+(randomNum.nextInt(40)-20), 164+(randomNum.nextInt(40)-20), 
									155+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Venonat("Venonat", 241+(randomNum.nextInt(40)-20), 164+(randomNum.nextInt(40)-20), 
									155+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 17: // Wailord
							if(elegirApodo == 1){
								jugador1.addPokemon(new Wailord(apodoPokemon, 209+(randomNum.nextInt(40)-20), 175+(randomNum.nextInt(40)-20), 
									166+(randomNum.nextInt(40)-20), 187+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador1.addPokemon(new Wailord("Wailord", 209+(randomNum.nextInt(40)-20), 175+(randomNum.nextInt(40)-20), 
									166+(randomNum.nextInt(40)-20), 187+(randomNum.nextInt(40)-20), "Normal"));
							}
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
				for(int i = 1; i <= limiteEleccion; i++){
					if(seleccionNumerica == 1){ //Se asigna manualmente
						//Se supone antes de esto se despliega una lista de pokemons
						System.out.println("Selecciona el numero de pokemon a asignar");
						elegirPokemon = lecturaNum.nextInt();
					}else if(seleccionNumerica == 2){//se asigna aleatoriamiente
							elegirPokemon = randomNum.nextInt(17); // de 0 a 17 (18 en total)
					}else{
						System.out.println("Opcion no valida, se tomara como aleatorio");
						elegirPokemon = randomNum.nextInt(17); // de 0 a 17
					}
					System.out.println("Desea asignar un apodo a su Pokemon " + i + "?\n1. Si\n2.No");
					elegirApodo = lecturaNum.nextInt();
					if (elegirApodo == 1){
						System.out.println("Escriba el apodo de su pokemon " + i +":");
						apodoPokemon = lecturaString.nextLine(); //Leemos el apodo
					 }else{
					 	System.out.println("Pokemon " + i + " no tendra un apodo personalizado. Se usara un predeterminado");
					 }
					switch(elegirPokemon){ //Por cada case, una instancia de Pokemon y su asignacion al arrayList de jugador
						case 0: // Arbok
							if(elegirApodo == 1){ //(Apodo, Vida, ataque, defensa, velocidad, estado )
								jugador2.addPokemon(new Arbok(apodoPokemon, 150+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									165+(randomNum.nextInt(40)-20), 130+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Arbok("Arbok", 150+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									165+(randomNum.nextInt(40)-20), 130+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 1: // Bellosom
							if(elegirApodo == 1){
								jugador2.addPokemon(new Bellosom(apodoPokemon, 160+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), 
									172+(randomNum.nextInt(40)-20), 100+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Bellosom("Bellosom", 160+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), 
									172+(randomNum.nextInt(40)-20), 100+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 2: // Blastoise
							if(elegirApodo == 1){
								jugador2.addPokemon(new Blastoise(apodoPokemon, 240+(randomNum.nextInt(40)-20), 190+(randomNum.nextInt(40)-20), 
									161+(randomNum.nextInt(40)-20), 120+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Blastoise("Blastoise", 240+(randomNum.nextInt(40)-20), 190+(randomNum.nextInt(40)-20), 
									161+(randomNum.nextInt(40)-20), 120+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 3: // Blaziken
							if(elegirApodo == 1){
								jugador2.addPokemon(new Blaziken(apodoPokemon, 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Blaziken("Blaziken", 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}
							break; //NOTA: RECUERDA //(Apodo, Vida, ataque, defensa, velocidad, estado )
						case 4: // Electabuzz
							if(elegirApodo == 1){
								jugador2.addPokemon(new Electabuzz(apodoPokemon, 159+(randomNum.nextInt(40)-20), 171+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Electabuzz("Electabuzz", 159+(randomNum.nextInt(40)-20), 171+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 5: // Flygon
							if(elegirApodo == 1){
								jugador2.addPokemon(new Flygon(apodoPokemon, 200+(randomNum.nextInt(40)-20), 186+(randomNum.nextInt(40)-20), 
									190+(randomNum.nextInt(40)-20), 150+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Flygon("Flygon", 200+(randomNum.nextInt(40)-20), 186+(randomNum.nextInt(40)-20), 
									190+(randomNum.nextInt(40)-20), 150+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 6: // Jolteon
							if(elegirApodo == 1){
								jugador2.addPokemon(new Jolteon(apodoPokemon, 230+(randomNum.nextInt(40)-20), 195+(randomNum.nextInt(40)-20), 
									199+(randomNum.nextInt(40)-20), 181+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Jolteon("Jolteon", 230+(randomNum.nextInt(40)-20), 195+(randomNum.nextInt(40)-20), 
									199+(randomNum.nextInt(40)-20), 181+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 7: // Magmar
							if(elegirApodo == 1){
								jugador2.addPokemon(new Magmar(apodoPokemon, 220+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Magmar("Magmar", 220+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 8: // Meganium
							if(elegirApodo == 1){
								jugador2.addPokemon(new Meganium(apodoPokemon, 242+(randomNum.nextInt(40)-20), 197+(randomNum.nextInt(40)-20), 
									168+(randomNum.nextInt(40)-20), 101+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Meganium("Meganium", 242+(randomNum.nextInt(40)-20), 197+(randomNum.nextInt(40)-20), 
									168+(randomNum.nextInt(40)-20), 101+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 9: // Nidoking
							if(elegirApodo == 1){
								jugador2.addPokemon(new Nidoking(apodoPokemon, 170+(randomNum.nextInt(40)-20), 179+(randomNum.nextInt(40)-20), 
									181+(randomNum.nextInt(40)-20), 177+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Nidoking("Nikoding", 170+(randomNum.nextInt(40)-20), 179+(randomNum.nextInt(40)-20), 
									181+(randomNum.nextInt(40)-20), 177+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 10: // Pikachu
							if(elegirApodo == 1){
								jugador2.addPokemon(new Pikachu(apodoPokemon, 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Pikachu("Pikachu", 250+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), 
									200+(randomNum.nextInt(40)-20), 200+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 11: // Rhydon
							if(elegirApodo == 1){
								jugador2.addPokemon(new Rhydon(apodoPokemon, 182+(randomNum.nextInt(40)-20), 169+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 174+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Rhydon("Rhydon", 182+(randomNum.nextInt(40)-20), 169+(randomNum.nextInt(40)-20), 
									150+(randomNum.nextInt(40)-20), 174+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 12: // Sceptile
							if(elegirApodo == 1){
								jugador2.addPokemon(new Sceptile(apodoPokemon, 223+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Sceptile("Sceptile", 223+(randomNum.nextInt(40)-20), 170+(randomNum.nextInt(40)-20), 
									179+(randomNum.nextInt(40)-20), 180+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;					
						case 13: // Seviper
							if(elegirApodo == 1){
								jugador2.addPokemon(new Seviper(apodoPokemon, 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Seviper("Seviper", 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}
							break; //NOTA: RECUERDA //(Apodo, Vida, ataque, defensa, velocidad, estado )
						case 14: // Swampert 
							if(elegirApodo == 1){
								jugador2.addPokemon(new Swampert(apodoPokemon, 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Swampert("Swampert", 157+(randomNum.nextInt(40)-20), 184+(randomNum.nextInt(40)-20), 
									167+(randomNum.nextInt(40)-20), 127+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 15: // Torkoal
							if(elegirApodo == 1){
								jugador2.addPokemon(new Torkoal(apodoPokemon, 181+(randomNum.nextInt(40)-20), 161+(randomNum.nextInt(40)-20), 
									186+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Torkoal("Torkoal", 181+(randomNum.nextInt(40)-20), 161+(randomNum.nextInt(40)-20), 
									186+(randomNum.nextInt(40)-20), 136+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 16: // Venonat
							if(elegirApodo == 1){
								jugador2.addPokemon(new Venonat(apodoPokemon, 241+(randomNum.nextInt(40)-20), 164+(randomNum.nextInt(40)-20), 
									155+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Venonat("Venonat", 241+(randomNum.nextInt(40)-20), 164+(randomNum.nextInt(40)-20), 
									155+(randomNum.nextInt(40)-20), 173+(randomNum.nextInt(40)-20), "Normal"));
							}
							break;
						case 17: // Wailord
							if(elegirApodo == 1){
								jugador2.addPokemon(new Wailord(apodoPokemon, 209+(randomNum.nextInt(40)-20), 175+(randomNum.nextInt(40)-20), 
									166+(randomNum.nextInt(40)-20), 187+(randomNum.nextInt(40)-20), "Normal"));
							}else{
								jugador2.addPokemon(new Wailord("Wailord", 209+(randomNum.nextInt(40)-20), 175+(randomNum.nextInt(40)-20), 
									166+(randomNum.nextInt(40)-20), 187+(randomNum.nextInt(40)-20), "Normal"));
							}
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


	//Lista de pokemons disponibles
	public void listaPokemons(){
		
	}

	//Aqui se desarrolla todo el combate
	public void iniciarCombate(Jugador jugador1, Jugador jugador2){
		//Aqui se desempeña toda la atzion, los pokemon ya fueron creados y las pociones ya fueron asignadas
		System.out.println("\n---------------FASE DE COMBATE---------------");

	}//Fin metodo iniciar combate

}//Fin de clase Combate