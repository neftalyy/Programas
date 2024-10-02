//Describe Rol de trabajo 

package p101_TrabajoPersona;

public class Trabajo {
    private int Id; //Nombres con mayusculas y en constructor con minusculas 
    private String Rol;
    private double Salario;

    public Trabajo() { //Constructor vacio 
    }
    public Trabajo(int id, String rol, double salario) {
        Id = id; 
        Rol = rol;
        Salario = salario;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getRol() {
        return Rol;
    }
    public void setRol(String rol) {
        Rol = rol;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    @Override
    public String toString() {
        return "Trabajo [Id=" + Id + ", Rol=" + Rol + ", Salario=" + Salario + "]";
    }

    
}
