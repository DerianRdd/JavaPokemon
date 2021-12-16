//Imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Formatter;

public class main {
    
    public static void main(String[] args) {
        int op,op2;
        int p;
        int J1JJ,J1JP,J1JG,J2JJ,J2JP,J2JG; 
        Scanner sc = new Scanner(System.in);
        String nomAr1,nomAr2,contra,contraJ1,contraJ2,usuario1,usuario2;
        do{
        System.out.println("1. Iniciar sesion para jugador 1");
        System.out.println("2. Crear cuenta");
        System.out.println("3. Salir");
        op = sc.nextInt();
        sc.reset();
        switch(op){
            case 1: 
                System.out.println("Ingresa tu nombre de usuario (jugador 1)"); //iniciar sesión para usuario 1
                usuario1 = sc.next();
                sc.reset();
                System.out.println("Ingresa la contrasenia");
                contraJ1 = sc.next();
                sc.reset();
                nomAr1 = usuario1; 
                contra = main.leerContrasena(nomAr1);
                if(contraJ1.equals(contra)){
                    System.out.println("Bienvenido al juego "+usuario1);
			
                        do{
                            System.out.println("1. Iniciar sesion para jugador 2");
                            System.out.println("2. Crear cuenta");
                            System.out.println("3. Salir");
                            op = sc.nextInt();
                            sc.reset();
                            switch(op){
                                case 1: 
                                    System.out.println("Ingresa tu nombre de usuario (jugador 2)"); //iniciar sesion para usuario 2
                                    usuario2 = sc.next();
                                    sc.reset();
                                    System.out.println("Ingresa la contrasenia");
                                    contraJ2 = sc.next();
                                    sc.reset();
                                    nomAr2 = usuario2; 
                                    contra = main.leerContrasena(nomAr2);
                                    if(contraJ2.equals(contra)){
                                       System.out.println("Bienvenido al juego "+usuario2); //inicia juego con ambos jugadores con cuentas iniciadas
					String nombreJugador;
                                        System.out.println("-------- Juego poderoso de Pokemon --------");
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
                                        op=3;      
                                    }
                                    else{
                                        System.out.println("Contrasenia o usuario incorrectos, intente de nuevo ");
                                    }
                                break;
                                case 2:
                                    System.out.println("Ingresa un nombre de usuario (jugador 2)"); //crear cuenta para usuario 2
                                    nomAr2 = sc.next();
                                    sc.reset();
                                    System.out.println("Ingresa la contrasenia");
                                    contra = sc.next();
                                    sc.reset();
                                    main.crearCarpetas(nomAr2);
                                    main.añadirArchivo(nomAr2, contra);
                                    J2JJ=0;J2JG=0;J2JP=0;
                                    main.modificarEstadisticas(nomAr2,J2JJ,J2JG,J2JP);
                                break;
                                 }
                                }while(op!=3);
                    }
                else{
                    System.out.println("Contrasenia o usuario incorrectos, intente de nuevo");
                }
                
            break;
            case 2:
                System.out.println("Ingresa un nombre de usuario"); //crear cuenta para usuario 1
                nomAr1 = sc.next();
                sc.reset();
                System.out.println("Ingresa la contrasenia");
                contra = sc.next();
                sc.reset();
                main.crearCarpetas(nomAr1);
                main.añadirArchivo(nomAr1, contra);
                J1JJ=0;J1JG=0;J1JP=0;
                main.modificarEstadisticas(nomAr1,J1JJ,J1JG,J1JP);
                
            break;            
        }
        }while(op!=3);
    }

    public static void crearCarpetas(String nomArch){  //metodo para crear carpetas 
        String crear = ("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\Estadisticas");
        File f=new File(crear);
        if(f.mkdirs()){
            System.out.println("El usuario ha sido registrado correctamente");
        }
        else{
            System.out.println("Ocurrio un error, revisar direccion de la carpeta en el codigo");
        }
;
    }

    public static void añadirArchivo(String nomArch,String cad){ //metodo para añadir archivo txt con contraseña
        String carpeta = ("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\contrasena");
        File f =new File(carpeta+".txt");
      try{
              FileWriter w=new FileWriter(f);
              BufferedWriter bw=new BufferedWriter(w);
              PrintWriter pw=new PrintWriter(bw);
              pw.write(cad);
              pw.close();
              bw.close();
      }  
      catch(IOException e){
          System.out.println("Corregir la direccion de la carpeta");
      };
    }
    
