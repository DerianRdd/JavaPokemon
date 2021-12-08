//Imports
import java.util.Scanner;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main{

	static Scanner lectura = new Scanner(System.in);
	public static void main(String[] args){
		
		int op,op2;
		Scanner sc = new Scanner(System.in);
		String nomAr,contra,contraJ1,contraJ2,usuario1,usuario2;
		do{
		System.out.println("1. Iniciar sesion para jugador 1");
		System.out.println("2. Crear cuenta");
		System.out.println("3. Salir");
		op = sc.nextInt();
		sc.reset();
		switch(op){
		    case 1: 
			System.out.println("Ingresa tu nombre de usuario (jugador 1)");
			usuario1 = sc.next(); 
			sc.reset();
			System.out.println("Ingresa la contrasenia");
			contraJ1 = sc.next();
			sc.reset();
			nomAr = usuario1 + ".txt"; 
			contra = Archivos2.leerArchivo(nomAr); //Se lee la contraseña en el archivo previo
			if(contraJ1.equals(contra)){
			    System.out.println("Bienvenido al juego "+usuario1); //inicia sesion jugador 1
			    System.out.println("Desea el jugador 2 iniciar sesion?");
			    System.out.println("1.Si\n2.No (No se guardaran las estadisticas)");
			    op2 = sc.nextInt();
			    if(op2==1){
				do{
				    System.out.println("1. Iniciar sesion para jugador 2");
				    System.out.println("2. Crear cuenta"); //se repite el codigo porque le da oportunidad al jugador 2 de crear una cuenta
				    System.out.println("3. Salir");
				    op = sc.nextInt();
				    sc.reset();
				    switch(op){
					case 1: 
					    System.out.println("Ingresa tu nombre de usuario (jugador 2)");
					    usuario2 = sc.next();
					    sc.reset();
					    System.out.println("Ingresa la contrasenia");
					    contraJ2 = sc.next();
					    sc.reset();
					    nomAr = usuario2 + ".txt"; 
					    contra = Archivos2.leerArchivo(nomAr);
					    if(contraJ2.equals(contra)){
                                                    System.out.println("Bienvenido al juego "+usuario2); //inicia juego con ambos jugadores con cuentas iniciadas
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
					    else{
						System.out.println("Contrasenia o usuario incorrectos, intente de nuevo ");
					    }
					break;
					case 2:
					    System.out.println("Ingresa un nombre de usuario (jugador 2)"); //crear cuenta para jugador 2
					    nomAr = sc.next();
					    nomAr = nomAr +".txt";
					    sc.reset();
					    System.out.println("Ingresa la contrasenia");
					    contra = sc.next();
					    sc.reset();
					    Archivos2.escribirArchivo(nomAr,contra);
					break;
					 }
					}while(op!=3);
				    } else{
					System.out.println("Se comenzara el juego solo con jugador 1: "+usuario1); //se comienza el juego solo con jugador 1 con cuenta
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
			else{
			    System.out.println("Contrasenia o usuario incorrectos, intente de nuevo"); //contraseña incorrecta de jugador 1
			}

		    break;
		    case 2:
			System.out.println("Ingresa un nombre de usuario"); //crear cuenta para jugador 1
			nomAr = sc.next();
			nomAr = nomAr +".txt"; 
			sc.reset();
			System.out.println("Ingresa la contrasenia");
			contra = sc.next();
			sc.reset();
			Archivos2.escribirArchivo(nomAr,contra); //se crea archivo con nombre = nombre de usuario, y se escribe la contraseña dentro
		    break;            
		}
		}while(op!=3);
	}//llaves de main
	
	public static void escribirArchivo(String nomArch,String cad){ //metodo para crear archivos
		File f=new File(nomArch);
	      try{
		  FileWriter w=new FileWriter(f);
		  BufferedWriter bw=new BufferedWriter(w);
		  PrintWriter pw=new PrintWriter(bw);
		pw.write(cad);
		pw.close();
		bw.close();
	      }  
	      catch(IOException e){};
  	  }
	public static String leerArchivo(String nomArch){ //metodo para leer archivos
		  String c="",caux="";
		  try{
		      File f=new File(nomArch);
		      FileReader r=new FileReader(f);
		      BufferedReader br=new BufferedReader(r);

		  while(caux!=null){
		      caux=br.readLine();
		      if(caux==null)
			  break;
		      c=c+caux;
		     }
		  }
		  catch(IOException e){};
		return c;
		}
	}
