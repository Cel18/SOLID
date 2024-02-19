package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado {

    private int salario;

    public EmpleadoTiempoCompleto(String nombre, String cargo, int salario) {
        super(nombre, cargo);
        assert salario > 0; 
        this.salario = salario;
    }

    
    public int calcularSalario() {
        return getSalario();
    }

    // metodos get

    public int getSalario() {
        return salario;
    }

}