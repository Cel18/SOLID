package co.edu.uniquindio.poo;

public class Perro extends Animal{

    public Perro(String nombre, int edad, String raza, int peso, Genero genero) {
        super(nombre, edad, raza, peso, genero);
    }

    @Override
    String emitirSonido() {
        return "guau";
    }
    
    @Override
    public void calcularCantidadMedicamento(){
        double cantidadMedicamento = peso*0.2;
        System.out.println("La cantidad de medicamento a administrar es: " + cantidadMedicamento + "ml");
    }
}
