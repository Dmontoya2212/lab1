 class Jugador {
    private int id;
    private String nombre;
    private int golesMarcados;
    private int partidosJugados;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.golesMarcados = 0;
        this.partidosJugados = 0;
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

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }


    @Override
    public String toString() {
        return
                "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", golesMarcados=" + golesMarcados +
                ", partidosJugados=" + partidosJugados +
                '}';
    }
}