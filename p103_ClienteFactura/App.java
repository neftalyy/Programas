package p103_ClienteFactura;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Factura Llenar() {
    Factura f = new Factura();
    Cliente c = new Cliente();
    Scanner obj = new Scanner(System.in);
    System.out.println("Dame la ");
    System.out.print("id Factura :"); f.setId(obj.nextInt());
    System.out.print("Monto : "); f.setMonto(obj.nextDouble());
    System.out.print("Cliente Id : "); c.setId(obj.nextInt());
    System.out.println("Cliente Nombre :"); c.setNombre(obj.nextLine()); obj.nextLine();
    System.out.println("Cliente Desc :"); c.setDescuento(obj.nextFloat());
    f.setCliente(c);
    return f;
    }
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        Factura f1 = new Factura(1, 1500, new Cliente(1, "Juan Perez", 0.03f));
        Factura f2 = new Factura(2, 2500, new Cliente(2, "Maria Lopez", 0.01f));
        facturas.add(f1);
        facturas.add(f2);

        System.out.print("\033[H\033[2J");

        Factura f3 = new Factura();
        f3 = Llenar();
        System.out.println("Mi Factura es: " + f3.toString());
        facturas.add(f3);
        
        
        Factura f4 = new Factura();
        f4 = Llenar();
        System.out.println("Mi otra factura es :" + f4.toString());
        facturas.add(f4);

        System.out.println("\n\n Todas las facturas :");
        double grantotal =0;
        for(Factura factura : facturas) {
            System.out.println("id Factura :" + factura.getId());
            System.out.println("Monto : " + factura.getMonto());
            System.out.println("Cliente Id : " + factura.getCliente().getId());
            System.out.println("Cliente Nombre :" + factura.getCliente().getNombre());
            System.out.println("Cliente Desc :" + factura.getCliente().getDescuento());
            System.out.println("Total con Descuento : " + factura.getTotal());
            grantotal = grantotal + factura.getTotal();
            System.out.println();
        }
        System.out.println("/nTotal ");
    }
}
