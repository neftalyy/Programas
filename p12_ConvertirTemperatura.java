// Temperaturas de grados fahrenheit a grados celsius

import java.util.Scanner;

public class p12_ConvertirTemperatura  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(String.format("La temperatura en grados Celsius es: %.2f", celsius));

    }
}
