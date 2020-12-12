import java.util.Random;

public class Seviper extends Pokemon {

    public Seviper(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Acido";
        this.ataque2="Cola Veneno";
        this.tipo="Veneno";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int envenenar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            poke.velocidad -= 40;
            System.out.println("La velocidad de "+poke.apodo+"se ha reducido!");
                if(envenenar <=5){
                    poke.estado = "Envenenado";
                    System.out.println(ataque2+" ha envenenado a"+poke.apodo+"!");
                }
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
