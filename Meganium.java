import java.util.Random;

public class Meganium extends Pokemon {

    public Meganium(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad,estado);
        this.ataque1="Latigo Cepa";
        this.ataque2="Recurrente";
        this.tipo="Planta";
    }


    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int golpe = ran.nextInt(10);
        int prob = ran.nextInt(10);
        int cantidad;
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            int danio;
            if(golpe <= 2){
            cantidad = 2;
            }else{
                if (golpe>=3 && golpe <=5) {
                      cantidad = 3;
                } else {
                    if (golpe>=6 && golpe <=7) {
                        cantidad = 4;
                    } else {
                        cantidad = 5;
                       }
                   }
               }

            for(int i = 0; i<cantidad; i++){
                danio = ran.nextInt(16);
                poke.recibirdanio(danio);
                System.out.println("Ataque "+i+" hizo "+danio+ " de danio");
            }       
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
