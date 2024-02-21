package co.edu.uniquindio.poo;

public abstract class Ropa {
    protected String talla;
    protected String color;
    protected String tela;

    public Ropa(String talla, String color, String tela){
        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getTela() {
        return tela;
    }

}