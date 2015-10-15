package edx.ipnmexico.b2m1e1;

public class ElevadorAutos extends Elevador {

	//-> Atributos (Comunes)
	private int capacidadAutos;

	//-> Constructor
	public ElevadorAutos( int peso, int capacidad ) {
		super( peso, capacidad );
		// TODO Auto-generated constructor stub
	}
	
	//-> Getters & Setters
	public int getCapacidadAutos() {
		return capacidadAutos;
	}

	public void setCapacidadAutos( int capacidadAutos ) {
		this .capacidadAutos = capacidadAutos;
	}
	
	//-> Métodos
	public void proporcionarGasolina() {
		System .out .println( "Estoy proporcionando gasolina." );
	}
	
}
