package pkgPreoyectoPrueba;

	
import java.util.*;
	
public class Main {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        List<Pelicula> peliculas = new ArrayList<>();
	        List<Sala> salas = new ArrayList<>();
	        List<Horario> horarios = new ArrayList<>();
	        List<Boleto> boletos = new ArrayList<>();

	        System.out.println("Ingrese el título de la película:");
	        String titulo = sc.nextLine();
	        System.out.println("Ingrese el género de la película:");
	        String genero = sc.nextLine();
	        System.out.println("Ingrese la duración de la película en minutos:");
	        int duracion = sc.nextInt();
	        sc.nextLine();
	        
	        Pelicula pelicula = new Pelicula(titulo, genero, duracion);
	        peliculas.add(pelicula);
	        
	        System.out.println("Ingrese el número de la sala:");
	        int numSala = sc.nextInt();
	        System.out.println("Ingrese el número de filas de la sala:");
	        int filas = sc.nextInt();
	        System.out.println("Ingrese el número de columnas de la sala:");
	        int columnas = sc.nextInt();
	        sc.nextLine();
	        
	        Sala sala = new Sala(numSala, filas, columnas);
	        salas.add(sala);
	        
	        System.out.println("Ingrese el horario de la película (HH:MM):");
	        String horarioStr = sc.nextLine();
	        Horario horario = new Horario(pelicula, sala, horarioStr);
	        horarios.add(horario);
	        
	        System.out.println("Ingrese su nombre:");
	        String nombreCliente = sc.nextLine();
	        Cliente cliente = new Cliente(nombreCliente);
	        
	        System.out.println("Ingrese la fila del asiento:");
	        int fila = sc.nextInt();
	        System.out.println("Ingrese la columna del asiento:");
	        int columna = sc.nextInt();
	        
	        if (sala.reservarAsiento(fila, columna)) {
	            Boleto boleto = new Boleto(pelicula, sala, horarioStr, fila, columna, cliente);
	            boletos.add(boleto);
	            System.out.println("Boleto comprado con éxito!");
	            boleto.imprimirBoleto();
	        } else {
	            System.out.println("Asiento ocupado!");
	        }
	    }
	}
