package MetodosEstaticos;

import java.util.Scanner;

public class MetodosString {

	public static void main(String[] args) {
		
		for (int i=0; i<20; i++) {
		System.out.println(generadorNombresBasico());
		
		
		}
		
		
	}
	
	
	
	public static void main1(/*String[] args*/) {
		Scanner teclado= new Scanner(System.in);
		
		
		
		String aCambiar="HolasoyPabloPabloComoPablo", aSustituir="Pablo", por="Kevin";
		
		System.out.println("Introduce la frase");
		aCambiar= teclado.nextLine();
		System.out.println("Introduce la palabra que quieres cambiar");
		aSustituir= teclado.nextLine();
		System.out.println("Introduce la palabra por la que quieres cambiarla");
		por =teclado.nextLine();
		
		System.out.println(cambiarPalabraFrase(aCambiar,aSustituir,por));


	}
	/**
	 * Metodo que desde una frase y la palabra que quieres sustituir y la sustituida te la sustituye
	 * ejemplo de HolasoyPabloPabloComoPablo, palabra a sustituir es Pablo y se sustituye por Kevin
	 * el metodo devolveria HolasoyKevinKevinComoKevin
	 * @param frase
	 * @param pClave
	 * @param pCambiar
	 * @return
	 */
	public static String cambiarPalabraFrase(String frase, String pClave, String pCambiar) {
		String aAnalizar,fraseIni,fraseFin;
		
		for (int i=0; i<frase.length(); i++) {//va saltando entre las po
			
			if((pClave.length()+i)<=(frase.length())) {
				aAnalizar=frase.substring(i, pClave.length()+i);
				//System.out.println(aAnalizar);
				if (aAnalizar.equals(pClave)) {
					fraseIni=frase.substring(0,i);
					fraseFin= frase.substring((pClave.length()+i),frase.length());
					frase=fraseIni+pCambiar+fraseFin;
					
					//System.out.println(aAnalizar+"ddfds"+frase);
					
				}
				//System.out.println(aAnalizar);
			}

		}
		return frase;
	}
	
	public static String generadorNombresBasico() {
		String [] consT= {"b","c","d","f","g","h","j","k","l","m","o","p","q",
				"r","s","t","v","w","x","y","z","ñ","ch","cr","fr","gr","tr","ll"};
		String [] vocT= {"a","e","i","o","u"};
		String[] palabra;
		String /*cons="bcdfghjklmñpqrstvwxyz", voc="aeiou",/*palabra,*/ anterior,word="";
		int numAlc, numAlv,longPala,cualChar,bienes=0,cont;
		boolean req=false,siguVocal;
		//do {
			//palabra="";
			longPala=(int)((Math.random()*4)+4);
			palabra= new String[longPala];
			
			cualChar= (int)(Math.random()*2);//dejamos al 50 % de suerte si pone un caracter o vocal
			for (int i=0; i<longPala; i++) {//generamos la palabra
				
				if (cualChar==0) {
					if (i!=(longPala-1)) {//para que no incluya las palabras compuestas al final ejem cr
					numAlc= (int)(Math.random()*consT.length);
					palabra[i]= consT[numAlc];
					cualChar=1;
					}else {
						numAlc= (int)((Math.random()*(consT.length-6)));
						palabra[i]= consT[numAlc];
						cualChar=1;
					}
					
					
					}else {
						numAlv= (int)(Math.random()*vocT.length);
						palabra[i]= vocT[numAlv];
						cualChar=0;
				}
			
			}
			for (int i=0; i< palabra.length;i++) {
				word= word+palabra[i];
				
				
			}
			
			
			/*
			//System.out.println(longPala);
			cualChar= (int)(Math.random()*2);
			for (int i=0; i<longPala; i++) {//generamos la palabra
				
				if (cualChar==0) {//dejamos al 50 % de suerte si pone un caracter o vocal
					numAlc= (int)(Math.random()*cons.length());
					palabra= palabra+cons.charAt(numAlc);
					cualChar=1;
					}else {
						numAlv= (int)(Math.random()*voc.length());
						palabra= palabra+voc.charAt(numAlv);
						cualChar=0;
				}
				
				
				
				
			}*/
			//System.out.println(palabra);
			//comprobamos que se pueda pronunciar la palabra
			/*
			if (palabra.substring(0, 2)=="ch" || palabra.substring(0, 2)=="cr" || palabra.substring(0, 2)=="dr" ) {
				anterior= palabra.substring(0, 2);
				cont=2;
			}else {
				anterior= Character.toString(palabra.charAt(0));
				cont=1;
			}		
			int acumVocales=0;
			
					
			for (cont=cont; cont<palabra.length(); cont++) {
				siguVocal=false;
				for (int j=0; j<voc.length();j++) {//comprobamos si la siguiente es vocal
					
					if(palabra.charAt(cont)==voc.charAt(j)) {
						siguVocal=true;
					}
				}
				
				if (siguVocal) {
					acumVocales++;
					
				}else {
					acumVocales=0;
					
				}
				anterior=Character.toString(palabra.charAt(cont));
				
				
			}
			
			//System.out.println(bienes);
			System.out.println(acumVocales);
		/*	if(/*bienes>= 4 /* acumVocales==0) {
				
				req=true;
			//}
				*/
				
			//System.out.println(palabra);
			
			//*/
		//} while (req==false);
			
		return word;
		
	}

}
