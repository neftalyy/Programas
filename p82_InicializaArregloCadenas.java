import java.util.Scanner;

public class p82_InicializaArregloCadenas {
    public static void main(String[] args) {

        String[] nums = new String[10];
        nums[0] = "Apozol";
        nums[1] = "Acapulco";
        nums[2] = "Cañitas";
        nums[3] = "Jerez";
        nums[4] = "Fresnillo";
        nums[5] = "Rio Grande";
        nums[6] = "Sain Alto";
        nums[7] = "Sombrerete";
        nums[8] = "Teul de Gonzales Ortega";
        nums[9] = "Zacatecas";

        System.out.print("\033[H\033[2J");
        System.out.println("Primer elemento " + nums[0]);
        System.out.println("Ultimo elemento " + nums[9]);

        System.out.println("Todos los elementos del arreglo con un for en base al indice ");
          for(int i=0; i<nums.length; i++)
        System.out.print(nums[i] + " ");

        System.out.println("\nTodos los elementos del arreglo con un for sin indice");
          for(String m : nums)
          System.out.print(m + " ");
        System.out.println("\n\n--Fin del Programa--");
    }
}
