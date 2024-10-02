package p103_ClienteFactura;

public class Factura {
    private int id;
    private double Monto;
    private Cliente Cliente;
    public Factura() {
    }
    public Factura(int id, double monto, p103_ClienteFactura.Cliente cliente) {
        this.id = id;
        Monto = monto;
        Cliente = cliente;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMonto() {
        return Monto;
    }
    public void setMonto(double monto) {
        Monto = monto;
    }
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }
    public double getTotal(){
        return (Monto - (Monto * Cliente.getDescuento()))
    }
    @Override
    public String toString() {
        return "Factura [id=" + id + ", Monto=" + Monto + ", Cliente=" + Cliente + "]";
    }
    
}
