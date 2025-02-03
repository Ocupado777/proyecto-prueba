package pkgPreoyectoPrueba;

public class Boleto {
    private Pelicula pelicula;
    private Sala sala;
    private String hora;
    private int fila;
    private int columna;
    private Cliente cliente;
    
    public Boleto(Pelicula pelicula, Sala sala, String hora, int fila, int columna, Cliente cliente) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.hora = hora;
        this.fila = fila;
        this.columna = columna;
        this.cliente = cliente;
    }
    
    public void imprimirBoleto() {
        System.out.println("Boleto para " + pelicula.getTitulo());
        System.out.println("Sala: " + sala.getNumero());
        System.out.println("Hora: " + hora);
        System.out.println("Asiento: Fila " + fila + " - Columna " + columna);
        System.out.println("Cliente: " + cliente.getNombre());
    }
}
