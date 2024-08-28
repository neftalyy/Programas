// Administra el pago de estacionamiento de acuerdo a la zona 

import java.util.Scanner;
public class p32_PagoEstacionamiento {
    public static void main(String[] args){
        float pago, total, imp;
        char est;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        pago = total = imp = 0;

        System.out.println("\nElije el tipo de estacionamiento que Usaste");
        System.out.print("Estacionamiento [N]orte - 3%");
        System.out.print("Estacionamiento [S]ur - 5%");
        System.out.print("Estacionamiento [E]ste - 10%");
        System.out.print("Estacionamiento [O]este - 20%");
        System.out.print("Elije ?");
        est = obj.next().charAt(0);
        switch (est) {
            case 'n': imp = 0.03f; break;
            case 's': imp = 0.05f; break;
            case 'e': imp = 0.10f; break;
            case 'o': imp = 0.20f; break;  
            default:
                 break; 
        }
        System.out.print("Cuanto pagaste ?"); pago = obj.nextFloat();
        total = pago * imp + pago; 
        System.out.printf("Pagaste %.2f y un impuesto de %.2f en el total pagaste %.2f", pago, imp, total);
        obj.close();
    }
}

