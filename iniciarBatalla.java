public void iniciarBatalla() {
    int eleccion1 = 0;
    int eleccion2 = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Bienvenido a la batalla, a continuacion elija el pokemon con el que quiere iniciar");
    System.out.println(jugador1.getNombre()+": ");
    jugador1.cambiarPokemon();
    System.out.println(jugador2.getNombre()+": ");
    jugador2.cambiarPokemon();
    while(checarDebilitados(jugador1)==0 && checarDebilitados(jugador2) == 0){
        empezarTurno(jugador1);
        eleccion1 = scan.nextInt();
        while (eleccion1 <1 && eleccion1 >4){
            System.out.println("Ha elegido una opcion incorrecta, intentelo de nuevo");
            eleccion1 = scan.nextInt();
        }
        empezarTurno(jugador2);
        eleccion2 = scan.nextInt();
        while (eleccion2 <1 && eleccion2 >4){
            System.out.println("Ha elegido una opcion incorrecta, intentelo de nuevo");
            eleccion2 = scan.nextInt();
        }
        
        if(jugador1.getPokemonActivo().getVelocidad()>=jugador2.getPokemonActivo().getVelocidad()){
            turno(checarEstado(jugador1.getPokemonActivo()),jugador1,jugador2, eleccion1);
            turno(checarEstado(jugador2.getPokemonActivo()),jugador2,jugador1, eleccion2);
        }else{
            turno(checarEstado(jugador2.getPokemonActivo()),jugador2,jugador1, eleccion2);
            turno(checarEstado(jugador1.getPokemonActivo()),jugador1,jugador2, eleccion1);
        }

    }
}
    if(checarDebilitados(jugador1)==1){
		    System.out.println(jugador1.getNombre()+" se ha quedado sin Pokemons!");
		    System.out.println(jugador2.getNombre()+" es el ganador!");
            		main.J2JJ = main.juegosJugados(main.nomAr2);
           		main.J2JG = main.juegosGanados(main.nomAr2);
         		main.J2JP = main.juegosPerdidos(main.nomAr2);
            		main.J2JJ++;
           		main.J2JG++;
            		main.modificarEstadisticas(main.nomAr2, main.J2JJ, main.J2JG, main.J2JP);
            		System.out.println("Estadisticas del usuario 2:");
            		main.leerEstadistica(main.nomAr2);
            		main.J1JJ = main.juegosJugados(main.nomAr1);
            		main.J1JG = main.juegosGanados(main.nomAr1);
            		main.J1JP = main.juegosPerdidos(main.nomAr1);
            		main.J1JJ++;
            		main.J1JP++;
            		main.modificarEstadisticas(main.nomAr1, main.J1JJ, main.J1JG, main.J1JP);
            		System.out.println("Estadisticas del usuario 1:");
            		main.leerEstadistica(main.nomAr1);  
	   
		}else{
		    System.out.println(jugador2.getNombre()+" se ha quedado sin Pokemons!");
		    System.out.println(jugador1.getNombre()+" es el ganador!");
               		main.J1JJ = main.juegosJugados(main.nomAr1);
            		main.J1JG = main.juegosGanados(main.nomAr1);
            		main.J1JP = main.juegosPerdidos(main.nomAr1);
            		main.J1JJ++;
            		main.J1JG++;
            		main.modificarEstadisticas(main.nomAr1, main.J1JJ, main.J1JG, main.J1JP);
            		System.out.println("Estadisticas del usuario 1:");
            		main.leerEstadistica(main.nomAr1);
            		main.J2JJ = main.juegosJugados(main.nomAr2);
            		main.J2JG = main.juegosGanados(main.nomAr2);
            		main.J2JP = main.juegosPerdidos(main.nomAr2);
            		main.J2JJ++;
            		main.J2JP++;
            		main.modificarEstadisticas(main.nomAr2, main.J2JJ, main.J2JG, main.J2JP);
            		System.out.println("Estadisticas del usuario 2:");
            		main.leerEstadistica(main.nomAr2);  
		}
}

public int checarDebilitados(Jugador jug){
    int bandera = 0;
    int j=0;
    for(int i = 0; i<jug.getPokemons().size(); i++){
        if(jug.getPokemons().get(i).getEstado()=="Debilitado"){
            j++
        }
    }
    if(j == jug.getPokemons().size()){
        bandera = 1;
    }
    return bandera;
}
public int checarEstado(Pokemon poke){
    int estado = 0;
    if(poke.getEstado() == "Paralizado"){
        estado = 1;
    }else{
        if(poke.getEstado() == "Quemado"){
            estado = 2;
        }else{
            if(poke.getEstado() == "Envenenado"){
                estado = 3;
            }else{
                if(poke.getEstado() == "Debilitado"){
                    estado = 4;
                }

            }
        }
    }
    return estado;
}

public void eleccion(int ele, Jugador jug, Jugador jug2){
    switch (ele) {
        case 1:
            jug.getPokemonActivo().usarAtaque1(jug2.getPokemonActivo());
            break;
        case 2:
            jug.getPokemonActivo().usarAtaque2(jug2.getPokemonActivo());
            break;
        case 3:
            jug.listarPociones();
            break;
        case 4:
            jug.cambiarPokemon();
        default: //En teoria no deberiamos llegar a default
            System.out.println("Que raro, haz salido de la matrix");
            break;
    }
}

public void empezarTurno(Jugador jug){
    System.out.println(jug.getPokemonActivo().getApodo());
    System.out.println(jug.getPokemonActivo().getVida()+"/"jug.getPokemonActivo().getVidaMax());
    if(jug.getPokemonActivo().getEstado() != "Normal"){
        System.out.println(jug.getPokemonActivo().getEstado());
    }
    System.out.println(jug.getNombre()+"Que accion desea realizar?");
    System.out.println("-----Acciones-----");
    System.out.println("1. Usar "+jug.getPokemonActivo().getAtaque1()+"    2. Usar "+jug.getPokemonActivo().getAtaque2());
    System.out.println("3. Usar Pocion en el Pokemon Activo   4.Cambiar Pokemon");
}

public void turno(int estado, Jugador jug, Jugador jug2, int eleccion){
    if (estado == 1 && eleccion == 1 || eleccion == 2){
        System.out.println(jugador1.getPokemonActivo().getApodo()+" se encuentra paralizado, no se puede mover!!");
        jugador1.getPokemonActivo().setEstado("Normal");
        System.out.println(jugador1.getPokemonActivo().getApodo()+" se ha curado de la paralisis!!");
        
    }else{
        if(estado==2){
            System.out.println(jugador1.getPokemonActivo().getApodo()+" se resiente de la quemadura...");
            jugador1.getPokemonActivo().recibirdanio(3);
            eleccion(eleccion, jug, jug2);
        }else{
            if(estado==3){
                System.out.println(jugador1.getPokemonActivo().getApodo()+" esta envenenado");
                jugador1.getPokemonActivo().recibirdanio(2);
                eleccion(eleccion, jug, jug2);
            }else{
                if(estado==4){
                    System.out.println(jugador1.getPokemonActivo().getApodo()+" se debilitó!");
                    eleccion(4, jug, jug2);
                }
            }
        }
    }
}

