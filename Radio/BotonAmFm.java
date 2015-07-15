
public class BotonAmFm implements IntBoton {

	public void onClick(Radio rad) {
		if (rad.getEstacion().equals("AM")){
			rad.setEstacion("FM");
			rad.setFrecuencia(87.9);
		}
		else{
			rad.setEstacion("AM");
			rad.setFrecuencia(530);
		}
	}

	public void Hold(Radio rad) {
		
	}

}
