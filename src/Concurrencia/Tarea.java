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
	}



	//-> Implementamos todos los métodos (Abstractos) que posee 
	//   esta interfaz. Solo posee el método "run()"
	@Override
	public void run() {
		cuenta();
		cuentaRegresiva();
	}
	
	private void cuenta() {
		int i = 0;
		do {
			System .out .println( "Soy la " + this .nombreTarea + " sumo " + i );
			i++;
		} while( i <= 30 );
	}

	private void cuentaRegresiva() {
		int i = 30;
		do {
			System .out .println( "Soy la " + this .nombreTarea + " resto " + i );
			i--;
		} while( i >= 0 );
	}
	
}
