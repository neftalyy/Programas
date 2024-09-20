import java.util.Scanner;

public class p79_SumaMultiplos {

    public static int sumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
        }
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú Suma de Múltiplos -----");
            System.out.println("1. Sumar múltiplos de 3 en un rango");
            System.out.println("2. Sumar múltiplos de 4 en un rango");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese el valor inicial del rango: ");
                int ini = sc.nextInt();
                System.out.print("Ingrese el valor final del rango: ");
                int fin = sc.nextInt();

                if (ini >= fin) {
                    System.out.println("El rango no es válido. El valor inicial debe ser menor que el valor final.");
                } else {
                    int constante = (opcion == 1) ? 3 : 4;
                    int suma = sumaMultiplos(ini, fin, constante);
                    System.out.println("La suma de los múltiplos de " + constante + " entre " + ini + " y " + fin + " es: " + suma);
                }
            } else if (opcion != 3) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 3);

        System.out.println("Saliendo del programa...");
        sc.close();
    }
}
