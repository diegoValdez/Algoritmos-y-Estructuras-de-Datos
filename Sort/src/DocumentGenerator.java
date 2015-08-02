
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class DocumentGenerator {
	
	private int[] intArray;
	private boolean Ordered;
	
	public DocumentGenerator() {
		this.intArray = new int[3000];
		this.Ordered = false;
	}

	public int[] getIntArray(){
		return intArray;
	}
		
	public void setIntArray(int[] newArr){
		this.intArray = newArr;
	}
	
	public boolean isOrdered() {
		return Ordered;
	}

	public void CreateUnorderedDoc(){	
		try {
			FileWriter fw = new FileWriter("C:\\Users\\DiegoRoberto\\workspace\\Sort\\src\\Datos.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			Random RandInt = new Random();
			String actualInt;

			for(int i = 0;i<3000;i++){
				int newInt = RandInt.nextInt(3000);
				actualInt = String.valueOf(newInt);
				bw.write(actualInt);		
				bw.newLine();
			}
			bw.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		this.Ordered=true;
	}
	
	public void loadRandomInt(){
		try {
			FileReader fr = new FileReader("C:\\Users\\DiegoRoberto\\workspace\\Sort\\src\\Datos.txt");
			BufferedReader br = new BufferedReader(fr);
			String readedString;
			
			for(int i = 0;i<3000;i++){
				readedString = br.readLine();
				this.intArray[i] =  Integer.parseInt(readedString);
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void CreateOrderedDoc(){	
		if (this.Ordered){
			try {
				FileWriter fw = new FileWriter("C:\\Users\\DiegoRoberto\\workspace\\Sort\\src\\DatosOrdenados.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				int newInt;
					
				for(int i = 0;i<3000;i++){
					newInt=intArray[i];
					String actualInt = String.valueOf(newInt);
					bw.write(actualInt);		
					bw.newLine();
				}
				bw.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadRandomIntOrdered(){
		try {
			FileReader fr = new FileReader("C:\\Users\\DiegoRoberto\\workspace\\Sort\\src\\DatosOrdenados.txt");
			BufferedReader br = new BufferedReader(fr);
			String readedString;
			
			for(int i = 0;i<3000;i++){
				readedString = br.readLine();
				this.intArray[i] =  Integer.parseInt(readedString);
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	
