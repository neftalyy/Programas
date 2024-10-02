package p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();

        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(5000);
        persona1.setNombre("Juan Perez");
        persona1.setTrabajo(trabajo);

        System.out.print("\033[H\033[2J");
        System.out.println("Datos de la Persona 1");
        System.out.println("Nombre : " + persona1.getNombre());
        System.out.println("Id Trabajo :" + persona1.getTrabajo().getId());
        System.out.println("Rol : " + persona1.getTrabajo().getRol());
        System.out.println("Salario :" + persona1.getTrabajo().getSalario());
        System.out.println(persona1.toString());

        Persona persona2 = new Persona("Maria Soto", new Trabajo(2,"Cocinera", 2500));
        System.out.print("\033[H\033[2J");
        System.out.println("Datos de la Persona 2");
        System.out.println("Nombre : " + persona2.getNombre());
        System.out.println("Id Trabajo :" + persona2.getTrabajo().getId());
        System.out.println("Rol : " + persona2.getTrabajo().getRol());
        System.out.println("Salario :" + persona2.getTrabajo().getSalario());
        System.out.println(persona2.toString());  
    }
}
