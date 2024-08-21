// Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de horas: ");
        int horasTotales = scanner.nextInt();
        int dias = horasTotales / 24;
        int horasRestantes = horasTotales % 24;
        int minutos = horasRestantes * 60;
        int segundos = minutos * 60;

        System.out.println(String.format("Equivalente en días: %d días", dias));
        System.out.println(String.format("Horas restantes: %d horas", horasRestantes));
        System.out.println(String.format("Minutos equivalentes: %d minutos", minutos));
        System.out.println(String.format("Segundos equivalentes: %d segundos", segundos));

    }
}
