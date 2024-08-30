import java.util.Scanner;

public class p41_ProcesaCalificaciones {
    public static void main(String[] args){
        int n, c;
        float cal, suma = 0, prom;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calcular la suma y el promedio de n calificaciones \n");
        System.out.print("Cuantas calificaciones ? "); n=obj.nextInt();

        c=1;
        while (c <= n){
            System.out.printf("Calificación %d =", c);
            cal = obj.nextFloat();
            suma = suma = cal;
            c++;
        }
        prom = suma /n;
        System.out.printf("La suma es : %.2f", suma);
        System.out.printf("El promedio es : %.2f", prom);
}
}
