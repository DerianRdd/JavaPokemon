import java.util.Random;

public class Meganium extends Pokemon {
    
    private String especie = "Meganium";

    public Meganium(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Látigo Cepa";
        this.ataque2="Recurrente";
        this.tipo="Planta";
    }

    public String getEspecie() {
        return this.especie;
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int golpe = ran.nextInt(10);
        int prob = ran.nextInt(10);
        int cantidad;
        if(prob<8){
            System.out.println(this.apodo+" ha usado "+this.ataque2);
            int daño;
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
                daño = ran.nextInt(16);
                poke.recibirDaño(daño);
                System.out.println("Ataque "+i+" hizo "+daño+ "de daño");
            }       
        }else{
            System.out.println(this.apodo+"fallo");
        } 
    }
}
