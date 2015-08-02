
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class DocumentGenerator {
	
	public static void main(String[] args){
		
		int[] intArray;
		intArray = new int[3000];
		
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
		
		try {
			FileReader fr = new FileReader("C:\\Users\\DiegoRoberto\\workspace\\Sort\\src\\Datos.txt");
			BufferedReader br = new BufferedReader(fr);
			String readedString;
			
			for(int i = 0;i<3000;i++){
				readedString = br.readLine();
				intArray[i] =  Integer.parseInt(readedString);
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0;i<3000;i++){
			System.out.println(intArray[i]);
		}
	
	}
		
}
	
