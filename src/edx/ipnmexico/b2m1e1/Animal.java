package edx.ipnmexico.b2m1e1;

public abstract class Animal {

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
	
	//-> Método Abstracto
	//   Que puede ser usado como tal en cualquiera 
	//   de los Hijos que hereden de esta clase
	public abstract void desplazarse();
	
}
