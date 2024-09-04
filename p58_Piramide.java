//Imprimir Piramide de Caracteres Personalizados 

import java.util.Scanner;

public class p58_Piramide {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Cuantos Reglones ? "); 
        int r = obj.nextInt();
        System.out.print("De que Caracter ? "); 
        char c = obj.next().charAt(0);

        for(int i =1; i<=r; i++){

           for(int k = 1; k <= (2 * i - 1); k++){
              System.out.print(c);
        }
              System.out.println();
}
  obj.close();
}
}