//Angulos 

import java.util.Scanner;

public class p80_Angulo {

    public static String tipoDeAngulo(int angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else {
            return "Desconocido"; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angulo;

        System.out.print("Ingrese un ángulo (0 a 360 grados): ");
        angulo = sc.nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("Ángulo no válido. Debe estar entre 0 y 360 grados.");
        } else {
            String tipo = tipoDeAngulo(angulo);
            System.out.println("El ángulo de " + angulo + " grados es: " + tipo);
        }

        sc.close();
    }
}
