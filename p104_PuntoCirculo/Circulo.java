package p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;

    public Circulo() {}

    public Circulo(double radio) {
        this.Centro = new Punto(0, 0); // Se puede inicializar a (0, 0) por defecto
        this.Radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        this.Centro = centro;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro.toString() + ", Radio=" + Radio + "]";
    }  
}