    public static String leerContrasena(String nomArch){ //metodo para leer contraseña
      String c="",caux="";
      String carpeta =("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\contrasena");
      try{
          File f=new File(carpeta+".txt");
          FileReader r=new FileReader(f);
          BufferedReader br=new BufferedReader(r);

      while(caux!=null){
          caux=br.readLine();
          if(caux==null)
              break;
          c=c+caux;
         }
      }
      catch(IOException e){
      System.out.println("Corregir la direccion de la carpeta");
      };
    return c;
    }

    public static void modificarEstadisticas(String nomArch,int i,int j,int k){ //metodo que modifica las estadisticas 
        String carpeta = ("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\Estadisticas\\Estadistica");
        Formatter archivo = null;
      try{
              archivo = new Formatter(carpeta+".txt");
              archivo.format("%d\n",i);
              archivo.format("%d\n",j);
              archivo.format("%d\n",k);
      }  
      catch(IOException e){
          System.out.println("Corregir la direccion de la carpeta");
      }finally{
          archivo.close();
      };
    }
    public static void leerEstadistica(String nomArch){ //metodo que lee e imprime las estadisticas de los jugadores 
      int i,j,k,ban=1;
      String carpeta =("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\Estadisticas\\Estadistica");
      try{
          File f=new File(carpeta+".txt");
          Scanner sc = new Scanner(f);
          while(sc.hasNextInt()){
              if(ban==1){
                   i = sc.nextInt();
                   System.out.println("\nJuegos jugados: "+i);
                   ban=ban+1;
              }
              if(ban==2){
                   j = sc.nextInt();
                   System.out.println("\nJuegos ganados: "+j);
                   ban=ban+1;
              }
              if(ban==3){
                   k = sc.nextInt();
                   System.out.println("\nJuegos perdidos: "+k);
              }
          }
      }
      catch(IOException e){
      System.out.println("Corregir la direccion de la carpeta");
      };
    }
    public static int juegosJugados(String nomArch){  //metodo que asigna valor a J1JJ o J2JJ
      int i=0,j,k,ban=1;
      String carpeta =("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\Estadisticas\\Estadistica");
      try{
          File f=new File(carpeta+".txt");
          Scanner sc = new Scanner(f);
          while(sc.hasNextInt()){
              if(ban==1){
                   i = sc.nextInt();
                   ban=ban+1;
              }
              if(ban==2){
                   j = sc.nextInt();
                   ban=ban+1;
              }
              if(ban==3){
                   k = sc.nextInt();
              }
          }
      }
      catch(IOException e){
      System.out.println("Corregir la direccion de la carpeta");
      };
     return i;
    }
    public static int juegosGanados(String nomArch){  //metodo que asigna valor a J1JG J2JG
      int i,j=0,k,ban=1;
      String carpeta =("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\Estadisticas\\Estadistica");
      try{
          File f=new File(carpeta+".txt");
          Scanner sc = new Scanner(f);
          while(sc.hasNextInt()){
              if(ban==1){
                   i = sc.nextInt();
                   ban=ban+1;
              }
              if(ban==2){
                   j = sc.nextInt();
                   ban=ban+1;
              }
              if(ban==3){
                   k = sc.nextInt();
              }
          }
      }
      catch(IOException e){
      System.out.println("Corregir la direccion de la carpeta");
      };
      return j;
    }
    public static int juegosPerdidos(String nomArch){  //metodo que asigna valor a J1JP O J2JP
      int i,j,k = 0,ban=1;
      String carpeta =("C:\\Users\\Derian\\Documents\\NetBeansProjects\\Archivos2\\")+nomArch+("\\Estadisticas\\Estadistica");
      try{
          File f=new File(carpeta+".txt");
          Scanner sc = new Scanner(f);
          while(sc.hasNextInt()){
              if(ban==1){
                   i = sc.nextInt();
                   ban=ban+1;
              }
              if(ban==2){
                   j = sc.nextInt();
                   ban=ban+1;
              }
              if(ban==3){
                   k = sc.nextInt();
                   ban=ban+1;
              }
          }
      }
      catch(IOException e){
      System.out.println("Corregir la direccion de la carpeta");
      };
      return k;
    }
}

		
