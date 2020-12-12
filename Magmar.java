import java.util.Random;

public class Magmar extends Pokemon {
    

    public Magmar(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Lanzallamas";
        this.ataque2="Rueda Fuego";
        this.tipo="Fuego";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        int quemar = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
                if(quemar <=7){
                    poke.estado = "Quemado";
                    System.out.println(ataque2+" ha quemado a "+poke.apodo+"!");
                }
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}
