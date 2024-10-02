package p102_AutorLibro;

public class Libro {
    private String Isbn;
    private String Nombre;
    private Autor Autor; //Uno es clase 
    private double Precio;
    public Libro() {
    }
    public Libro(String isbn, String nombre, p102_AutorLibro.Autor autor, double precio) {
        Isbn = isbn;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
    }
    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Autor getAutor() {
        return Autor;
    }
    public void setAutor(Autor autor) {
        Autor = autor;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    @Override
    public String toString() {
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Precio=" + Precio + "]";
    }
    
}
