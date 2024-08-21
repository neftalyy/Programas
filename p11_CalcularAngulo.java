// Calcular el 3er ángulo de un Triángulo dados los dos primeros Ángulos del mismo

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor del primer ángulo: ");
        double angulo1 = scanner.nextDouble();
        System.out.print("Ingresa el valor del segundo ángulo: ");
        double angulo2 = scanner.nextDouble();
        double angulo3 = 180.0 - (angulo1 + angulo2);
        System.out.println(String.format("El tercer ángulo es: %.2f grados", angulo3));
    }
}
