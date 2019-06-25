package calculadora;

import java.util.Locale;

public class ObjCalculadora {
	
	private String pantalla;
	private String ourPantalla;
	private boolean yaOperado=false;
	private String operadores="+-x/";
	
	
	public ObjCalculadora() {
	}
	
	public void addNumero(int n) {
		if(this.pantalla==null) {
			this.pantalla=Integer.toString(n);
			this.ourPantalla=Integer.toString(n);
		}else {
			this.pantalla= this.pantalla+n;
			this.ourPantalla= this.ourPantalla+n;
		}
	}
	
	public void resolver() {
		String[] separado;
		double resultado=0;
		if (!pantalla.equals("") && this.pantalla!=null && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
			separado= ourPantalla.split(";");
			if (separado.length>=3) {
				for  (int i=0; i<1;i++) {
					double primero, segundo;
					primero=Double.parseDouble(separado[i]);
					segundo=Double.parseDouble(separado[i+2]);
					resultado= resolverOperacion(primero,separado[i+1],segundo);
					
					
				}
				
			}
			
			
			
			
			
			for (String l : separado ) {
				//System.out.println(l);
				
			}
			//System.out.println(ourPantalla);
			
			String res= String.format(Locale.US, "%.2f", resultado);
			pantalla=res;	
			ourPantalla=res;	
		}
		
		
		
		
	}
	
	public void multiplicar() {
		if (!pantalla.equals("") && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0)) {
			if(pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
				this.pantalla= this.pantalla+"x";
				this.ourPantalla= this.ourPantalla+";x;";
			}
		}
	}
	
	public void sumar() {
		if (pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0)) {
			if(pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
				this.pantalla= this.pantalla+"+";
				this.ourPantalla= this.ourPantalla+";+;";
			}
		}
		
	}
	
	public void restar() {
		if (pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0)) {
			if(pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
				this.pantalla= this.pantalla+"-";
				this.ourPantalla= this.ourPantalla+";-;";
			}
		}
		
	}
	
	
	
	public void dividir() {
		if (!pantalla.equals("") && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0)) {
			if(pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
				this.pantalla= this.pantalla+"/";
				this.ourPantalla= this.ourPantalla+";/;";
			}
		}
	}
	
	public void borrar() {
		if (!pantalla.equals("")) {
				this.pantalla= this.pantalla.substring(0,this.pantalla.length()-1);
				this.ourPantalla= this.ourPantalla.substring(0,this.ourPantalla.length()-1);
			}
		
	}
	
	
	public String getPantalla() {
		return this.pantalla;
		
	}
	
	private double resolverOperacion(double uno, String operador, double dos) {
		double resultado=0;
		switch (operador) {
		case "/":
			resultado= uno/dos;
			break;
		case "x":
			resultado=uno*dos;
			break;

		case "-":
			resultado=uno-dos;
			break;

		case "+":
			resultado=uno+dos;
			break;
		}
		
		
		
		return resultado;
		
	}
	
	

}
