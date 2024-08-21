// Sacar hipotenusa de un triangulo rectangulo

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingresa el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        double cateto1cu = cateto1 * cateto1;
        double cateto2cu = cateto2 * cateto2;
        double raiz = cateto1cu + cateto2cu;
        double hipo = Math.sqrt(raiz);

        System.out.println(String.format("Cateto 1: %.2f", cateto1));
        System.out.println(String.format("Cateto 2: %.2f", cateto2));
        System.out.println(String.format("Suma de cuadrados: %.2f", raiz));
        System.out.println(String.format("Hipotenusa: %.2f", hipo));

    }
}
