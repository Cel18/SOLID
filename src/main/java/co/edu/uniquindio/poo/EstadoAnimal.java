package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class EstadoAnimal {
    private Collection<Animal> animales;

    public EstadoAnimal(Collection<Animal> animales) {
        this.animales = new LinkedList<>();
    }
    
    public static void imprimirSonidoAnimales(Collection<Animal> animales){  
        for (Animal animal : animales) {
            System.out.println(animal.emitirSonido());
        }
    }

    /*public void imprimirSonidoPerro() {
        System.out.println("El perro hace: guau");
    }
    
    public void imprimirSonidoGato() {
        System.out.println("El gato hace: miau");
    }

    public void imprimirSonidoConejo() {
        System.out.println("el conejo hace: ñam ñam");
    }*/

    //getters and setters
    public Collection<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(Collection<Animal> animales) {
        this.animales = animales;
    }
    
}
