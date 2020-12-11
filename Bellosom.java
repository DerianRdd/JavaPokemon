import java.util.Random;

public class Bellosom extends Pokemon {
    
    private String especie = "Bellosom";

    public Bellosom(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Látigo Cepa";
        this.ataque2="Mega Drenaje";
        this.tipo="Planta";
    }

    public String getEspecie() {
        return this.especie;
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        if(prob<8){
            System.out.println(this.apodo+" ha usado "+this.ataque2);
            int daño = ran.nextInt(20);
            if (daño<=0){
                System.out.println("El ataque no hizo nada!");
            }else{
                if((this.vida+daño)>=this.vidaMax){
                    daño=this.vidaMax-this.vida;
                }
                this.vida+=daño;
                poke.recibirDaño(daño);
                System.out.println(this.apodo+" absorbio "+daño+" PS de "+poke.apodo);
            }
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
