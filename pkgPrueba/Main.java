package pkgPrueba;

import java.util.*;

public class Main {
	
	

	public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        List<Sala> salas = new ArrayList<>();
        List<Horario> horarios = new ArrayList<>();
        List<Boleto> boletos = new ArrayList<>();

        Pelicula p1 = new Pelicula("Avatar", "Acción", 180);
        Sala s1 = new Sala(1, 5, 5);
        Horario h1 = new Horario(p1, s1, "18:00");

        peliculas.add(p1);
        salas.add(s1);
        horarios.add(h1);

        Cliente cliente = new Cliente("Juan Perez");

        // Compra de boleto
        for (Horario h : horarios) {
            if (h.getPelicula().getTitulo().equalsIgnoreCase("Avatar") && h.getHora().equals("18:00")) {
                if (h.getSala().reservarAsiento(2, 3)) {
                    Boleto boleto = new Boleto(h.getPelicula(), h.getSala(), "18:00", 2, 3, cliente);
                    boletos.add(boleto);
                    System.out.println("Boleto comprado con éxito!");
                    boleto.imprimirBoleto();
                    break;
                } else {
                    System.out.println("Asiento ocupado!");
                }
            }
        }
    }
}

