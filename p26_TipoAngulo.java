//Tipo de angulo una vez el usuario de los grados 

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[]args){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra el tipo de angulo \n");
        System.out.print("Elige el angulo entre 0 y 360 grados");
        int angulo = new Scanner(System.in).nextInt();

        System.out.print("Angulo: ");
        if(angulo<90)
        System.out.print("Es agudo");

        if(angulo==90)
        System.out.println("Es recto");

        if(angulo>90&&angulo<180)
        System.out.println("Es obtuso");

        if(angulo==180)
        System.out.println("Es llano");

        if(angulo>180&&angulo<360)
        System.out.println("Es concavo");

        if(angulo==360)

        System.out.println("Es completo");
        System.out.println("\n---PROGRAMA TERMINADO---");


}
}
