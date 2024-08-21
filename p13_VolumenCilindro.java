// Calcular el volumen de un cilindro dado su radio y altura,

import java.util.Scanner;

public class  p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();
        double volumen = Math.PI * (radio * radio) * altura;

        System.out.println(String.format("El volumen del cilindro es: %.2f unidades cúbicas", volumen));

    }
}
