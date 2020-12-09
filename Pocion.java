import java.util.*;
import java.lang.Math.*;
/**
 * pocion
 */
public class Pocion {

    private String tipo;

    //Constructor
    public Pocion(String tipo){
        this.tipo = tipo;
    }

    public void usar(Pokemon poke){
        if(this.tipo == "Vida"){
            int recuperacion= Math.round((poke.vidaMax)*0.20);
            poke.vida+=recuperacion;
            System.out.println("Se han restaurado "+recuperacion+" PS a "+poke.apodo);
        }
        if(this.tipo == "Daño"){
            poke.daño+=Math.round(poke.daño*0.10);
            System.out.println("Se ha aumentado el daño de "+poke.apodo+" un 10%");
        }

        if(this.tipo == "Defensa" ){
            poke.defensa+=Math.round(poke.defensa*0.10);
            System.out.println("Se ha aumentado la defensa de "+poke.apodo+" un 10%");
        }
    }
}