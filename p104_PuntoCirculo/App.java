package p104_PuntoCirculo;

public class App {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(6.0);
        circulo1.setCentro(new Punto(5, 8));

        Circulo circulo2 = new Circulo(2.0);
        circulo2.setCentro(new Punto(30, 46));

        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());

        System.out.println("Circulo 1 Area : " + circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia : " + circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro : " + circulo1.getCentro().toString());

        double distancia = circulo1.getCentro().getDistancia(circulo2.getCentro());
        System.out.println("Distancia a Circulo 2 : " + distancia);
    }
}
