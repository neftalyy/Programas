//Envia un saludo a la pantalla 
            //Nombre del archivo
public class p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Alfonzo";  //Declarar variable tipo cadena con un valor 
        String hermano = "Jarenith";
        String mensaje = String.format("Tanto %s como %s desean aprender Java",amigo,hermano); //Insertar cadena 

        System.out.println("Hola Mundo en el lenguaje Java");
        System.out.println("\nHola amigo " + amigo + "bienvenido Java");
        System.out.println("\nMi amigo es" + amigo + "mi hermano es");
        System.out.println("\n" + mensaje);

    }
}