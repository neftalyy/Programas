import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args){
        float cal, suma, prom;
        int n;
        Scanner obj = new Scanner(System.in);
        boolean repite=true;
        while (repite) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Suma y Promedio de Calificaciones dadas por el Usuario");
            cal = suma = prom = 0;

            System.out.print("Cuantas calificaciones quieres procesar: ");
            n = obj.nextInt();
            for(int x =1; x<= n; x++) {
                System.out.print("Calificaciones " + x + " ? ");
                cal = obj.nextFloat();
                suma += cal;
            }
            prom = suma / n;
            System.out.println("\nLa suma es: " + suma);
            System.out.println("\nEl promedio es: "+ prom);
            System.out.println("\nRepetir (s/n)");
            String resp = obj.next().toLowerCase();
            repite = resp.equals("s");

        }
        System.out.println("\n---TERMINADO---");
    }
}
