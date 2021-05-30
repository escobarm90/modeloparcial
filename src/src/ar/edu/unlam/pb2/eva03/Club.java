package src.ar.edu.unlam.pb2.eva03;


import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios= new HashSet<Deportista>();
	}
	
	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
	}
	
	public Integer getCantidadSocios() {
		return socios.size();
	}
}
