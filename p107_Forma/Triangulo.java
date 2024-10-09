package p107_Forma;

public class Triangulo extends Forma {
    private double Base;
    private double Altura;
    public double getBase() {
        return Base;
    }
    public void setBase(double base) {
        Base = base;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    @Override
    public double getArea() {
        return (Base * Altura)/2;
    }
    
    }

    
    
