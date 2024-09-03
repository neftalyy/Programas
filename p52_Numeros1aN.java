//Imprimir numeros del 1 al 100
//Con incrementos personalizados 

import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args){

        System.err.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime los numeros de 1 a n usando for:\n");
        System.out.println("Hazta donde deseas llegar ?"); int n = new Scanner(System.in).nextInt();
        System.out.println("En incrementos de: "); int p = new Scanner(System.in).nextInt();

        for(int i=0; i<=n; i+=p)
          System.out.print(i+ " ");
}
}
