package edx.ipnmexico.b2m1e1;

public class Principal {

	public static void main(String[] args) {
		//-> Creamos el primer objeto de tipo Elevador
		//   para un elevador de baja capacidad
		Elevador elevadorPequenio = new Elevador( 400, 5 );		//: Instanciamos y pasamos parámetros para el elevador pequeño.
		System .out .println( "Elevador pequeño \n - Peso Máximo: " + elevadorPequenio .pesoMaximo + "\n - Capacidad " + elevadorPequenio .capacidadMaximaPersonas );
		
		//-> Creamos el segundo objeto de tipo Elevador
		//   para un elevador de más capacidad
		Elevador elevadorMasGrande = new Elevador( 800, 10 );	//: Instanciamos y pasamos parámetros para el elevador grande.
		System .out .print( "Elevador grande \n - Peso Máximo: " + elevadorMasGrande .pesoMaximo + "\n - Capacidad " + elevadorMasGrande .capacidadMaximaPersonas );
		
		//-> Operamos el elevador pequeño
		//   para ello debemos acceder a sus funcionalidades programadas.
		//System .out .println( "\n\nElevador pequeño" );
		//elevadorPequenio .cerrarPuerta();
		//System .out .println( " - Ha bajado al piso: " + elevadorPequenio .bajarPiso( 7 ));
		
		//-> Paso de referencia.
		Elevador otroElevador = elevadorPequenio;	//: Asignamos un objeto "Elevador" a uno nuevo no instanciado.
		System .out .println( "\n\nReferencias de memoria de los 2 objetos" );
		System .out .println( " - otroElevador    : " + elevadorPequenio + "\n - elevadorPequenio: " + otroElevador );
		
		//-> Cambiamos el valor de la referencia y vemos los cambios en el objeto original y el que se asignó por referencia
		otroElevador .capacidadMaximaPersonas = 3;
		System .out .println();
		System .out .println( " > Capacidad máxima (otroElevador)    : " + otroElevador .capacidadMaximaPersonas + " personas" );
		System .out .println( " > Capacidad máxima (elevadorPequenio): " + elevadorPequenio .capacidadMaximaPersonas + " personas" );
	}

}
