//Solicitar Datos 
//-Nombre, Edad, Sexo, Tipo de participanete 
//Solo con 23 años o más podran asistir 
//-Conteo de los rechazados 
//Al incribir mostrar su nombre, edad, sexo y tipo de participante, dando un mensaje de bienvenida 
//Costo de inscripcipn $40 - Alumno. $60 - Docente. $80 - Trabajdor

import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
        int totalAlumnos = 0, totalDocentes = 0, totalTRabajadores = 0;
        int totalMen = 0, totalMujeres = 0, totalRecha = 0;
        int totalParticipantes = 0;
        int edadTotal = 0;
        double dinAlumnos = 0, dinDocentes = 0, dinTrabajadores = 0;
        double dinTotal = 0;

        System.out.println("Cuantos participantes: ");
        int numParticipantes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numParticipantes; i++){
            System.out.println("Datos: #" + (i + 1));

            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            if (edad < 23){
                System.out.println("Rechazado por EDAD");
                totalRecha++;
                continue;
            }

            System.out.print("Sexo (Hombre/Mujer): ");
            String sexo = scanner.nextLine();

            System.out.print("Tipo (Alumno, Docente, Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            if (tipoParticipante.equalsIgnoreCase("Alumno")) {
                totalAlumnos++;
                dinAlumnos += 40;
            } else if (tipoParticipante.equalsIgnoreCase("Docente")) {
                totalDocentes++;
                dinDocentes += 60;

            } else if (tipoParticipante.equalsIgnoreCase("Trabajador")) {
                totalTRabajadores++;
                dinTrabajadores +=80;
            }

            if (sexo.equalsIgnoreCase("Hombre")) {
                totalMen++;
            } else if (sexo.equalsIgnoreCase("Mujer")){
                totalMujeres++;
            }

            totalParticipantes++;
            edadTotal += edad;

            System.out.println("Bienvenido " + nombre +",edad: "+ edad +", sexo: " + sexo + ", tipo: " + tipoParticipante);
        }
            dinTotal = dinAlumnos + dinDocentes + dinTrabajadores;
            double promedioEdad = totalParticipantes > 0 ? (double) edadTotal / totalParticipantes : 0;

            System.out.println("\nResultados: ");
            System.out.println("Total Alumnos: " + totalAlumnos);
            System.out.println("Total Docentes: " + totalDocentes);
            System.out.println("Total Trabajadores: " + totalTRabajadores);
            System.out.println("Total Hombres: " + totalMen);
            System.out.println("Total Mujeres: " + totalMujeres);
            System.out.println("Total Participante: " + totalParticipantes);
            System.out.println("Promedio Edad: " + promedioEdad);
            System.out.println("Total Rechazados: " + totalRecha);

            System.out.println("\nDinero Recaudado: ");
            System.out.println("Dinero Alumnos: $" + dinAlumnos);
            System.out.println("Dinero Docentes: $" + dinDocentes);
            System.out.println("Dinero Trabajadores: $" + dinTrabajadores);
            System.out.println("Dinero Total: $" + dinTrabajadores);
            System.out.println("Dinero Total: $" +dinTotal);

            if(dinTotal < 50) {
                System.out.println("El evento concluye con ganancias -BAJAS");
            } else if (dinTotal < 1000) {
                System.out.println("---El evento concluye con ganancias MODERADAS---");
            } else {
                System.out.println("---El evento concluye con +BUENAS ganancias---");
            }
       
        }
    }


}
