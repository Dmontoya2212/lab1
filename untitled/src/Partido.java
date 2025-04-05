public class Partido {
    private List<Jugador> equipoA;
    private List<Jugador> equipoB;
    private int golesEquipoA;
    private int golesEquipoB;

    public Partido(List<Jugador> equipoA, List<Jugador> equipoB) {

        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = 0;
        this.golesEquipoB = 0;
    }

    public void registrarGol(String equipo, int cantidad) {
        if ("A".equals(equipo)) {
            golesEquipoA++;
        } else if ("B".equals(equipo)) {
            golesEquipoB++;
        } else {
            System.out.println("El equipo no existe");
        }

    }

    public String equipoGanador() {
        if (golesEquipoA > golesEquipoB) {
            return "El equipo ganador es el equipo A ";
        } else if (golesEquipoB > golesEquipoA) {
            return "El equipo ganador es el equipo B";

        } else {
            return "los equipos empataron";
        }

    }
    public void mostrarDetalles(){
        System.out.println("Detalles del Partido ");
        System.out.println("Equipo A:" );
        equipoA.forEach(jugador -> System.out.println(jugador));
        System.out.println("GolesA:  " + golesEquipoA );
        System.out.println("Equipo B:  " );
        equipoB.forEach(jugador -> System.out.println(jugador));
        System.out.println("GolesB:  " + golesEquipoB );
        System.out.println("\n" +equipoGanador());

    }
}
