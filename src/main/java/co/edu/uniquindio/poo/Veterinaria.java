package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {
    
    private String nombre;
    private Collection<Tutor> tutores;
    private Collection<Animal> animales;

    public Veterinaria(String nombre) {
        this.nombre = nombre;
        this.tutores = new LinkedList<>();
        this.animales = new LinkedList<>();
    }
    
    public void registrarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Registrando a " + animal.getNombre());
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public Collection<Tutor> getTutores() {
        return tutores;
    }

    public Collection<Animal> getAnimales() {
        return animales;
    }

    public void setTutores(Collection<Tutor> tutores) {
        this.tutores = tutores;
    }

    public void setAnimales(Collection<Animal> animales) {
        this.animales = animales;
    }

}
