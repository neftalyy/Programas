import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingresa un número entre el 1 y el 6 que corresponda a un continente: ");
        int numero = scanner.nextInt();
        switch (numero){
            case 1:
        System.out.println("Asia");
        break;

        case 2:
        System.out.println("Africa");
         break;

        case 3:
        System.out.println("America del Norte");
         break;

        case 4:
        System.out.println("America del Sur");
         break;

        case 5:
        System.out.println("Antartida");
         break;

        case 6:
        System.out.println("Europa");
         break;
        default:

        System.out.println("Error: Número fuera de rango.");
         break;

        }
}
}
