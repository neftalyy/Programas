import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        if((num2 == num1 + 1) && (num3 == num2 + 1)) {
            System.out.print("Los números son consecutivos");
        } else {
            System.out.println("Los números NO son consecutivos");
        }
        }
}
