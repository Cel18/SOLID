package co.edu.uniquindio.poo;

public class RopaLimpia extends Ropa implements Guardado{

    public RopaLimpia(String talla, String color, String tela){
        super(talla, color, tela);

        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    @Override
    public void guardarRopa() {
        //Guardado de ropa limpia
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
public class RopaLimpia extends Ropa implements AseoRopa{
    public RopaLimpia(String talla, String color, String tela){
        super(talla, color, tela);

        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    @Override
    public void guardarRopa() {
        //Guardado de ropa limpia
    }

    @Override
    public void lavarRopa(){
        //Para qué lavarías la ropa que ya está limpia?
    }
}

*/