package edx.ipnmexico.b2m1e1;

public class Principal {

	public static void main(String[] args) {
		//-> Creamos el primer objeto de tipo Elevador
		//   para un elevador de baja capacidad
		Elevador elevadorPequenio = new Elevador( 400, 5 );			//: Instanciamos y pasamos parámetros para el elevador pequeño.
		
		//-> Imprimimos los valores iniciales
		//   Cambiamos la forma como accedemos a los atributos a través del métodos adecuado para esto.
		System .out .println( "Elevador pequeño (valores iniciales)" 
			+ "\n - peso máximo: " + elevadorPequenio .getPesoMaximo() + " kilogramos" 
			+ "\n - capacidad máxima: " + elevadorPequenio .getCapacidadMaximaPersonas() + " personas" );
		
		//-> Imprimimos los valores finales
		//   Modificamos los valores del objeto accediendo a sus atributos a través de los métodos adecuados para hacerlo
		elevadorPequenio .setPesoMaximo( 250 );			
		elevadorPequenio .setCapacidadMaximaPersonas( 3 );
		
		System .out .println( "Elevador pequeño (valores finales)" 
				+ "\n - peso máximo: " + elevadorPequenio .getPesoMaximo() + " kilogramos" 
				+ "\n - capacidad máxima: " + elevadorPequenio .getCapacidadMaximaPersonas() + " personas" );
	}

}
