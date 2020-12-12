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
        System.out.println(jugador1.getPokemonActivo().getApodo());
        System.out.println(jugador1.getPokemonActivo().getVida()+"/"jugador1.getPokemonActivo().getVidaMax());
        if(jugador1.getPokemonActivo().getEstado() != "Normal"){
            System.out.println(jugador1.getPokemonActivo().getEstado());
        }
        System.out.println(jugador1.getNombre()+"Que accion desea realizar?");
        System.out.println("-----Acciones-----");
        System.out.println("1. Usar "+jugador1.getPokemonActivo().getAtaque1()+"    2. Usar "+jugador1.getPokemonActivo().getAtaque2());
        System.out.println("3. Usar Pocion en el Pokemon Activo   4.Cambiar Pokemon");
        eleccion1 = scan.nextInt();
        while (eleccion1 <1 && eleccion1 >4){
            System.out.println("Ha elegido una opcion incorrecta, intentelo de nuevo");
            eleccion = scan.nextInt();
        }
        
        System.out.println(jugador2.getPokemonActivo().getApodo());
        System.out.println(jugador2.getPokemonActivo().getVida()+"/"jugador2.getPokemonActivo().getVidaMax());
        if(jugador1.getPokemonActivo().getEstado() != "Normal"){
            System.out.println(jugador2.getPokemonActivo().getEstado());
        }
        System.out.println(jugador2.getNombre()+"Que accion desea realizar?");
        System.out.println("-----Acciones-----");
        System.out.println("1. Usar "+jugador2.getPokemonActivo().getAtaque1()+"    2. Usar "+jugador2.getPokemonActivo().getAtaque2());
        System.out.println("3. Usar Pocion en el Pokemon Activo   4.Cambiar Pokemon");
        eleccion = scan.nextInt();
        while (eleccion2 <1 && eleccion2 >4){
            System.out.println("Ha elegido una opcion incorrecta, intentelo de nuevo");
            eleccion = scan.nextInt();
        }
        
        if(jugador1.getPokemonActivo().getVelocidad()>=jugador2.getPokemonActivo().getVelocidad()){
            if (checarEstado(jugador1.getPokemonActivo())==1 && eleccion1 == 1 || eleccion1 == 2){
                System.out.println(jugador1.getPokemonActivo().getApodo()+" se encuentra paralizado, no se puede mover!!");
                jugador1.getPokemonActivo().setEstado("Normal");
                System.out.println(jugador1.getPokemonActivo().getApodo()+" se ha curado de la paralisis!!");
                
            }else{
                if(checarEstado(jugador1.getPokemonActivo())==2){
                    System.out.println(jugador1.getPokemonActivo().getApodo()+" se resiente de la quemadura...");
                    jugador1.getPokemonActivo().recibirdanio(3);
                    eleccion(eleccion1, jugador1, jugador2);
                }else{
                    if(checarEstado(jugador1.getPokemonActivo())==3){
                        System.out.println(jugador1.getPokemonActivo().getApodo()+" esta envenenado");
                        jugador1.getPokemonActivo().recibirdanio(2);
                        eleccion(eleccion1, jugador1, jugador2);
                    }else{
                        checarEstado(jugador1.getPokemonActivo())==4){
                            System.out.println(jugador1.getPokemonActivo().getApodo()+" se debilitó!");
                            eleccion(4, jugador1, jugador2);
                        }
                    }
                }
            }
            if (checarEstado(jugador2.getPokemonActivo())==1 && eleccion2 == 1 || eleccion2 == 2){
                System.out.println(jugador2.getPokemonActivo().getApodo()+" se encuentra paralizado, no se puede mover!!");
                jugador2.getPokemonActivo().setEstado("Normal");
                System.out.println(jugador2.getPokemonActivo().getApodo()+" se ha curado de la paralisis!!");
                
            }else{
                if(checarEstado(jugador2.getPokemonActivo())==2){
                    System.out.println(jugador2.getPokemonActivo().getApodo()+" se resiente de la quemadura...");
                    jugador2.getPokemonActivo().recibirdanio(3);
                    eleccion(eleccion2, jugador2, jugador1);
                }else{
                    if(checarEstado(jugador2.getPokemonActivo())==3){
                        System.out.println(jugador2.getPokemonActivo().getApodo()+" esta envenenado");
                        jugador2.getPokemonActivo().recibirdanio(2);
                        eleccion(eleccion2, jugador2, jugador1);
                    }else{
                        checarEstado(jugador2.getPokemonActivo())==4){
                            System.out.println(jugador2.getPokemonActivo().getApodo()+" se debilitó!");
                            eleccion(4, jugador2, jugador1);
                        }
                    }
                }
            }
        }else{
            if (checarEstado(jugador2.getPokemonActivo())==1 && eleccion2 == 1 || eleccion2 == 2){
                System.out.println(jugador2.getPokemonActivo().getApodo()+" se encuentra paralizado, no se puede mover!!");
                jugador2.getPokemonActivo().setEstado("Normal");
                System.out.println(jugador2.getPokemonActivo().getApodo()+" se ha curado de la paralisis!!");
                
            }else{
                if(checarEstado(jugador2.getPokemonActivo())==2){
                    System.out.println(jugador2.getPokemonActivo().getApodo()+" se resiente de la quemadura...");
                    jugador2.getPokemonActivo().recibirdanio(3);
                    eleccion(eleccion2, jugador2, jugador1);
                }else{
                    if(checarEstado(jugador2.getPokemonActivo())==3){
                        System.out.println(jugador2.getPokemonActivo().getApodo()+" esta envenenado");
                        jugador2.getPokemonActivo().recibirdanio(2);
                        eleccion(eleccion2, jugador2, jugador1);
                    }else{
                        checarEstado(jugador2.getPokemonActivo())==4){
                            System.out.println(jugador2.getPokemonActivo().getApodo()+" se debilitó!");
                            eleccion(4, jugador2, jugador1);
                        }
                    }
                }
            }
            if (checarEstado(jugador1.getPokemonActivo())==1 && eleccion1 == 1 || eleccion1 == 2){
                System.out.println(jugador1.getPokemonActivo().getApodo()+" se encuentra paralizado, no se puede mover!!");
                jugador1.getPokemonActivo().setEstado("Normal");
                System.out.println(jugador1.getPokemonActivo().getApodo()+" se ha curado de la paralisis!!");
                
            }else{
                if(checarEstado(jugador1.getPokemonActivo())==2){
                    System.out.println(jugador1.getPokemonActivo().getApodo()+" se resiente de la quemadura...");
                    jugador1.getPokemonActivo().recibirdanio(3);
                    eleccion(eleccion1, jugador1, jugador2);
                }else{
                    if(checarEstado(jugador1.getPokemonActivo())==3){
                        System.out.println(jugador1.getPokemonActivo().getApodo()+" esta envenenado");
                        jugador1.getPokemonActivo().recibirdanio(2);
                        eleccion(eleccion1, jugador1, jugador2);
                    }else{
                        checarEstado(jugador1.getPokemonActivo())==4){
                            System.out.println(jugador1.getPokemonActivo().getApodo()+" se debilitó!");
                            eleccion(4, jugador1, jugador2);
                        }
                    }
                }
            }
        }

    }
    if(checarDebilitados(jugador1)==1){
        System.out.println(jugador1.getNombre()+"Se ha quedado sin Pokemons!");
        System.out.println(jugador2.getNombre()+"es el ganador!");
    }else{
        System.out.println(jugador2.getNombre()+"Se ha quedado sin Pokemons!");
        System.out.println(jugador1.getNombre()+"es el ganador!");
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

