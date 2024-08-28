import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double calificacion;
        
        for(int i = 1; i<=5; i++)
        {
            System.out.println("Ingresa la calificacion: " +i+ ":");
            calificacion = scanner.nextDouble();
            suma += calificacion;
        }
        double promedio = suma / 5;
        
        if(promedio > 0 && promedio <=6){
            System.out.println("Promedio: "+promedio + " - Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7){
            System.out.println("Promedio: "+promedio + " - Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8){
            System.out.println("Promedio: "+promedio + " - Muy bien, puedes mejorar");
        } else if (promedio > 8 && promedio <= 9){
            System.out.println("Promedio: "+promedio + " - Excelente sigue asi");
        } else if (promedio > 9 && promedio <= 10){
            System.out.println("Promedio: "+promedio + " - Perfecto tu esfuerzo valio la pena");
        } else {
            System.out.println("Error: Promedio fuera del rango permitido.");
        }

}
}