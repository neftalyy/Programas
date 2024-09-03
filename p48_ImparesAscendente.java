//Impares ascendente desde 1 hasta n

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduce un número: ");
            int n = scanner.nextInt();
            int suma = 0;
            int cantidad = 0;
            int i = 1;

            System.out.print("Numeros impares entre 1 y ? " + n + ": ");
            while (i <= n) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    suma += i;
                    cantidad++;
                }
               i++;
            }

            double promedio = (double) suma / cantidad;

            System.out.println("\nSuma: " + suma);
            System.out.println("Promedio: " + promedio);
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S"));

        scanner.close();
    }
}

