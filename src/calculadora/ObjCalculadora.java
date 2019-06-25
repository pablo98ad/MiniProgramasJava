package calculadora;

public class ObjCalculadora {
	
	private String pantalla;
	private boolean yaOperado=false;
	private String operadores="+-x/";
	
	
	public ObjCalculadora() {
		this.pantalla="";
	}
	
	public void addNumero(int n) {
		this.pantalla= this.pantalla+n;
		
	}
	
	public void resolver() {
		
		
		
		
		
		//System.out.println();
		
		
		
		
	}
	
	public void multiplicar() {
		if (!pantalla.equals("") && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0)) {
			if(pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
				this.pantalla= this.pantalla+"x";
			}
		}
	}
	
	public void dividir() {
		if (!pantalla.equals("") && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(0)) {
			if(pantalla.charAt(pantalla.length()-1)!=operadores.charAt(1) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(2) && pantalla.charAt(pantalla.length()-1)!=operadores.charAt(3)) {
				this.pantalla= this.pantalla+"/";
			}
		}
	}
	
	public void borrar() {
		if (!pantalla.equals("")) {
				this.pantalla= this.pantalla.substring(0,this.pantalla.length()-1);
			}
		
	}
	
	
	public String getPantalla() {
		return this.pantalla;
		
	}
	
	

}
