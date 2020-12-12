import java.util.Random;

public class Torkoal extends Pokemon {

    public Torkoal(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Lanzallamas";
        this.ataque2="Sofoco";
        this.tipo="Fuego";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int bajarAtk = ran.nextInt(26);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            poke.ataque -=  bajarAtk;
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
