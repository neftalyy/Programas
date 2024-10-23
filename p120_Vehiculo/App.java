package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Vochito", "Mario Diaz", 4);
        sedan.mostrarDetalles();

        System.out.println();

        Suv suv = new Suv("La mamalona", "Asaf Neftaly", 6);
        suv.mostrarDetalles();
    }
}
