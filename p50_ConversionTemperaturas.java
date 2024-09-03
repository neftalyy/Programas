//Converstir temperatura 

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta = " "; 

        do {
            System.out.print("Introduce la temperatura inicial en grados centígrados: ");
            int tempInicial = scanner.nextInt();

            System.out.print("Introduce la temperatura final en grados centígrados: ");
            int tempFinal = scanner.nextInt();


        if (tempFinal < tempInicial) {
            System.out.println("El valor final no puede ser menor que el inicial.");
            continue;
        }

            System.out.println("------------------------------------");
            System.out.println("Centígrados  Fahrenheit");
            System.out.println("------------------------------------");

            int tempActual = tempInicial;
            while (tempActual <= tempFinal) {
                double fahrenheit = (tempActual * 9.0 / 5.0) + 32.0;
                System.out.printf("%-12d %.1f%n", tempActual, fahrenheit);
                tempActual++;
            }

            System.out.println("------------------------------------");

            System.out.print("¿Deseas continuar (S/N)? ");
            respuesta = scanner.next(); 

        } while (respuesta.equalsIgnoreCase("S"));

        scanner.close();
    }
}
