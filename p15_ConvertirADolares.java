// Convertir pesos a dolares 

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en pesos: ");
        double pesos = scanner.nextDouble();

        System.out.print("Ingresa la cotización del dólar: ");
        double cotizacionDolar = scanner.nextDouble();
        double dolares = pesos / cotizacionDolar;
        
        System.out.println(String.format("El equivalente en dólares es: %.2f", dolares));
        
    }
}
