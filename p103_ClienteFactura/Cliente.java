package p103_ClienteFactura;

public class Cliente {
    private int id;
    private String Nombre;
    private float Descuento;
    public Cliente() {
    }
    public Cliente(int id, String nombre, float descuento) {
        this.id = id;
        Nombre = nombre;
        Descuento = descuento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public float getDescuento() {
        return Descuento;
    }
    public void setDescuento(float descuento) {
        Descuento = descuento;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", Nombre=" + Nombre + ", Descuento=" + Descuento + "]";
    }
    
}
