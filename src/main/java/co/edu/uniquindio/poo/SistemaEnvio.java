package co.edu.uniquindio.poo;

public class SistemaEnvio {
    private InterfaceCompaniaEnvios companiaEnvio; 

    public SistemaEnvio(InterfaceCompaniaEnvios companiaEnvio) {
        this.companiaEnvio = companiaEnvio;
    }
    public void enviarPaquete(Paquete paquete) {
        companiaEnvio.enviarPaquete(paquete);
    }
}
