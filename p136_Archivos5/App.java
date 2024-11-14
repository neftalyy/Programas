package p136_Archivos5; 

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void capturarDatos(ArrayList<Persona> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nInreoduce los datos de una Persona (nombre vacio para terminar)");
        while(true) {
            Persona persona = new Persona();
            System.out.println("Datos de la persona");
            System.out.println("Nombre :"); persona.setNombre( obj.nextLine());
            if(persona.getNombre().isEmpty()) break;
            System.out.println("Edad :"); persona.setEdad( obj.nextInt());
            System.out.println("Peso :"); persona.setPeso( obj.nextFloat() ); obj.nextLine();
            System.out.println("Correo :"); persona.setCorreo( obj.nextLine() );
            datos.add(persona);
        }
    }
    public static void mostrarDatos(ArrayList<Persona> datos) {}
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "datos.dat";
        ArrayList<Persona> datos = new ArrayList<>();

        do{
        System.out.print("\033[H\033[2J");
        System.out.println("-----Procesamiento de datos-----");
        System.out.println("Capturar datos.....");
        System.out.println("Grabar datos en archivo.....");
        System.out.println("Leer datos de archivo.....");
        System.out.println("Mostrar datos.....");
        System.out.println("Salir.....");
        System.out.println("Elije opcion ? "); op = obj.nextInt();
        switch (op) {
            case 1:
            if(datos.size()==0) System.out.println("\nCapturando datos por primera vez/n");
            else System.out.println("\nLos datos capturados se agregarán al final de los existentes");
            capturarDatos(datos);
            break;
        }
        }
    }
}
