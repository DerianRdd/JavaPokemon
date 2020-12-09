
public class Ataque {
    private String nombre;
    private String tipo;


    //Constructor

    public void Ataque(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
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
}