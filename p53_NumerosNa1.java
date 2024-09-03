//Decremento personalizado

import java.util.Scanner;

public class p53_NumerosNa1 {
    public static void main(String[] args){
        int j, n, p;
        Scanner obj = new Scanner(System.in);
        System.err.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprimir numeros de n a 1 usando for:\n");
        System.out.println("Desde donde quieres decsender: "); n = obj.nextInt();
        System.out.println("En decrementos de: "); p = obj.nextInt();

        for(j=n; j>=1; j-=p)
            System.out.print(j +" ");

            System.out.println("\n--El CICLO a llegado a su FIN--");
            obj.close();
            
    }
}

