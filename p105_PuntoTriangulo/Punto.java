package p105_PuntoTriangulo;

public class Punto {
    private int X;
    private int Y;

    public Punto() {}

    public Punto(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public double getDistancia(Punto punto) {
        return Math.sqrt(Math.pow((punto.getX() - this.X), 2) + Math.pow((punto.getY() - this.Y), 2));
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}
