package p100_Articulo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Articulo art1 = new Articulo("A101", "Pluma Roja", 888, 0.08);
        System.out.println(art1.toString());

        art1.setCant(999);
        art1.setPrecioUnit(0.09);

        System.out.println(art1.toString());
        System.out.println("ID: " + art1.getId());
        System.out.println("Desc: " + art1.getDesc());
        System.out.println("Cant: " + art1.getCant());
        System.out.println("Precio Unit: " + art1.getPrecioUnit());
        System.out.println("El Total es: " + art1.getTotal());

        ArrayList<Articulo> articulos = new ArrayList<>();
        articulos.add(art1);
        articulos.add(new Articulo("A102", "Pluma Azul", 934, 1.2));
        articulos.add(new Articulo("P103", "Lápiz del 12", 456, 0.5));

        double total = 0;
        System.out.println("\nTodos los artículos:");
        for (Articulo articulo : articulos) {
            System.out.println(articulo.toString());
            total += articulo.getTotal();
        }
        System.out.printf("Total venta: %.2f%n", total);
    }
}
