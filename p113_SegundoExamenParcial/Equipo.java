package p113_SegundoExamenParcial;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public int getTotalJugadores() {
        return jugadores.size();
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotalSalario() {
        double totalSalario = 0;
        for (Jugador jugador : jugadores) {
            totalSalario += jugador.salario;
        }
        return totalSalario + getTotalBono();
    }

    public void reporte() {
        int hombres = 0, mujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.sexo == 'H') {
                hombres++;
            } else {
                mujeres++;
            }
        }

        System.out.println(">> Equipo [Nombre=" + nombre + ", Liga=" + liga + ", Jugadores=" + getTotalJugadores() + 
                           ", Bono=" + getTotalBono() + ", Total=" + getTotalSalario() + ", Hombres=" + hombres + ", Mujeres=" + mujeres + "]");
        for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador);
        }
    }
}

