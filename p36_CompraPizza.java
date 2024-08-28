import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int precioChica = 5;
        int precioMediana = 10;
        int precioGrande = 20;

        System.out.println("Elige el tamaño de la pizza");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        int opcion = scanner.nextInt();

        System.out.println("Cuantas pizzas deseas comprar: ");
        int cantidad = scanner.nextInt();

        int precioTotal = 0;
        String tamaño = "";

        switch (opcion){
            case 1:
            precioTotal = precioChica + cantidad;
            tamaño = "Chica";
            break;

            case 2:
            precioTotal = precioMediana + cantidad;
            tamaño = "Mediana";
            break;

            case 3:
            precioTotal = precioGrande + cantidad;
            tamaño = "Grande";
            break;
            default:

            System.out.println("Opción INVALIDA ");
            //return 
        }

        double descuento = 0;
        if(precioTotal > 2000){
            descuento = precioTotal * 0.15;
        }

        double totalConDescuento = precioTotal - descuento;

        System.out.println("Tamaño de la pizaa: "+tamaño);
        System.out.println("Cantidad comprada: "+cantidad);
        System.out.println("Total de la compra: $"+precioTotal);

        System.out.println("Descuento: $"+descuento);
        System.out.println("Total con descuento % : $"+totalConDescuento);
    }
}
