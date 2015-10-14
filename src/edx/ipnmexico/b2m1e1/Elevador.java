package edx.ipnmexico.b2m1e1;

public class Elevador {

	//-> Atributos
	public int pesoMaximo;
	public int capacidadMaximaPersonas;
	
	//-> Constructor
	//   Pasamos los parámetros que recibirá el constructor (peso, capacidad)
	public Elevador( int peso, int capacidad ) {	
		//-> Inicializamos los atributos a través del constructor.
		pesoMaximo = peso;						//: Asignamos el valor entrante al atributo "pesoMaximo" de la clase
		capacidadMaximaPersonas = capacidad;	//: Asignamos el valor entrante al atributo "capacidadMaximaPersonas" de la clase
	}
	
	//-> Métodos
	public int subirPiso( int pisoActual ) {
		return pisoActual + 1;
	}
	
	public int bajarPiso( int pisoActual ) {
		return pisoActual - 1;
	}
	
	public void abrirPuerta() {
		System .out .println( " - Abriendo puertas." );
	}
	
	public void cerrarPuerta() {
		System .out .println( " - Cerrando puertas." );
	}
	
}
