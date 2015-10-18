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
			
			//-> Valida si la cuenta va en 4
			if( this .dato == 4 ) {
				//-> Se recomienda usar un "try-catch"
				try {
					Thread .sleep( 7000 ); 		//: Detemenos la aplicación por 7 seguntos (Valor en miliseguntos). 
				} catch (Exception e) {
					//-> Imprime la excepción
					System .out .println( e );
				}
			}
			
			//-> Valida si la cuenta va en 22
			if( this .dato == 22 ) {
				//-> Se recomienda usar un "try-catch", pues puede resultar que el hilo ya este detenido.
				try {
					Thread .sleep( 3000 ); 		//: Detemenos la aplicación por 3 seguntos (Valor en miliseguntos). 
				} catch (Exception e) {
					//-> Imprime la excepción
					System .out .println( e );
				}
			}
			
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
