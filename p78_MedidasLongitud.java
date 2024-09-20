//Pulgadas a centímetros y otra que convierta de metros a pies 

import java.util.Scanner;

public class p78_MedidasLongitud {
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- Menú de Conversión de Longitud -----");
            System.out.println("1. Convertir de pulgadas a centímetros");
            System.out.println("2. Convertir de metros a pies");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad en pulgadas: ");
                    double pulgadas = sc.nextDouble();
                    double centimetros = pulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros.");
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad en metros: ");
                    double metros = sc.nextDouble();
                    double pies = metrosAPies(metros);
                    System.out.println(metros + " metros son " + pies + " pies.");
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
