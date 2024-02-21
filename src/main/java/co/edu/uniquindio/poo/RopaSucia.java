package co.edu.uniquindio.poo;

public class RopaSucia extends Ropa implements Lavado {

    public RopaSucia(String talla, String color, String tela){
        super(talla, color, tela);

        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    @Override
    public void lavarRopa() {
        //Lavado de ropa sucia
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getTalla() {    
        return super.getTalla();
    }

    @Override
    public String getTela() {
        return super.getTela();
    }
}


/*
public class RopaSucia extends Ropa implements AseoRopa {

    public RopaSucia(String talla, String color, String tela){
        super(talla, color, tela);

        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    @Override
    public void lavarRopa() {
        //Lavado de ropa sucia
    }

    @Override 
    public void guardarRopa(){
        //Para qué guardarías ropa sucia?
    }

}
*/