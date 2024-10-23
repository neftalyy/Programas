package p120_Vehiculo;

public class Sedan extends Maquina {
    Familiar familiar;

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
        familiar = new Familiar();
    }

    public void mostrarDetalles() {
        mostrarInformacion();
        familiar.sistemaElectrico();
        familiar.combustionInterna();
        familiar.carroceriaTres();
        familiar.chasisMonocasco();
        repostar();
        arrancar();
        frenar();
    }
    
}
