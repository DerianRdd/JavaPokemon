import java.util.Random;

public class Bellosom extends Pokemon {
    

    public Bellosom(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Látigo Cepa";
        this.ataque2="Mega Drenaje";
        this.tipo="Planta";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            int danio = ran.nextInt(20);
            if (danio<=0){
                System.out.println("El ataque no hizo nada!");
            }else{
                if((this.vida+danio)>=this.vidaMax){
                    danio=this.vidaMax-this.vida;
                }
                this.vida+=danio;
                poke.recibirdanio(danio);
                System.out.println(this.apodo+" absorbio "+danio+" PS de "+poke.apodo);
            }
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
