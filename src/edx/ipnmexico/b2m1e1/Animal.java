package edx.ipnmexico.b2m1e1;

public class Animal {

	//-> Atributos (Comunes)
	private int peso,
	            altura;
	private String nombre;
	
	//-> Getters & Setters
	public int getPeso() {
		return peso;
	}
	
	public void setPeso( int peso ) {
		this .peso = peso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura( int altura ) {
		this .altura = altura;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre( String nombre ) {
		this .nombre = nombre;
	}
	
	//-> Métodos
	public void desplazarse() {
		System .out .println( "Soy un Animal y me desplazo" );
	}
	
}
