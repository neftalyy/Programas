//4 números enteros y devolver el menor 

import java.util.Scanner;

public class p76_NumeroMenor {
    public static int encontrarMenor(int num1, int num2, int num3, int num4) {
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }
        return menor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto número: ");
        int num4 = sc.nextInt();

        int menorNumero = encontrarMenor(num1, num2, num3, num4);
        System.out.println("El número menor es: " + menorNumero);

        sc.close();
    }
}
