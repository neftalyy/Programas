//Dado un numero entre 1 y 7 nos muestra el número de la semana 

import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Dame un numero entre 1 y 7 y te dire el dia de la semana con letra\n");
        int dia = new Scanner(System.in).nextInt();

        switch (dia){
            case 1: System.out.println("Domingo... dormir");break;
            case 2: System.out.println("Lunes.... clases");break;
            case 3: System.out.println("Martes....clase");break;
            case 4: System.out.println("Miercoles...clase");break;
            case 5: System.out.println("Jueves....casi nos vamos");break;
            case 6: System.out.println("Viernes....ya no fuimos de hecho");break;
            case 7: System.out.println("Sabado.....estudiar");break;
            default:
            System.out.println("Aver....");
            break;
        }
    }
}
