package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Finca {
    
    private String nombre;
    private Collection<Empleado> empleados;


    public Finca(String nombre) {
        this.nombre = nombre;
        this.empleados = new LinkedList<>();
    }
    
    //metodo para adicionar empleados que no existan en la finca
    public void adicionarEmpleado(Empleado empleado){
        boolean existeEmpleado = buscarEmpleadoPorNombre(empleado.getNombre()).isPresent(); 
        //assert !existeEmpleado: "no se pue ";

        if (!existeEmpleado) {
            empleados.add(empleado); 
        }
    }

    public Optional<Empleado> buscarEmpleadoPorNombre(String nombre){
        Predicate<Empleado> condicional= empleado -> empleado.getNombre().equals(nombre); 
        return empleados.stream().filter(condicional).findAny();
    }

    
    // metodo para listar empleados menor rendimiento, Empleados de Recoleccion y Tiempo parcial. 
    public Collection<Empleado> listarEmpleadosMenorRendimiento(){
        Collection<Empleado> empleadoConMenorRendimiento = new LinkedList<>();

        int promedioHorasTiempoParcial = calcularPromedioHoras(); 
        Predicate<Empleado> condicionalEmpleadosTiempoParcial = obtenerCondicionEmpleadoTiempoParcial();
        Predicate<EmpleadoTiempoParcial> condicionalMenorRendimientoTiempoParcial = empleado -> empleado.getNumeroHoras() < promedioHorasTiempoParcial;

        empleados.stream()
                    .filter(condicionalEmpleadosTiempoParcial)
                    .map(empleado -> (EmpleadoTiempoParcial) empleado)
                    .filter(condicionalMenorRendimientoTiempoParcial)
                    .forEach(empleado -> empleadoConMenorRendimiento.add(empleado));

                    
                    int promedioKilos = calcularPromedioKilos(); 
                    Predicate<Empleado> condicionalEmpleadoRecoleccion = obtenerCondicionEmpleadoRecoleccion(); 
                    Predicate<EmpleadoRecoleccion> condicionalEmpleadosRecoleccionMenorRendimiento = empleado -> empleado.getNumeroKilos() < promedioKilos; 
                    
                    empleados.stream()
                    .filter(condicionalEmpleadoRecoleccion)
                    .map(empleado -> (EmpleadoRecoleccion) empleado)
                    .filter(condicionalEmpleadosRecoleccionMenorRendimiento)
                    .forEach(empleado -> empleadoConMenorRendimiento.add(empleado));
                    
                    
                    return empleadoConMenorRendimiento;

    }

    public Collection<EmpleadoRecoleccion> listarEmpleadosRecoleccion(int numeroKilos){
        

        Predicate<Empleado> condicinalEmpleadosRecoleccion = obtenerCondicionEmpleadoRecoleccion(); 

        Collection<EmpleadoRecoleccion> empleadosRecoleccion = empleados.stream()
                                                                        .filter(condicinalEmpleadosRecoleccion)
                                                                        .map(empleado ->(EmpleadoRecoleccion)empleado)
                                                                        .filter(empleado -> empleado.getNumeroKilos() > numeroKilos)
                                                                        .sorted(Comparator.comparing(EmpleadoRecoleccion::getNumeroKilos))
                                                                        .toList();

        return empleadosRecoleccion; 

        /*                                                                 
        Collection<EmpleadoRecoleccion> empleadosRecoleccionMayorKilos = new LinkedList<>(); 
        for(EmpleadoRecoleccion empleadoRecoleccion: empleadosRecoleccion){
            if ( empleadoRecoleccion.getNumeroKilos() > numeroKilos ) {
                empleadosRecoleccionMayorKilos.add(empleadoRecoleccion);  
            }   
        }
        empleadosRecoleccionMayorKilos.stream().sorted(Comparator.comparing(EmpleadoRecoleccion::getNumeroKilos)).toList();
        return empleadosRecoleccionMayorKilos;
        */ 
    }   

    public Collection<Empleado> listarEmpleadosSalarioMayor(){

        double salarioPromedio = calcularPromedioSalario(); 

        Predicate<Empleado> condicion = empleado -> empleado.calcularSalario() > salarioPromedio;
        return empleados.stream()
                .filter(condicion)
                .sorted(Comparator.comparing(Empleado::getNombre))
                .toList();

    }

    public Collection<EmpleadoTiempoParcial> listarEmpleadosTiempoParcial(){
        Predicate<Empleado> condicionalEmpleadosTiempoParcial = obtenerCondicionEmpleadoTiempoParcial(); 
        Collection<EmpleadoTiempoParcial> empleadoTiempoParcial = empleados.stream().filter(condicionalEmpleadosTiempoParcial)
        .map(empleado -> (EmpleadoTiempoParcial)empleado).sorted(Comparator.comparing(Empleado::calcularSalario)).toList();

        return empleadoTiempoParcial; 
        
    }



    public int calcularPromedioHoras(){
        
        Predicate<Empleado> condicionalEmpleadosTiempoParcial = obtenerCondicionEmpleadoTiempoParcial();
        
        Collection<EmpleadoTiempoParcial> empleadosTiempoParcial = empleados.stream()
            .filter(condicionalEmpleadosTiempoParcial)
            .map(empleado -> (EmpleadoTiempoParcial) empleado)
            .collect(Collectors.toList());
        int horas = 0;
        int promedio = 0;
        for (EmpleadoTiempoParcial empleadoTiempoParcial : empleadosTiempoParcial) {
            horas += empleadoTiempoParcial.getNumeroHoras();
        }
        promedio = horas / empleadosTiempoParcial.size(); 

        return promedio; 
    }



    private Predicate<Empleado> obtenerCondicionEmpleadoTiempoParcial() {
        Predicate<Empleado> condicionalEmpleadosTiempoParcial = empleado -> {
                if (empleado instanceof EmpleadoTiempoParcial){
                    return true;
                }
                return false;
            };
        return condicionalEmpleadosTiempoParcial;
    }

    public int calcularPromedioKilos(){

        Predicate<Empleado> condicionalEmpleadosRecoleccion = obtenerCondicionEmpleadoRecoleccion();
        
        Collection<EmpleadoRecoleccion> empleadosRecoleccion = empleados.stream()
                                                                        .filter(condicionalEmpleadosRecoleccion)
                                                                        .map(empleado -> (EmpleadoRecoleccion) empleado)
                                                                        .collect(Collectors.toList());
        int kilos = 0;
        int promedio = 0;
        for (EmpleadoRecoleccion empleadoRecoleccion : empleadosRecoleccion) {
            kilos += empleadoRecoleccion.getNumeroKilos();
        }
        promedio = kilos / empleadosRecoleccion.size(); 

        return promedio; 
    }

    private Predicate<Empleado> obtenerCondicionEmpleadoRecoleccion() {
        Predicate<Empleado> condicionalEmpleadosRecoleccion = empleado -> {
                if (empleado instanceof EmpleadoRecoleccion){
                    return true;
                }
                return false;
            };
        return condicionalEmpleadosRecoleccion;
    }


    private double calcularPromedioSalario() {
    
        int salarios = 0;
        int promedio = 0; 

        for (Empleado empleado: empleados){
            salarios += empleado.calcularSalario();
        }
        promedio = salarios / empleados.size();

        return promedio;
    }
}