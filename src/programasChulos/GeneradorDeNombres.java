package programasChulos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import MetodosEstaticos.MetodosString;
public class GeneradorDeNombres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra,input;
		System.out.println("Bienvenido, aqui encontraras un nombre para lo que necesites");
		System.out.println("Cuando se genere un nombre indroduce 1 para guardarlo en el fichero");
		System.out.println("indroduce 2 para salir, indroduce cualquier otra cosa para pasar al siguiente");
		System.out.println();
		do {
			
			palabra= MetodosString.generadorNombresBasico();
			System.out.println(palabra.toUpperCase());
			input= teclado.nextLine();
			if (input.equals("1")) {
				guardarPalabra(palabra);
				
				
			}
			
			
			
		}while (!input.equals("2"));
		
		
		
		
		
	}
	
	private static void guardarPalabra(String palabra) {
		BufferedWriter fw = null;
		
		try {
			fw = new BufferedWriter(new FileWriter("Ficheros/palabrasBuenas.txt",true));
			fw.write(palabra);
			fw.newLine();
			
			
		}catch(IOException e) {
			
			
			
		}finally {
			if(fw!=null) {
				try {
					fw.close();
				}catch(IOException e) {
					
					
				}
				
				
			}
			
		}
		
		
		
	}

}
