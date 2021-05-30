package src.ar.edu.unlam.pb2.eva03;

import src.ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {

	private Integer cantidadDeKilometrosEntrenados;
	private Integer distanciaPreferida;
	
	public Corredor(int numeroDeSocio, String nombre, Integer distanciaPreferida){
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}
	
	public void setCantidadDeKilometrosEntrenados(Integer km){
		this.cantidadDeKilometrosEntrenados = km;
	}
	
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}
	
	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

}
