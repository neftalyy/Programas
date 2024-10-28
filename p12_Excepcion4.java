public class p12_Excepcion4 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        int a[] = {10,20,30,40};

        System.out.println("Los elementos del arreglo son: ");
        for (int i : a) {
            System.out.println(i+" ");
        }
        System.out.println("\nQue posicion del arreglo ");
    }
}
