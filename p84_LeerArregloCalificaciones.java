//Leer calificaciones de un arreglo y sacar el promedio

import java.util.Scanner;

public class p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        int n=0;
        float suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.print("Cuantas calificaciones: "); n = obj.nextInt();

        float[] califs = new float[n];

        System.out.println("Introduce las " + n +"calificaciones");
        for(int i=0; i<califs.length; i++) {
            System.out.print("Calificacion["+(i+1)+"] = ");
            califs[i] = obj.nextFloat();
        }
        System.out.println("Las calificaciones capturadas son: ");
        for(float cal : califs) {
            System.out.print(cal + " ");
            suma = suma + cal;
        }
        promedio = suma / califs.length;
        System.out.println("\nLa suma es " + suma);
        System.out.println("\nEl promedio es " + promedio);
    }
}
