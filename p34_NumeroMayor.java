import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el Primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el Segundo número: ");
        int num2 = scanner.nextInt(); 
        System.out.println("Ingresa el Tercer número: ");
        int num3 = scanner.nextInt();    

        int mayor = num1;

        if(num2 > mayor){
            mayor = num2;
        }
        if(num3 > mayor){
            mayor = num3;
        }
        System.out.println("El número mayor es: ");
}
}