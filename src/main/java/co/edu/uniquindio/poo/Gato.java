package co.edu.uniquindio.poo;

public class Gato extends Animal{

    public Gato(String nombre, int edad, String raza, int peso, Genero genero) {
        super(nombre, edad, raza, peso, genero);
    }

    @Override
    String emitirSonido() {
        return "miau";
    }
    
}
