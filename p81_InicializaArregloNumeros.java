import java.util.Scanner;

public class p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        double [] nums = new double[7];

        //Los arreglos comienzan siempre en 0 como en Python 
        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;
        //No hay posicion 7 

        Scanner obj = new Scanner(System.in);
        System.out.println("Primer elemento " + nums[0]);
        System.out.println("Ultimo elemento " + nums[6]);

        System.out.println("Todos los elementos del arreglo con un for en base al indice ");
          for(int i=0; i<nums.length; i++)
        System.out.print(nums[i] + " ");

        System.out.println("\nTodos los elementos del arreglo con un for sin indice");
          for(double i : nums)
          System.out.print(i + " ");
        System.out.println("\n\n--Fin del Programa--");
    }

}
