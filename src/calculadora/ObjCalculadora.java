package calculadora;

public class ObjCalculadora {
	
	private String pantalla;
	private boolean yaOperado=false;
	
	
	public ObjCalculadora() {
		this.pantalla="";
	}
	
	public void addNumero(int n) {
		this.pantalla= this.pantalla+n;
		
	}
	
	public void multiplicar() {
		if (!this.pantalla.equals("")){
			if(!yaOperado) {
				yaOperado=true;
				pantalla=pantalla+"x";
			}else {
				String[] l = pantalla.split("x");
				pantalla=Double.toString((double)((Integer.parseInt(l[0]))*(Integer.parseInt(l[1]))));
					
			}
		}
		
	}
	
	public String getPantalla() {
		return this.pantalla;
		
	}
	
	

}
