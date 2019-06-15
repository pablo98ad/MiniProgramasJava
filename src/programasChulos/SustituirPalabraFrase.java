package programasChulos;

import java.util.Scanner;
import MetodosEstaticos.MetodosString;
public class SustituirPalabraFrase {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//ghfghfg
		
		String aCambiar="HolasoyPabloPabloComoPablo", aSustituir="Pablo", por="Kevin";
		
		System.out.println("Introduce la frase");
		aCambiar= teclado.nextLine();
		System.out.println("Introduce la palabra que quieres cambiar");
		aSustituir= teclado.nextLine();
		System.out.println("Introduce la palabra por la que quieres cambiarla");
		por =teclado.nextLine();
		
		System.out.println(MetodosString.cambiarPalabraFrase(aCambiar,aSustituir,por));

	}

}
