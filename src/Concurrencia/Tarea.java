package Concurrencia;

//-> Para que una clase "Tarea" funcione como tal debe heredar
//   de la interfaz "Runnable"
public class Tarea implements Runnable {

	//-> Atributos (Comunes)
	private String nombreTarea;
	private int dato;
	
	//-> Constructor
	public Tarea( String nombreTarea ) {
		super();
		this .nombreTarea = nombreTarea;
		this .dato = 0;
	}



	//-> Implementamos todos los métodos (Abstractos) que posee 
	//   esta interfaz. Solo posee el método "run()"
	@Override
	public void run() {
		cuenta();
		cuentaRegresiva();
	}
	
	private void cuenta() {
		do {
			System .out .println( "Soy la " + this .nombreTarea + " sumo " + this .dato );
			this .dato++;
		} while( this .dato <= 30 );
	}

	private void cuentaRegresiva() {
		this .dato--;
		do {
			System .out .println( "Soy la " + this .nombreTarea + " resto " + this .dato );
			this .dato--;
		} while( this .dato >= 0 );
	}
	
}
