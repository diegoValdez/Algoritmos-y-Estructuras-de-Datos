
public class BotonEstado implements IntBoton {

	
	public void onClick(Radio rad) { // Este metodo sirve para apagar el radio.
		if (rad.getEstado()==true){
			rad.setEstado(false);
		}
	}

	
	public void Hold(Radio rad) {
		
	}

}
