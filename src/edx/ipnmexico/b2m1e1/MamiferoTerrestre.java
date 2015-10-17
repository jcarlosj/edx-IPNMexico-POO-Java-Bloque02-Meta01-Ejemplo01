package edx.ipnmexico.b2m1e1;

//-> "implements" es la forma como una clase hereda de una 
//   interfaz una o varias interfaces, es la equivalencia 
//   a la herencia múltiple, aunque Java no la soporta.
public class MamiferoTerrestre extends Animal implements Canivoro {

	//-> Método de la clase padré Animal
	@Override					
	public void desplazarse() {
		System .out .println( "Soy un Animal terrestre y me desplazo caminando" );
	}

	//-> Métodos de la interfaz Carnivoro
	@Override
	public void masticar() {
		// TODO Auto-generated method stub
		System .out .println( "Soy un animal terrestre y estoy masticando" );
	}

	@Override
	public void cazar( String instrumento ) {
		// TODO Auto-generated method stub
		System .out .println( "Soy un animal terrestre que caza con " + instrumento );
	}
	
	
	
}
