public class Jugador {
    private int id;
    private String nombre;
    private int golesMarcados;
    private int partidosJugados;


    public Jugador(int id, String nombre, int golesMarcados, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.golesMarcados = golesMarcados;
        this.partidosJugados = partidosJugados;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    // Setters
    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }


    @Override
    public String toString() {
        return "Jugador {" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Goles Marcados=" + golesMarcados +
                ", Partidos Jugados=" + partidosJugados +
                '}';
    }
}