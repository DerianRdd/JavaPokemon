import java.util.Random;

public class Pokemon {
    protected String apodo;
    protected int vidaMax;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected String tipo;
    protected String estado;
    protected String ataque1;
    protected String ataque2;



    public Pokemon(String apodo, int vidaMax, int ataque, int defensa, int velocidad, String estado) {
        this.apodo = apodo;
        this.vidaMax = vidaMax;
        this.vida = this.vidaMax;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.estado = estado;
    }

    public String getApodo() {
        return this.apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getVidaMax() {
        return this.vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAtaque1() {
        return this.ataque1;
    }

    public void setAtaque1(String ataque1) {
        this.ataque1 = ataque1;
    }

    public String getAtaque2() {
        return this.ataque2;
    }

    public void setAtaque2(String ataque2) {
        this.ataque2 = ataque2;
    }

    public double multiplicador(String tipo){
        double multiplicador = 0;
        if(this.tipo == "Fuego" && tipo == "Planta"){
            multiplicador = 2;
        }else{
            if(this.tipo == "Fuego" && tipo == "Agua" || tipo == "Tierra"){
                multiplicador = 0.5;
            }else{
                if(this.tipo == "Planta" && tipo == "Tierra" || tipo == "Agua"){
                    multiplicador = 2;
                }else{
                    if(this.tipo == "Planta" && tipo == "Fuego" || tipo == "Veneno"){
                        multiplicador = 0.5;
                    }else{
                        if(this.tipo == "Tierra" && tipo == "Fuego" || tipo == "Veneno" || tipo == "Electrico"){
                            multiplicador = 2;
                        }else{
                            if(this.tipo == "Tierra" && tipo == "Planta" || tipo == "Agua"){
                                multiplicador = 0.5;
                            }else{
                                if(this.tipo == "Agua" && tipo == "Fuego" || tipo == "Tierra"){
                                    multiplicador = 2;
                                }else{
                                    if(this.tipo == "Agua" && tipo == "Planta" || tipo == "Electrico"){
                                        multiplicador = 0.5;
                                    }else{
                                        if(this.tipo == "Veneno" && tipo == "Planta"){
                                            multiplicador = 2;
                                        }else{
                                            if(this.tipo == "Veneno" && tipo == "Tierra"){
                                                multiplicador = 0.5;
                                            }else{
                                                if(this.tipo == "Electrico" && tipo == "Agua"){
                                                    multiplicador = 2;
                                                }else{
                                                    if(this.tipo == "Electrico" && tipo == "Tierra"){
                                                        multiplicador = 0;
                                                    }else{
                                                        multiplicador = 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return multiplicador;
    }
    
    public void recibirdanio(int danio){
        if((this.vida-danio)<=0){
            this.vida = 0;
            this.estado = "Debilitado";
            System.out.println("El pokemon se ha debilitado!");
        }else{
            this.vida-=danio;
        }
    }

    public void usarAtaque1(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque1);
        if(prob<8){    
            int danio = (int)((this.ataque-poke.defensa)*(multiplicador(poke.tipo)));
            if (danio<=0){
            System.out.println("El ataque no hizo nada!");
            }else{
                if(multiplicador(poke.tipo)==2){
                    System.out.println("Es muy efectivo!"); 
                }else{
                    if(multiplicador(poke.tipo)==0.5){
                        System.out.println("No es muy efectivo");
                    }
                }
                poke.recibirdanio(danio);
            }
        }else{
            System.out.println(this.apodo+" fallo");
        }
    }

    public void usarAtaque2(Pokemon poke){
        Random ran = new Random();
        int prob = ran.nextInt(10);
        System.out.println(this.apodo+" ha usado "+this.ataque2);
        if(prob<8){
            int danio = this.ataque-poke.defensa;
            if (danio<=0){
                System.out.println("El ataque no hizo nada!");
            }else{
                poke.recibirdanio(danio);
            }
        }else{
            System.out.println(this.apodo+" fallo");
        } 
    }

	@Override
	public String toString() {
		return apodo+System.lineSeparator()+estado+System.lineSeparator()+vida+" PS";
	}

    
}



