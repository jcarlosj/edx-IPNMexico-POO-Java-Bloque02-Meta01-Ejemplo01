package edx.ipnmexico.b2m1e1;

//-> Se hereda de la clase Animal que ahora es abstracta
public class Pez extends Animal {

	//-> @Override indica que se esta sobre escribiendo un método de la clase padre.
	@Override					
	public void desplazarse() {
		System .out .println( "Soy un Pez y me desplazo nadando" );
	}
	
}
