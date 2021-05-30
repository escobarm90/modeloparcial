package src.ar.edu.unlam.pb2.eva03;

import src.ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import src.ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import src.ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import src.ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private final TipoDeBicicleta TIPO_DE_BICICLETA;
	private Integer cantidadDeKilometrosEntrenados;
	private String distanciaPreferida;
	private String estiloPreferido;
	
	public Triatleta(int numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoDeBicileta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.TIPO_DE_BICICLETA = tipoDeBicileta;
	}

	
	public Enum<TipoDeBicicleta> getTipoDeBicicleta() {
		return this.TIPO_DE_BICICLETA; 
	}
	
	public void setCantidadDeKilometrosEntrenados(Integer km){
		this.cantidadDeKilometrosEntrenados = km;
	}
	
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}
	
	
	
	public String getDistanciaPreferida() {
		return this.distanciaPreferida;
	}
	
	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}
	

}
