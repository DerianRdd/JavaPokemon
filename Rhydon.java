import java.util.Random;

public class Rhydon extends Pokemon {
    
    public Rhydon(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Magnitud";
        this.ataque2="Bofeton Lodo";
        this.tipo="Tierra";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            poke.velocidad -= 20;
            System.out.println("La velocidad de "+poke.apodo+" se ha reducido!");
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}

