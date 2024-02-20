package co.edu.uniquindio.poo;

public class Tutor {
    
    private String nombre;
    private String numeroIdentificaion;
    private String email;
    private int celular;
    private Animal animal;

    public Tutor(String nombre, String numeroIdentificacion, String email, int celular, Animal animal) {
        this.nombre = nombre;
        this.numeroIdentificaion = numeroIdentificacion;
        this.email = email;
        this.celular = celular;
        this.animal = animal;
    }

    public void llevarAlVeterinario(Animal animal) {
        System.out.println("llevando a " + animal.getNombre() + " a la veterinaria");
    }
    
    /*public void registrarAnimal(Animal animal) {
        System.out.println("Registrando a " + animal.getNombre());
    }*/

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificaion() {
        return numeroIdentificaion;
    }

    public String getEmail() {
        return email;
    }

    public int getCelular() {
        return celular;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
}