package p117_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica, Ajustar{
    private double alto, ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
        
        
    }

    @Override
    public double getArea() {
        return alto+ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * alto + 2 * ancho;
    }

    @Override
    public void ajustar(double porcentaje) {
        alto = alto + (alto*porcentaje);
        ancho = ancho + (ancho * porcentaje);
        
    }
    public String toString(){
        return "Rectangulo [Largo= " + alto + ", Ancho" + ancho +",Area="+ String.format("%.2f",getArea()) + ", Perimetro=" + String.format("%.2f",getPerimetro()) + "]";
    }

}