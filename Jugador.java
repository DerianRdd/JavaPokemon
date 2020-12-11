import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
    private String nombre;
    private ArrayList<Pocion> pociones;
    private ArrayList<Pokemon> pokemons;

    public void Jugador(String nombre){
        this.nombre=nombre;
        Pocion Vida1 = new Pocion("Vida");
        Pocion Vida2 = new Pocion("Vida");
        Pocion Ataque1 = new Pocion("Ataque");
        Pocion Ataque2 = new Pocion("Ataque");
        Pocion Defensa1 = new Pocion("Defensa");
        Pocion Defensa2 = new Pocion("Defensa");
        this.pociones.add(Vida1);
        this.pociones.add(Vida2);
        this.pociones.add(Ataque1);
        this.pociones.add(Ataque2);
        this.pociones.add(Defensa1);
        this.pociones.add(Defensa2);

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public ArrayList<Pocion> getPociones() {
        return this.pociones;
    }

    public ArrayList<Pokemon> getPokemones() {
        return this.pokemons;
    }

    public void listarPokemons(){
        int i = 0;
        for(i=0; i<pokemons.size();i++){
            System.out.println(i+". "+pokemons.get(i));
        }
    }

    public void usarPocion(int poc){
        pociones.get(poc).usar(pokemons.get(0));
        pociones.remove(poc);
    }

    public void cambiarPokemon(){
        Scanner s = new Scanner(System.in);
        int poke = 0;
        System.out.println("Elija el pokemon al que desea cambiar :");
        listarPokemons();
        do{
            poke = s.nextInt();
            if (poke<=1 || poke > pokemons.size() ){
                System.out.println("Ha elegido un pokemon no valido, intentelo de nuevo");
            }else{
                if((!pokemons.get(poke-1).estado.equals("Debilitado"))){
                Pokemon temp = pokemons.get(0);
                pokemons.set(0, pokemons.get(poke-1));
                pokemons.set(poke-1,temp);
            }else{
                System.out.println("El pokemon elegido esta debilitado, elija otro");
            }
            }
        }while(poke==0);
        s.close();
    }
    
    
}
