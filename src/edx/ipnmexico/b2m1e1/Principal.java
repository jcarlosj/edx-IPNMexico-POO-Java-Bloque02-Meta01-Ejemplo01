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
	}

}
