package p120_Vehiculo;

public class Suv extends Maquina {
    TodoTerreno todoTerreno;

    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
        todoTerreno = new TodoTerreno();
    }

    public void mostrarDetalles() {
        mostrarInformacion();
        todoTerreno.combustionInterna();
        todoTerreno.chasisIndependiente();
        repostar();
        arrancar();
        frenar();
    }
}
