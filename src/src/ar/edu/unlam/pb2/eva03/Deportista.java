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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDeSocio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		if (numeroDeSocio != other.numeroDeSocio)
			return false;
		return true;
	}
	
	
	
}