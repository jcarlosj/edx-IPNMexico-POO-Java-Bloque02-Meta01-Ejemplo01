package edx.ipnmexico.b2m1e1;

public class Elevador {

	//-> Atributos
	public int pesoMaximo;
	public int capacidadMaximaPersonas;
	
	//-> Constructor
	public Elevador() {
		//-> Inicializamos los atributos a través del constructor.
		pesoMaximo = 400;
		capacidadMaximaPersonas = 5;
	}
	
	//-> Métodos
	public int subirPiso( int pisoActual ) {
		return pisoActual + 1;
	}
	
	public int bajarPiso( int pisoActual ) {
		return pisoActual - 1;
	}
	
	public void abrirPuerta() {
		System .out .println( "Abriendo puertas." );
	}
	
	public void cerrarPuerta() {
		System .out .println( "Cerrando puertas." );
	}
	
}
