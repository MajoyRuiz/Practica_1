package ejercicio1operaciones;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio1datos.Critica;



public class GestorCriticas {

	private static GestorCriticas instance = null;
	
	private ArrayList<Critica> listaCritica = new ArrayList<Critica>(); 
	private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	//Constructor privado
	private GestorEspectaculos() {
	
	}
	
	//Punto de acceso;
	public static GestorCriticas getInstance() {
		if(instance == null) {
			instance = new GestorEspectaculos();
		}
		return instance;
	}
	public void crearCritica() {
		Critica nuevaCritica = new Critica();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Titulo del espectaculo: ");
		String titulo = scan.next();
		nuevaCritica.setTitulo(titulo);
		
		System.out.println("Reseña del espectaculo: ");
		String resenia = scan.next();
		nuevaCritica.setResenia(resenia);
		
		System.out.println("Puntuacion del espectaculo: ");
		int puntuar = scan.nextInt();
		nuevaCritica.setPuntuacion(puntuar);
		
		listaCritica.add(nuevaCritica);
		scan.close();
		//El array de las valoraciones no se si iniciarlo
	}
	public void verCriticas() {
		if(listaCritica.size() == 0) {
			System.out.println("No hay ninguna critica disponible");
		}
		else {
			for(int i = 0; i < listaCritica.size(); i++) {
				System.out.println("Titulo: " + listaCritica.get(i).getTitulo() + "")
			}
		}
	}
}
