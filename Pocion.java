/**
 * pocion
 */
public class Pocion{
    
    private String tipo;

    //Constructor
    public Pocion(String tipo){
        this.tipo = tipo;
    }

    /**getters y setters
     * @param tipo
    */
    public String getTipo() {
        return this.tipo;
    }

    
    /** 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    
    /** 
     * @param poke
     */
    public void usar(Pokemon poke){
        if(this.tipo == "Vida"){
            int recuperacion= (int)(poke.getVidaMax()*0.20);
            if((poke.getVida()+recuperacion)>=poke.getVidaMax()){
                recuperacion=poke.getVidaMax()-poke.getVida();
            }
            poke.setVida(poke.getVida()+recuperacion);
            System.out.println("Se han restaurado "+recuperacion+" PS a "+poke.getApodo());
        }
        if(this.tipo == "danio"){
            int ataque = (int)(poke.getAtaque()*0.10);
            poke.setAtaque(poke.getAtaque()+ataque);
            System.out.println("Se ha aumentado el danio de "+poke.getApodo()+" un 10%");
        }

        if(this.tipo == "Defensa" ){
            int defensa = (int)(poke.getDefensa()*0.10);
            poke.setDefensa(poke.getDefensa()+defensa);
            System.out.println("Se ha aumentado la defensa de "+poke.getApodo()+" un 10%");
        }
    }
    @Override
	public String toString() {
		return tipo;
	}

}
