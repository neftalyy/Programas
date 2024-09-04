//Imprime Suma de 1 / n Factorial 

import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Hasta que número el Factorial: "); 
        int n = new Scanner(System.in).nextInt();

        float s = 0;

        for(int i=1; i<=n; i++){
            float f = 1;
            System.out.print("1 / ");
            for(int j=1; j<=i; j++){
                f *= j;

            }
            s += 1.0f / f;
            System.out.printf("1 / %.0f %s ", f, (i==n?" ":"+ "));
        }
        System.out.printf(" = %f",s);
}
}

