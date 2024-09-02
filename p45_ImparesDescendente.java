//Imprimir impares descendente 

import java.util.Scanner;

public class p45_ImparesDescendente {
    public static void main(String[] args){
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do{
            System.err.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprimer impares descendente\n");
            System.err.print("Desde donde ?"); n = obj.nextInt();
            s = 0; c = (n%2==0 ? --n :n);
            while(c>=1){
                System.err.printf("%d",c);
                s = s + c;
                c = c-2;
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N)?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while(resp !='N');
        System.out.println("\n-------Fin del Prohgrama-------"); 
}
}


