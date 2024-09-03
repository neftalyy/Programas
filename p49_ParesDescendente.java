//Pares de manera decendente

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = ""; 

        do {
        System.out.print("Introduce un número (menor o igual a 100): ");
        int n = scanner.nextInt();

            
        if (n > 100) {
            System.out.println("El número debe ser menor o igual a 100.");
            continue;
            }

            int suma = 0;
            int cantidad = 0;
            int i = 100;
            System.out.print("Números pares entre 100 y " + n + ": ");
            while (i >= n) {
                if (i % 2 == 0) {
            System.out.print(i + " ");

            suma += i;
                cantidad++;
                }
                i--;
            }
           double promedio = (cantidad > 0) ? (double) suma / cantidad : 0;
            System.out.println("\nLa suma: " + suma);
            System.out.println("El promedio: " + promedio);
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next(); 

        } while (continuar.equalsIgnoreCase("S"));

        scanner.close();
    }
}

