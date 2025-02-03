package pkgPrueba;

public class Horario {
	private Pelicula pelicula;
    private Sala sala;
    private String hora;
    
    public Horario(Pelicula pelicula, Sala sala, String hora) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.hora = hora;
    }
    
    public Pelicula getPelicula() { return pelicula; }
    public Sala getSala() { return sala; }
    public String getHora() { return hora; }
}
