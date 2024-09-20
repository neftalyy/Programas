//Dia de la semana con número requerido 1-7

import java.util.Scanner;

public class p77_DiaSemana {
    public static String obtenerDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Número inválido. Debe estar entre 1 y 7.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero entre 1 y 7 para obtener el día de la semana: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 7) {
            String diaSemana = obtenerDiaSemana(numero);
            System.out.println("El día correspondiente es: " + diaSemana);
        } else {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 7.");
        }

        sc.close();
    }
}
