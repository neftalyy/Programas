// Verifica si la suma de dos numeros es igual = a un Tercero

import java.util.Scanner;
public class p22_VerificaSuma {
public static void main(String[] args) {
int n1, n2, n3;
Scanner obj = new Scanner(System.in);
System.out.print("\033[H\033[2J"); System.out.flush();
System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
System.out.print("Primer numero: "); n1 = obj.nextInt();
System.out.print("Seguno numero: "); n2 = obj.nextInt();
System.out.print("Tercer numero: "); n3 = obj.nextInt();
if( n1+n2 == n3 )
System.out.println("\nSon iguales =");
else
System.out.println("\nSon distintos");
System.out.println("\nEste ha sido el Programa");
}
}
