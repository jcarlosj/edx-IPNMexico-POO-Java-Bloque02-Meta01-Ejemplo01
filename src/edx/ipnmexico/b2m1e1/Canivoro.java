package edx.ipnmexico.b2m1e1;

//-> En una interface todos los métodos son Abstractos y NO debe
//   usarse modificador de clase o metodo "abstract" pues implicitamente
//   ya lo esta.
public interface Canivoro {

	//-> Declaramos los métodos sin cuerpo, por que aquí se dice que 
	//   van a hacer las clases hijos que la hereden pero no se les va 
	//   a decir como.
	public void masticar();
	
	public void cazar( String instrumento );
	
}
