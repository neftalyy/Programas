//p02_AreaCirculo - Calcular el Área de un Circulo 

import java.util.Scanner;

public class p02_AreaCirculo {
     public static void main(String[] args) {
        double radio, area; 
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n"); //ln es para que brinque una linea 
        System.err.print("Dame el radio ? ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("\nEl circulo de radio " + radio + " tiene un área de " + area);
    }
}
