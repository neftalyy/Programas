package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class JugadorUtil {
    private ArrayList<Jugador> jugadores;

    public JugadorUtil() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void guardarDatos(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Jugador jugador : jugadores) {
                writer.println(jugador.getNombre() + "," +
                               jugador.getEdad() + "," +
                               jugador.getSexo() + "," +
                               jugador.getEstadoCivil() + "," +
                               jugador.getDescripcion() + "," +
                               jugador.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    public void cargarDatos(String filename) {
        jugadores.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    Jugador jugador = new Jugador(parts[0],
                                                  Integer.parseInt(parts[1]),
                                                  parts[2].charAt(0),
                                                  parts[3],
                                                  parts[4],
                                                  Double.parseDouble(parts[5]));
                    jugadores.add(jugador);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }
}

