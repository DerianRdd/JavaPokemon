import java.util.Random;

public class Jolteon extends Pokemon {

    public Jolteon(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Rayo";
        this.ataque2="Onda Trueno";
        this.tipo="Electrico";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int paralizar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
                if(paralizar <=8){
                    poke.estado = "Paralizado";
                    System.out.println(ataque2+" ha paralizado a "+poke.apodo+"!");
                }
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}