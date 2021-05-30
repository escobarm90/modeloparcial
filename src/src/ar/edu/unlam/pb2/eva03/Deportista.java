package src.ar.edu.unlam.pb2.eva03;


abstract public class Deportista {

	private int numeroDeSocio;
	private String nombre;
	
	public Deportista(int numeroDeSocio, String nombre) {
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
		
	}	
	
	public Integer getNumeroDeSocio() {
		return this.numeroDeSocio;
	}
	
	
	
}