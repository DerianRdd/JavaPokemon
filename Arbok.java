import java.util.Random;

public class Arbok extends Pokemon {
    

    public Arbok(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Acido";
        this.ataque2="Toxico";
        this.tipo="Veneno";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int envenenar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            int danio = this.ataque-poke.defensa;
            if (danio<=0){
                System.out.println("El ataque no hizo nada!");
            }else{
                if(envenenar <=5){
                    poke.estado = "Envenenado";
                    System.out.println(ataque2+" ha envenenado a "+poke.apodo+"!");
                }
            }
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}
