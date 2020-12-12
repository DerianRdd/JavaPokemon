import java.util.Random;

public class Venonat extends Pokemon {

    public Venonat(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Acido";
        this.ataque2="Polvo Veneno";
        this.tipo="Veneno";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int envenenar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8 && envenenar <=7){
            poke.estado = "Envenenado";
            System.out.println(ataque2+" ha envenenado a "+poke.apodo+"!");
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}
