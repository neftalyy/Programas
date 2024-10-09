package p105_PuntoTriangulo;

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;

    public Triangulo() {}

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.V1 = v1;
        this.V2 = v2;
        this.V3 = v3;
    }

    public Punto getV1() {
        return V1;
    }

    public void setV1(Punto v1) {
        this.V1 = v1;
    }

    public Punto getV2() {
        return V2;
    }

    public void setV2(Punto v2) {
        this.V2 = v2;
    }

    public Punto getV3() {
        return V3;
    }

    public void setV3(Punto v3) {
        this.V3 = v3;
    }

    public double getPerimetro() {
        double d1 = V1.getDistancia(V2);
        double d2 = V2.getDistancia(V3);
        double d3 = V3.getDistancia(V1);
        return d1 + d2 + d3;
    }

    public String getTipo() {
        double d1 = V1.getDistancia(V2);
        double d2 = V2.getDistancia(V3);
        double d3 = V3.getDistancia(V1);

        if (d1 == d2 && d2 == d3) {
            return "Equilátero";
        } else if (d1 == d2 || d2 == d3 || d1 == d3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + V1.toString() + ", V2=" + V2.toString() + ", V3=" + V3.toString() + "]";
    }
}
