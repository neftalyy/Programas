import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros ingresados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int mayor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int menor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\n\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
