//Imprimir tabla de conversión de peso a dolar 

import java.util.Scanner;

public class p47_ConjeturaCollatz {
    public static void main(String[] args){
        int n; 
        char resp;
        Scanner obj = new Scanner(System.in);
        do{
            System.out.println("\033[H\033[2J");System.out.flush();
            System.out.println("Imprimir conjetura de collatz para un número entero positivo\n");
            do {
                System.out.print("Dame un numero +Positivo: ");
                n = obj.nextInt();
            } while(n<=0);
            do{
                System.out.printf("%d", n);
                n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);  
            } while(n != 1);
            System.out.printf("%d\n", n);  
            
            System.out.print("\nContinuar: (S/N) ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while(resp != 'N');
        
        obj.close();  
        System.out.println("\n---FIN DEL PROGRAMA---");
    }
}
                

