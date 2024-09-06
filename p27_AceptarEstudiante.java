//Estudiantes aceptados por edad y calificaciones 

import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        float c1,c2;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Aceptacion de estudiantes por CALIFICACIONES y EDAD\n");
        System.out.print("Nombre: "); nombre = obj.nextLine();
        System.out.print("Edad: "); edad = obj.nextInt();

        if( edad >= 18 ) {
        System.out.println("Si eres MAYOR ");
        System.out.println("Dos Calificaciones separadas por Enter:");
        c1 = obj.nextFloat();
        c2 = obj.nextFloat();

        if( c1 >= 8 && c2 >= 8)
        System.out.printf("\nHola %s tienes %d y calificaciones %.2f,%.2f ... ---ACEPTADO---\n",nombre,edad,c1,c2);
        else
        System.out.println("\nSolo se ACEPTAN con 8+");
        
        }
        else
        
        System.out.println("Solo se ACEPTAN mayores");
        System.out.println("\n---REGISTRO TERMINADO---");
        }
}
