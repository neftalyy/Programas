//Imprimer la tabla de multilipicar t hasta n 

import java.util.Scanner;

public class p42_TablaMultiplicar {
    public static void main(String[] args){
        int t, c, n;
        Scanner obj = new Scanner (System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprimer la tabla de multlipicar  t hasta n\n");
        System.out.print("Que tabla quieres ?"); t=obj.nextInt();
        System.out.print("Hasta donde ?"); n = obj.nextInt();
        //t = 1;
        c = 1;

        while (c <= n) {
            System.out.printf("%d x %d = \n",t,c, t*c);
            c++;
        }
        System.out.println("\nProceso terminado...");

}
}