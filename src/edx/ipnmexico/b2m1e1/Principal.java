package edx.ipnmexico.b2m1e1;

public class Principal {

	public static void main(String[] args) {
		
		//-> Clase padre
		Animal animal = new Animal();
		animal .desplazarse();	//: Método original en la clase padre.
		
		//-> Sub-Clases, Clases hijas o Clases que heredan de la clase padre
		Ave ave = new Ave();
		ave .desplazarse();		//: Accede al método sobre escrito en la clase "Ave"
		
		Pez pez = new Pez();
		pez .desplazarse();		//: Accede al método sobre escrito en la clase "Pez"
		
		MamiferoTerrestre mt = new MamiferoTerrestre();
		mt .desplazarse();		//: Accede al método sobre escrito en la clase "MamiferoTerrestre"
	}	
}
