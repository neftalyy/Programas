package p109_FormaV2;

public class App {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo("Rojo", true, 10.23);
        Circulo circulo2 = new Circulo("Verde", false, 99.12);
        Rectangulo rectangulo1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo rectangulo2 = new Rectangulo("Azul", true, 15.0, 44.0);

       
        Forma[] formas = {circulo1, circulo2, rectangulo1, rectangulo2};

        
        System.out.println("Todas las formas:");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        System.out.println("\nCalculando áreas y perímetros de las figuras:");
        for (Forma forma : formas) {
            if (forma instanceof Circulo) {
                System.out.println("La forma es un Círculo");
            } else if (forma instanceof Rectangulo) {
                System.out.println("La forma es un Rectángulo");
            }
            System.out.println("El área es: " + forma.getArea());
            System.out.println("El perímetro es: " + forma.getPerimetro());
        }
    }
}
