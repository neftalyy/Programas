//Dibuja un cuadrado del caracter que el Usuario elija 

import java.util.Scanner;

public class p75_CuadroCaracter {
    public static void Cuadrado(int r, int c, char car){
        for(int i=1; i<=r; i++) {
            for(int j=i; j<=c; j++)
            System.out.print(car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("De cuantos reglones ?"); int r = obj.nextInt();
        System.out.print("De cuantas columnas ?"); int c = obj.nextInt();
        System.out.print("De que caracter ?"); char car = obj.next().charAt(0);

        Cuadrado(r, c, car);
        Cuadrado(3,4,'#');
        Cuadrado(10,23,'&');

        obj.close();
   
    }
}
