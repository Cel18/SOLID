package co.edu.uniquindio.poo;

public class Perro extends Animal{

    public Perro(String nombre, int edad, String raza, int peso, Genero genero) {
        super(nombre, edad, raza, peso, genero);
    }

    @Override
    String emitirSonido() {
        return "guau";
    }
    
}
