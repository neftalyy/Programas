import java.util.Scanner;  // El import debe estar fuera de la clase

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();

        float[] calificaciones = new float[n];

        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (float calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }

        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.println("\n\nSuma de las calificaciones: " + suma);
        System.out.println("Promedio de las calificaciones: " + promedio);

        int contadorMayorPromedio = 0;
        System.out.println("\nCalificaciones mayores al promedio:");
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.println(calificacion);
                contadorMayorPromedio++;
            }
        }

        System.out.println("Cantidad de calificaciones mayores al promedio: " + contadorMayorPromedio);
    }
}
