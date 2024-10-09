package p109_FormaV2;

public class Circulo extends Forma {
    private double radio;

    public Circulo() {
        super();
        this.radio = 1.0;
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo [" + super.toString() + ", Radio=" + radio + "]";
    }
}

