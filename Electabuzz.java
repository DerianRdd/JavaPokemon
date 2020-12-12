import java.util.Random;

public class Electabuzz extends Pokemon {

    public Electabuzz(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Rayo";
        this.ataque2="Puño Trueno";
        this.tipo="Electrico";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int paralizar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            int danio = this.ataque-poke.defensa;
            if (danio<=0){
                System.out.println("El ataque no hizo nada!");
            }else{
                if(paralizar <=5){
                    poke.estado = "Paralizado";
                    System.out.println(ataque2+" ha paralizado a "+poke.apodo+"!");
                }
            }
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}
