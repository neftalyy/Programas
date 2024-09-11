//Tablas de multiplicar con Funciones 

import java.util.Scanner;

public class p69_TablaMultiplicar {
    public static void Tabla(int tabla, int limite){
        for(int i=1; i<=limite; i++){
        System.out.printf("%d x %d = %d\n", tabla, i, tabla * i);
    }
}
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        Scanner obj = new Scanner(System.in);

        System.out.println("Que tabla quieres: "); int tabla = obj.nextInt();
        System.out.println("Hasta donde: "); int limite = obj.nextInt();

        Tabla(tabla, limite);

        //Tabla(3, 5);
        //Tabla(2, 4);
        //Tabla(99,2);
}
}
