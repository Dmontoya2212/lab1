import java.util.ArrayList;
import java.util.List;

public class Partido {
    private List<Jugador> equipoA;
    private List<Jugador> equipoB;
    private int golesEquipoA;
    private int golesEquipoB;

    // Constructor
    public Partido(List<Jugador> equipoA, List<Jugador> equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = 0;
        this.golesEquipoB = 0;
    }

    // Registrar goles
    public void registrarGol(String equipo, int jugadorId) {
        if ("A".equalsIgnoreCase(equipo)) {
            equipoA.forEach(jugador -> {
                if (jugador.getId() == jugadorId) {
                    jugador.setGolesMarcados(jugador.getGolesMarcados() + 1);
                    golesEquipoA++;
                }
            });
        } else if ("B".equalsIgnoreCase(equipo)) {
            equipoB.forEach(jugador -> {
                if (jugador.getId() == jugadorId) {
                    jugador.setGolesMarcados(jugador.getGolesMarcados() + 1);
                    golesEquipoB++;
                }
            });
        } else {
            System.out.println("El equipo no existe");
        }
    }

    // Determinar el equipo ganador
    public String equipoGanador() {
        if (golesEquipoA > golesEquipoB) {
            return "El equipo ganador es el equipo A.";
        } else if (golesEquipoB > golesEquipoA) {
            return "El equipo ganador es el equipo B.";
        } else {
            return "Los equipos empataron.";
        }
    }

    // Mostrar detalles del partido
    public void mostrarDetalles() {
        System.out.println("Detalles del Partido:");
        System.out.println("Equipo A:");
        equipoA.forEach(jugador -> System.out.println(jugador));
        System.out.println("Goles Equipo A: " + golesEquipoA);

        System.out.println("\nEquipo B:");
        equipoB.forEach(jugador -> System.out.println(jugador));
        System.out.println("Goles Equipo B: " + golesEquipoB);

        System.out.println("\n" + equipoGanador());
    }

    // Calcular el jugador con más goles usando forEach
    public Jugador jugadorConMasGoles() {
        final Jugador[] mejorJugador = {null};
        final int[] maxGoles = {0};

        equipoA.forEach(jugador -> {
            if (jugador.getGolesMarcados() > maxGoles[0]) {
                maxGoles[0] = jugador.getGolesMarcados();
                mejorJugador[0] = jugador;
            }
        });

        equipoB.forEach(jugador -> {
            if (jugador.getGolesMarcados() > maxGoles[0]) {
                maxGoles[0] = jugador.getGolesMarcados();
                mejorJugador[0] = jugador;
            }
        });

        return mejorJugador[0];
    }

    // Filtrar jugadores con más de 5 goles usando forEach
    public List<Jugador> jugadoresConMasDeCincoGoles() {
        List<Jugador> jugadoresFiltrados = new ArrayList<>();
        equipoA.forEach(jugador -> {
            if (jugador.getGolesMarcados() > 5) {
                jugadoresFiltrados.add(jugador);
            }
        });
        equipoB.forEach(jugador -> {
            if (jugador.getGolesMarcados() > 5) {
                jugadoresFiltrados.add(jugador);
            }
        });
        return jugadoresFiltrados;
    }

    // Actualizar estadísticas de un jugador usando forEach
    public void actualizarEstadisticas(int jugadorId, int nuevosGoles, int nuevosPartidos) {
        equipoA.forEach(jugador -> {
            if (jugador.getId() == jugadorId) {
                jugador.setGolesMarcados(jugador.getGolesMarcados() + nuevosGoles);
                jugador.setPartidosJugados(jugador.getPartidosJugados() + nuevosPartidos);
            }
        });

        equipoB.forEach(jugador -> {
            if (jugador.getId() == jugadorId) {
                jugador.setGolesMarcados(jugador.getGolesMarcados() + nuevosGoles);
                jugador.setPartidosJugados(jugador.getPartidosJugados() + nuevosPartidos);
            }
        });
    }
}