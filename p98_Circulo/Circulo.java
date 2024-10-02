package p98_Circulo;

public class Circulo {
    private double radio;
    
    public Circulo() {
        this.radio = 0.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
    @Override
    public String toString() {
        return "Circulo con radio: " + this.radio;
    }
}
