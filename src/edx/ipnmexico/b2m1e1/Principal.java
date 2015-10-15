package edx.ipnmexico.b2m1e1;

public class Principal {

	public static void main(String[] args) {
		
		ElevadorAutos elevadorAutos = new ElevadorAutos( 400, 5 );		//: Instanciamos y pasamos parámetros para el elevador autos.

		System .out .print( "Elevador Autos\n - Hemos subido al piso: " + elevadorAutos .subirPiso( 5 ) + "\n" );
		elevadorAutos .abrirPuerta();
		elevadorAutos .cerrarPuerta();
		System .out .print( " - Hemos bajado al piso: " + elevadorAutos .bajarPiso( 6 ) + "\n" );
	}	
}
