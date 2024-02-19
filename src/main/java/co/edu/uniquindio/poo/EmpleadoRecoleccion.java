package co.edu.uniquindio.poo;

public class EmpleadoRecoleccion extends Empleado {
    private int numeroKilos; 
    private int valorKilo;

    public EmpleadoRecoleccion(String nombre, String cargo, int numeroKilos, int valorKilo) {
        super(nombre, cargo);
        assert numeroKilos >= 0;
        assert valorKilo > 0;
        this.numeroKilos = numeroKilos;
        this.valorKilo = valorKilo;
    } 
    
    @Override
    public int calcularSalario() {
        assert numeroKilos >= 0;
        assert valorKilo > 0; 
        
        int salario = 0; 
        salario = numeroKilos * valorKilo; 
        return salario;
    }

    //metodos get
    public int getNumeroKilos() {
        return numeroKilos;
    }

    public int getValorKilo() {
        return valorKilo;
    }

}