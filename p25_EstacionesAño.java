//Mostrar estación de año al que corresponda 

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[]args){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elige Estación de Año\n");
        System.out.println("1. Primavera \n 2. Verano \n 3. Otoño \n 4. Invierno");
        int n = new Scanner(System.in).nextInt();

        if(n==1)System.out.println("PRIMAVERA");
        if(n==2)System.out.println("VERANO");
        if(n==3)System.out.println("OTOÑO");
        if(n==4)System.out.println("INVIERNO");
        System.out.println("\n---FIN DEL PROGRAMA---");
}
}
