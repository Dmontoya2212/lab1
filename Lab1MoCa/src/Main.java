import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(1, "Alejandro", 10, 5);
        Jugador jugador2 = new Jugador(2, "Carlos", 5, 3);
        Jugador jugador3 = new Jugador(3, "Diego", 7, 4);
        Jugador jugador4 = new Jugador(4, "Luis", 3, 2);

        Partido partido = new Partido(
                Arrays.asList(jugador1, jugador2),
                Arrays.asList(jugador3, jugador4)
        );

        partido.registrarGol("A", 1);
        partido.registrarGol("B", 4);
        partido.registrarGol("B", 4);

        partido.mostrarDetalles();

        Jugador mejorJugador = partido.jugadorConMasGoles();
        System.out.println("Jugador con más goles (Equipo A): " + mejorJugador);

        List<Jugador> jugadoresFiltrados = partido.jugadoresConMasDeCincoGoles();
        System.out.println("Jugadores con más de 5 goles: ");
        jugadoresFiltrados.forEach(System.out::println);

        partido.actualizarEstadisticas(1, 3, 1);
        partido.mostrarDetalles();
    }
}