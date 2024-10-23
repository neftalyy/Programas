package p120_Vehiculo;

public class Familiar implements Vehiculo {
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es un Sedan");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es un Sedan");
    }

    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carrocería en tres partes es un Sedan");
    }

    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
}

