package edx.ipnmexico.b2m1e1;

public class Ave extends Animal {

	//-> @Override indica que se esta sobre escribiendo un método de la clase padre.
	@Override					
	public void desplazarse() {
		System .out .println( "Soy un Ave y me desplazo volando" );
	}
	
}
