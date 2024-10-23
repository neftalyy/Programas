package p120_Vehiculo;

public class Maquina {
    String nombre;
    String propietario;
    int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public void repostar() {
        System.out.println("Respontando ...");
    }

    public void arrancar() {
        System.out.println("Arrancando ...");

    }

    public void frenar() {
        System.out.println("Frenando ...");
    }

    public void mostrarInformacion() {
        System.out.println("Maquina [Nombre =]" + nombre + ", Propietario =" + propietario);
    }
}
