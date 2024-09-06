//Secuencia de terminos armonicos 

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos terminos?");
        int terminos = scanner.nextInt();

        double suma = 0.0;

        for(int i = 1; i<= terminos; i++) {
            if(i ==1){
                System.out.print("1");
            } else{
                System.out.print(" + 1/" + 1);
            }
            suma += 1.0/i;
        }

        System.out.println("\nSuma: " + suma);

        scanner.close();
}
}
