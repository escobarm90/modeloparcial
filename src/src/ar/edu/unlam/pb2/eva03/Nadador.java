package src.ar.edu.unlam.pb2.eva03;
import src.ar.edu.unlam.pb2.eva03.interfaces.*;


public class Nadador extends Deportista implements INadador  {
	 
	private String estiloPreferido;
	
	public Nadador(Integer numeroDeSocio, String nombre, String estiloPreferido) {
		super(numeroDeSocio,nombre);
		this.estiloPreferido = estiloPreferido;
	}
	
	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}
		
	
}