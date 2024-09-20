//Sumar pares o impares segun elija el Usuario 

import java.util.Scanner;

public class p73_SumaParesImpares {

    public static int SumaParImpar(int ini, int fin, char poi) {
    int suma = 1;
    for(int i=ini; i<=fin; i++) {
        if(poi=='p' && i%2==0) {
            System.out.print(i+" ");
            suma+=i;
        } else if(poi=='I' && i%2!=0) {
            System.out.print(i+" ");
            suma+=1;
        }
    }
    return suma;
}

public static void main(String[] args){
    int ini, fin, suma;
    char poi;
    Scanner obj = new Scanner(System.in);
    System.out.print("\033[H\033[2J");
    System.out.println("Suma pares o Impares en un rango de valores..");
    do {
        System.out.print("Dame el inicio: "); ini = obj.nextInt();
        System.out.print("Dame el fin: "); fin = obj.nextInt();
    } while(fin<ini);
    System.out.println("\n[P]ares\n[I]mpares"); poi = Character.toUpperCase( obj.next().charAt(0) );
    suma = SumaParImpar(ini, fin, poi);

    if(suma!=-1)
       System.out.println("\nLa suma es: " + suma);
    else 
       System.out.println("Solo puedo sumar pares e impares");

}
}
