/* Algoritmos y Estructuras de Datos
 * Hoja de trabajo #2
 * Clase Controlador
 * Diego Valdez, 131094
 * Patrick Ordoñez
 * 
 */	


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controlador {
	
	private FileReader fr;
	private Pila cc = new Pila();
	private BufferedReader br;

	public Controlador(){
		cc = new Pila();
	}
		public String crear(){
			String Cadena2 = "";
		try {
			fr = new FileReader("C:\\Users\\Abel\\Documents\\datos.txt");
			br = new BufferedReader(fr);
			String Cadena;
			int numero;
			if((Cadena = br.readLine())!= null){
				numero = Cadena.length();
				for(int i = 0;i< numero;i++){
					char letra = Cadena.charAt(i);
					String mandar = Character.toString(letra);
					if(!mandar.equals(" ")){
						Cadena2 = Cadena2.concat(mandar);
						}
					}
				}
					
				for(int l = Cadena2.length()-1;l>=0;l--){
					char letra2 = Cadena2.charAt(l);
					String mandar2 = Character.toString(letra2);
					cc.agregar(mandar2);
						}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Cadena2;
		}
		
		public void Imprimir(){
			String Valor1,Valor2,Reserva,Imprimir = null,Regreso = null;
			int Operacion = 2,primero,segundo=1;
			Nodo Valido = new Nodo("");
				while(cc.getS() != null){
					Valor1 = cc.consumir();
					Valor2 = cc.consumir();
					Reserva = cc.consumir();
					if(Reserva.equals("+") || Reserva.equals("-")){
						segundo = 0;
					}
					if(Reserva.equals("*") || Reserva.equals("/")){
						segundo = 1;
					}
					if(Valor1.equals(" ")){
						Valido = null;
					}
					if(Valor2.equals(" ")){
						Valido = null;
					}
					if(Valor1.equals("")){
						Valido = null;
					}
					if(Valor2.equals("")){
						Valido = null;
					}
						primero = Integer.parseInt(Valor1);
						try{
							segundo = Integer.parseInt(Valor2);
						}catch (Exception e){
							Valido = null;
						}

						if(Reserva.equals("+")){
							Operacion = primero + segundo;
							Imprimir = "La Operacion Es: "+primero+ "+"+ segundo+ " = "+ Operacion;
							System.out.println(Imprimir);
							Regreso = Integer.toString(Operacion);
							cc.agregar(Regreso);
						}
						if(Reserva.equals("-")){
							Operacion = primero - segundo;
							Imprimir = "La Operacion Es: "+primero+ "-"+ segundo+ " = "+ Operacion;
							System.out.println(Imprimir);
							Regreso = Integer.toString(Operacion);
							cc.agregar(Regreso);
						}
						if(Reserva.equals("*")){
							Operacion = primero * segundo;
							Imprimir = "La Operacion Es: "+primero+ "*"+ segundo + " = "+ Operacion;
							System.out.println(Imprimir);
							Regreso = Integer.toString(Operacion);
							cc.agregar(Regreso);
						}
						if(Reserva.equals("/")){
							Operacion = primero/segundo;
							Imprimir = "La Operacion Es: "+primero+ "/"+ segundo+ " = "+ Operacion ;
							System.out.println(Imprimir);
							Regreso = Integer.toString(Operacion);
							cc.agregar(Regreso);
						}
				}
				Imprimir = "LA RESPUESTA FINAL ES: " + Operacion;
				System.out.println(Imprimir);
				}
}
