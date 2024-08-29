package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			// sc.close()  --> não posso colocar aqui pois pode ocorrer uma exceção
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close(); // --> certo é colocar o sc.close() aqui, porque o bloco finally será chamado mesmo que aconteça erros
			}
			
		}

	}

}
