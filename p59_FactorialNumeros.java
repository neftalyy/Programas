//Calcular Factorial dado por el Usuario 

import java.util.Scanner;

public class p59_FactorialNumeros {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Hasta que número el Factorial: "); 
        int n = new Scanner(System.in).nextInt();

        for(int i=1; i<=n; i++){
            long f = 1;
            System.out.printf("%d! = ", i);
            for(int j = 1; j <= i; j++){
                System.out.printf("%d%s", j, (j == i ? " ": " * " ));
            }
            System.out.printf("= %d ", f);
            System.out.println();
        }
}
}