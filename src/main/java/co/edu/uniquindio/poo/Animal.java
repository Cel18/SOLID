package co.edu.uniquindio.poo;

abstract class Animal {
    
    private String nombre;
    private int edad;
    private String raza;
    private int peso;
    private Genero genero;

    public Animal(String nombre, int edad, String raza, int peso, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.genero = genero;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    abstract String emitirSonido ();

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public int getPeso() {
        return peso;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}