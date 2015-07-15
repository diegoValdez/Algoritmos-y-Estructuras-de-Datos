/* 
 * 
 * 
 * 
 */

public class Radio {
	public double frecuencia;
	public String estacion;
	public boolean estado;
	public int botones;
	
	public Radio() {
		frecuencia = 87.9;
		estacion = "FM";
		estado = false;
		botones = 12;
	}
	
	public Radio(double Frecuencia, String Estacion, boolean Estado) {
		this.frecuencia = Frecuencia;
		this.estacion = Estacion;
		this.estado = Estado;
	}

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

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
}
