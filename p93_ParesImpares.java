import java.util.Random; 

public class p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX]; 
        Random random = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21); 
        }

        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }

        int cuentaPares = 0;
        System.out.println("\n\nElementos pares del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                cuentaPares++;
            }
        }

        int cuentaImpares = 0;
        System.out.println("\n\nElementos impares del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                cuentaImpares++;
            }
        }

        System.out.println("\n\nCantidad de números pares: " + cuentaPares);
        System.out.println("Cantidad de números impares: " + cuentaImpares);
    }  
}

