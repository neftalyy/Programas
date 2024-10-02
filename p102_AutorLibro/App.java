package p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();
        libro1.setIsbn("1234567-27-32");
        libro1.setNombre("Java para participantes");
        libro1.setPrecio(300);
        autor.setNombre("Carlos Castañeda");
        autor.setEdad(45);
        autor.setCorreo("castr@uaz.edu.mx");
        libro1.setAutor(autor);
        
        System.out.print("\033[H\033[2J");
        System.out.println("Datos del Libro 1");
        System.out.println("Isbn :" + libro1.getIsbn());
        System.out.println("Nombre : " + libro1.getNombre());
        System.out.println("Precio : " + libro1.getPrecio());
        System.out.println("Autor : " + libro1.getAutor().getNombre());
        System.out.println("Edad " + libro1.getAutor().getEdad());
        System.out.println("Correo " + libro1.getAutor().getCorreo());
        System.out.println("\n" + libro1.toString());

        Libro libro2 = new Libro("4567-89-10-11","Seguridad",450, new Autor("William Rodriguez", 50, "william@hotmail.com"));
        System.out.println("Datos del Libro 1");
        System.out.println("Isbn :" + libro2.getIsbn());
        System.out.println("Nombre : " + libro2.getNombre());
        System.out.println("Precio : " + libro2.getPrecio());
        System.out.println("Autor : " + libro2.getAutor().getNombre());
        System.out.println("Edad " + libro2.getAutor().getEdad());
        System.out.println("Correo " + libro2.getAutor().getCorreo());
        System.out.println("\n" + libro2.toString());

    }
}
