
public class BotonFavoritos implements IntBoton {
	// Atributos
	public double frecuencia;
	public String estacion;
	
	// Constructores
	public BotonFavoritos() {
		frecuencia = 99.3;
		estacion = "FM";
	}
	
	public BotonFavoritos(double Frecuencia, String Estacion) {
		this.frecuencia = Frecuencia;
		this.estacion = Estacion;
	}
	
	//Metodos
	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public void onClick(Radio rad) {	
		rad.setEstacion(estacion);
		rad.setFrecuencia(frecuencia);
	}

	public void Hold(Radio rad) {
		this.estacion = rad.getEstacion();
		this.frecuencia = rad.getFrecuencia();
	}

	

}
