//Calcular mayor, menor, buscar en un arreglo 

import java.util.Scanner;

public class p87_ArregloTemperaturas {

    public static void Mostrar(double[] x) {
        for(int i=0; i < x. length ; i++)
         System.out.print(x[i] + " ");
         System.out.println();
    }
    public static double Mayor(double[] x) {
        double m = x[0];
        for(int i = 1; i<x.length; i++)
           if(x[i] > m) m = x[i]; 
        return m;
    }
    public static double Menor(double[] x) {
        double m = x[0];
        for(int i = 1; i<x.length; i++)
           if(x[i] < m) m = x[i]; 
        return m;
    }
    public static int Buscar(double[] x, double bus) {
        int pos=-1;
        for(int i=0; i < x.length; i++) {
          if(x[i]==bus) {
              pos = i;
              break;
            }
        }
           return pos;
    }
    public static void main(String[] args) {
        double[] temps = {12.34,56.22,56.78,10.0,10.25,60.22,10.0, 10.25, 60.22, 10.0};
        System.out.print("\033[H\033[2J");
        System.out.println("Arreglo de temperaturas:");
        Mostrar(temps);
        System.out.println("El MAYOR es " + Mayor(temps));
        System.out.println("El MENOR es " + Menor(temps));
        double bus = 60.22;
        int pos= Buscar(temps, bus);
        if(pos!=-1)
          System.out.println("Elemento encontrado en la posicion " + pos);
        else 
          System.out.println("I Still Haven´t found what I´m Looking For ");
}
}