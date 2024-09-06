//Secuencia de terminos 

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos terminos?");
        int terminos = scanner.nextInt();

        StringBuilder secuencia = new StringBuilder();
        int suma = 0;

        for(int i= 1; i<=terminos; i++){
            StringBuilder termino = new StringBuilder();
            for(int j = 1; j<=i; j++){
                termino.append("1");
            }

            int valorTermin = Integer.parseInt(termino.toString());
            suma += valorTermin;

            if(i > 1){
                secuencia.append("+");
            }
            secuencia.append(termino);
        }

        System.out.println(secuencia);
        System.out.println("Suma: " + suma);

        scanner.close();
    }
}
