import java.util.Random;

public class Swampert extends Pokemon {
    

    public Swampert(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Burbuja";
        this.ataque2="Agua Lodosa";
        this.tipo="Agua";
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            poke.velocidad -= 30;
            System.out.println("La velocidad de "+poke.apodo+" bajo!");
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }
}