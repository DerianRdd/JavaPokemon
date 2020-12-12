import java.util.Random;

public class Blaziken extends Pokemon {
    

    public Blaziken(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Lanzallamas";
        this.ataque2="Patada Ignea";
        this.tipo="Fuego";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int quemar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            int danio = this.ataque-poke.defensa;
            if (danio<=0){
                System.out.println("El ataque no hizo nada!");
            }else{
                if(quemar <=5){
                    poke.estado = "Quemado";
                    System.out.println(ataque2+" ha quemado a"+poke.apodo+"!");
                }
            }
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
