package p119_Organismo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Perro miperro = new Perro("Lassie");
        System.out.println("Mi perro" + miperro.getNombre() + ", en accion:");
        miperro.respiracion();
        miperro.movimiento();
        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();
        System.out.println();

        Perico miperico = new Perico("Sparrow");
        System.out.println("Mi perico" + miperico.getNombre() + ", en acción:");
        miperico.respiracion();
        miperico.movimiento();
        miperico.multiCelular();
        miperico.sangreCaliente();
        miperico.volar();
        miperico.dosPatas();
        System.out.println(); 
    }
}
