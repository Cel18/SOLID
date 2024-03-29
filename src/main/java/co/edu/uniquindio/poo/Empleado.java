package co.edu.uniquindio.poo;

public abstract class Empleado {
    
    public final int getSalarioHora = 1000;
    protected String nombre; 
    protected String cargo;
    

    public Empleado(String nombre, String cargo) {
        assert nombre != null; 
        assert cargo != null; 
        this.nombre = nombre;
        this.cargo = cargo;
    } 

    public abstract int calcularSalario(); 
    //no hay implementacion del metodo

       
    // metodos get     

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

}
