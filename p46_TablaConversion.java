//Conversin de peso a dolar 

import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args){
        int ini, fin, c;
        float tc = 19.99f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime una tabla de conversión de peso a dolar\n");
            do{
                System.out.print("inicio: "); ini = obj.nextInt();
                System.out.print("FIN"); fin = obj.nextInt();
            } while(fin < ini);
            c = ini;
            System.out.println("Peso\tDolar");
            while(c<=fin) {
                System.out.printf("%d\t%.2\n",c,c/tc);
                c++;
            }
            System.out.print("\nContinuar ?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while(resp != 'N');
        System.out.println("\n---FIN DEL PROGRAMA---");
}
}
