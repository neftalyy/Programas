import java.util.Scanner;

public class p54_ArribaAbajo {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.err.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime numeros de 1 a n o de n a 1 segun lo decidas\n");
        System.out.println("Numeros de 1 a n .... [ 1 ]");
        System.out.println("Numeros de n a 1 .... [ 2 ]");
        System.out.println("Salir .... .... [ 3 ]");
        System.out.println("Elige: "); int op = obj.nextInt();

        switch (op) {
            case 1:
                 System.out.prinln("Imprimiendo de 1 a n....");
                 System.out.print("Hasta donde: "); n = obj.nextInt();
                 for(int i=n; i>= 1; i--) System.out.println(i + " ");
                 break;

            case 2: 
        }