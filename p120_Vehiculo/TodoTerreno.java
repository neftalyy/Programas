package p120_Vehiculo;

public class TodoTerreno implements Vehiculo{
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es una Suv");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es una Suv");
    }

    public void traccion4X4() {
        System.out.println("Es un automóvil con tracción 4x4 es una Suv");
    }

    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente es una Suv");
    }
}
