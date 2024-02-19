package co.edu.uniquindio.poo;

public class EmpleadoTiempoParcial extends Empleado {
    private int numeroHoras; 
    private int salarioHora;
    
    public EmpleadoTiempoParcial(String nombre, String cargo, int numeroHoras, int salarioHora) {
        super(nombre, cargo);
        assert numeroHoras >= 0; 
        assert salarioHora > 0; 
        this.numeroHoras = numeroHoras;
        this.salarioHora = salarioHora;
    } 

    @Override
    public int calcularSalario(){
        assert numeroHoras >= 0;
        assert salarioHora > 0; 

        int salario = 0; 
        salario= numeroHoras*salarioHora; 
        return salario;
    }
    
    //metodos get 
    public int getNumeroHoras() {
        return numeroHoras;
    }
    
    public int getSalarioHora() {
        return salarioHora;
    }

}