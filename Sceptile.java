public class Sceptile extends Pokemon {
    
    private String especie = "Sceptile";

    public Sceptile(String apodo, int vidaMax, int vida, int ataque, int defensa, int velocidad, String estado){
        super(apodo,vidaMax,ataque,defensa,velocidad);
        this.ataque1="Látigo Cepa";
        this.ataque2="Hoja Aguda";
        this.tipo="Planta";
    }

    public String getEspecie() {
        return this.especie;
    }
}