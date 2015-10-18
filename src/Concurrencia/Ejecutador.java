package Concurrencia;

public class Ejecutador {

	public static void main(String[] args) {
		
		//-> Creamos 1 objetos que heredan de la interfaz "Runnable"
		Tarea tarea1 = new Tarea( "Tarea 1" );
		Tarea tarea2 = new Tarea( "Tarea 2" );
		
		//-> Creamos el Hilo que requiere un objeto que herede de "runnable"
		Thread hilo1 = new Thread( tarea1 );
		Thread hilo2 = new Thread( tarea2 );
		
		//-> Implicitamente llamamos al método "run()" de la implementación
		//   de la interfaz "Ruunable" usando el método "start()" sobre el
		//   hilo que contiene el objeto (La tarea a realizar).
		hilo1 .start();
		hilo2 .start();
		

	}

}
