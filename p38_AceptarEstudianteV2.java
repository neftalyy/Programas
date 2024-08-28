import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la Estudiante");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa el sexo de el Estudiante (h/m):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingresa la edad de la Estudiante:");
        int edad = scanner.nextInt();

        double suma = 0;
        double calificacion;
        for(int i=1; i<=3; i++)
        {
            System.out.println("Ingresa la calificacion "+ i + ":");
            calificacion = scanner.nextDouble();
            suma+= calificacion;
        }
        double promedio = suma / 3;

        if(sexo == 'm' && edad>21 && promedio >=8 && promedio <=9.5);
        {
            System.out.println("El estudiante "+nombre+"ha sido aceptado en la Universidad Kitty Kat SA.");
        } else {
            System.out.println("El estudiante "+ nombre + "no cumple con los requisitos para ser aceptado.");
        }
    }
}
