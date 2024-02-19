package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());
    @Test
    public void verificarDatosNulosEmpleadoTC(){
        LOG.info("Inicio de prueba para verificar si hay datos nulos.");
        assertThrows((Throwable.class ), () -> new EmpleadoTiempoCompleto(null, null, 0)); 
        LOG.info("Termina prueba para verificar si hay datos nulos.");

    }

    @Test
    public void verificarDatosNulosEmpleadoTP(){
        LOG.info("Inicio de prueba para verificar si hay datos nulos.");
        assertThrows((Throwable.class ), () -> new EmpleadoTiempoParcial(null, null, 0, 0)); 
        LOG.info("Termina prueba para verificar si hay datos nulos.");

    }

    @Test
    public void verificarDatosNulosEmpleadoR(){
        LOG.info("Inicio de prueba para verificar si hay datos nulos.");
        assertThrows((Throwable.class ), () -> new EmpleadoRecoleccion(null, null, 0, 0));
        LOG.info("Termina prueba para verificar si hay datos nulos.");

    }

    @Test 
    public void verificarDatosIgualesEmpleadoTC(){
        LOG.info("Inicio de prueba para verificar si los datos son iguales.");
        Empleado empleado1 = new EmpleadoTiempoCompleto("Amyi", "ingeniero", 10000000); 
        assertEquals("Amyi", empleado1.getNombre()); 
        assertEquals("ingeniero", empleado1.getCargo());
        //assertEquals(10000000, empleado1.getSalario());
        LOG.info("Termina prueba para verificar si los datos son iguales.");
    }

    /*@Test 
    public void verificarDatosIgualesEmpleadoTP(){
        LOG.info("Inicio de prueba para verificar si los datos son iguales.");
        Empleado empleado1 = new EmpleadoTiempoParcial("Celeste", "recursos humanos", 8, 4000); 
        assertEquals("Celeste", empleado1.getNombre()); 
        assertEquals("recursos humanos", empleado1.getCargo());
        assertEquals(8, empleado1.getNumeroHoras());
        assertEquals(4000, empleado1.getSalarioHora());
        LOG.info("Termina prueba para verificar si los datos son iguales.");
    }

    @Test 
    public void verificarDatosIgualesEmpleadoR(){
        LOG.info("Inicio de prueba para verificar si los datos son iguales.");
        Empleado empleado1 = new EmpleadoRecoleccion("Karol", "granjero", 10, 15000); 
        assertEquals("Karol", empleado1.getNombre()); 
        assertEquals("granjero", empleado1.getCargo());
        assertEquals(10, empleado1.getNumeroKilos());
        assertEquals(15000, empleado1.getSalarioKilo());
        LOG.info("Termina prueba para verificar si los datos son iguales.");
    }*/

    @Test 
    public void salarioNegativoEmpleadoTC(){
         LOG.info("Inicio de prueba para verificar que los datos sean negativos.");
         Empleado empleado2 = new EmpleadoTiempoCompleto("Katerine", "secretaria", -5000000);
         assert empleado2.getSalarioHora > 0;
    }

    @Test 
    public void salarioNegativoEmpleadoTP(){
         LOG.info("Inicio de prueba para verificar que los datos sean negativos.");
         Empleado empleado2 = new EmpleadoTiempoParcial("candy", "Gato profesional", 8, -4000);
         assert empleado2.getSalarioHora > 0;
    }

    @Test 
    public void salarioNegativoEmpleadoR(){
         LOG.info("Inicio de prueba para verificar que los datos sean negativos.");
         Empleado empleado2 = new EmpleadoRecoleccion("Tom", "vendedor", 6, -15000);
         assert empleado2.getSalarioHora > 0;
    }

}
