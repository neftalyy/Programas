//Registro de Ventas 
//El Usuario elige que tipo de formato quiere 
//Registro de ventas 
//Ventas totales 
//Preguntar si quiere seguir comprando 
//Practica 5 - Guia de Examen Parcial 1

import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precioCarta = 3;
        int precioOficio = 4;
        int precioDobleOf = 6;

        int totalVentasCarta = 0;
        int totalVentasOficio = 0;
        int totalVentasDobleOf = 0;
        int totalVentas = 0;
        int totalDinero = 0;
        String otraVenta = "S";

        System.out.println("---------------------------------------------");
        System.out.println("Papelería la Malena, SA de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------------------");

        while (otraVenta.equalsIgnoreCase("S")) {

            totalVentas++;

            System.out.print("Venta: " + totalVentas + "\n");
            System.out.print("Tipo de copia (C)arta $" + precioCarta + ", (O)ficio $" + precioOficio + ", (D)oble Of $" + precioDobleOf + "? ");
            char tipoCopia = sc.next().charAt(0);

            System.out.print("Cantidad? ");
            int cantidad = sc.nextInt();

            switch (tipoCopia) {
                case 'C':
                case 'c':
                    totalVentasCarta += cantidad;
                    totalDinero += cantidad * precioCarta;
                    break;
                case 'O':
                case 'o':
                    totalVentasOficio += cantidad;
                    totalDinero += cantidad * precioOficio;
                    break;
                case 'D':
                case 'd':
                    totalVentasDobleOf += cantidad;
                    totalDinero += cantidad * precioDobleOf;
                    break;
                default:
                    System.out.println("Tipo de copia inválido.");
                    break;
            }

            System.out.print("Otra venta (S/N)? ");
            otraVenta = sc.next();
        } 
        System.out.println("---------------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------------");
        System.out.println("Ventas realizadas: " + totalVentas);
        System.out.println("Carta     : " + totalVentasCarta + " -> $" + (totalVentasCarta * precioCarta));
        System.out.println("Oficio    : " + totalVentasOficio + " -> $" + (totalVentasOficio * precioOficio));
        System.out.println("Doble Of. : " + totalVentasDobleOf + " -> $" + (totalVentasDobleOf * precioDobleOf));

        System.out.println("---------------------------------------------");
        System.out.println("Tot. Ventas: $" + totalDinero);

        if (totalDinero < 50) {
            System.out.println("Esta venta es una: Venta moderada");
        } else if (totalDinero <= 100) {
            System.out.println("Esta venta es una: Venta frecuente");
        } else {
            System.out.println("Esta venta es una: Venta superada");
        }

        sc.close();
    }
}
