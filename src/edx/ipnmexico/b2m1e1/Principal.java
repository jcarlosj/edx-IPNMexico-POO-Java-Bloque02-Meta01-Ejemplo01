package edx.ipnmexico.b2m1e1;

public class Principal {

	public static void main(String[] args) {
		
		//-> Sub-Clases, Clases hijas o Clases que heredan de la clase padre
		Ave ave = new Ave();								
		Pez pez = new Pez();
		MamiferoTerrestre mt = new MamiferoTerrestre();
		
		//-> Realizamos el desplazamiento pasando cada uno de los objetos
		DesplazarAnimal( ave ); 		//: El objeto "ave" es de tipo "Ave" y de tipo "Animal"
		DesplazarAnimal( pez ); 		//: El objeto "pez" es de tipo "Pez" y de tipo "Animal"
		DesplazarAnimal( mt ); 			//: El objeto "mt" es de tipo "MamiferoTerrestre" y de tipo "Animal"

		//-> Haciendo uso de la implementación de la interfaz carnívoro
		mt .masticar();
		mt .cazar( "garras" );
		
	}	
	
	//-> Muestra cada tipo de desplazamiento ya que aunque cada objeto que se le pasa
	//   es de tipo "Animal" por herencia, hace una generalización para poder acceder 
	//   a sus métodos
	public static void DesplazarAnimal( Animal animal ) {
		//-> Realiza la generalización y trata el objeto solo como de tipo animal.
		//   Osea con el tipo que trae por herencia de su padre.
		animal .desplazarse();
	}
}
