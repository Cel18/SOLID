package co.edu.uniquindio.poo;

abstract class Animal {
    
    private String nombre;
    private int edad;
    private String raza;
    public int peso;
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

    public abstract void calcularCantidadMedicamento ();

    /*Animal[] arrayAnimals = {
        new Gato("Michi", 5, "Siamés", 3, "Hembra"),
        new Perro("Zeus", 24, "pitbull", 3, "Macho")
    };

    public void calcularCantidadMedicamento(){
        for (Animal animal : arrayAnimals) {
            if (animal instanceof Gato){
                double cantidadMedicamento = peso * 0.1;
                System.out.println("La cantidad de Medicamento a administrar para el gato es: " + cantidadMedicamento + "ml");
            }
            if (animal instanceof Perro){
                double cantidadMedicamento = peso * 0.2;
                System.out.println("La cantidad de Medicamento a administrar para el perro es: " + cantidadMedicamento + "ml");
            }
            else System.out.println("Datos incorrectos");
        }
    }*/

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