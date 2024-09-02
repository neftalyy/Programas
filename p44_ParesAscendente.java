//Imprimir pares ascendentes 

import java.util.Scanner;

public class p44_ParesAscendente {
    public static void main(String[] args){
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do{
            System.err.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprimer pares ascendente\n");
            System.err.print("Hasta donde ?"); n = obj.nextInt();
            s = 0; c = 2;
            while(c<=n){
                System.err.printf("%d",c);
                s = s + c;
                c = c+2;
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N)?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while(resp !='N');
        System.out.println("\n-------Fin del Prohgrama-------"); 
}
}
