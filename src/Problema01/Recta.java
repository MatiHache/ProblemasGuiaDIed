/**
 * 
 */
package Problema01;

/**
 * @author matiashillar
 *
 */
public class Recta {

private String ecuacion;
private Punto punto1;
private Punto punto2;
private float pendiente;
/**
 * @param p1
 * @param p2
 * Constructor de recta dados dos puntos
 */
public Recta(Punto p1, Punto p2) {
	this.punto1 = p1;
	this.punto2 = p2;
}
/**
 * Constructor de recta identidad
 */
public Recta() {
	this.punto1 = new Punto(0, 0);
	this.pendiente = 1;
}
/**
 * Calcula pendiente de recta en caso de que ésta no sea la identidad, cuya pendiente
 * ya se conoce
 * @return pendiente de la recta
 */
public float pendiente() {
	float pendiente;
	if(this.pendiente == 1) {pendiente = this.pendiente;}
	else {
		pendiente = ((this.punto2.getY() - this.punto1.getY()) / (this.punto2.getX() - this.punto1.getX()));
	}
	
	return pendiente;
}
/**
 * Indica si la recta pasada como parametro es igual al receptor
 */
public boolean equals(Object otraRecta) {
	if(this.mismosPuntos(this, (Recta)otraRecta) == true) {return true;}
	else if(mismaPendiente(this, (Recta)otraRecta) == true) {return true;}
	else {return false;}
}
/**
 * Verifica si las rectas son iguales analizando sus puntos
 * @param r1
 * @param r2
 * @return V o F
 */
private boolean mismosPuntos(Recta r1, Recta r2) {
	if((r1.punto1.equals(r2.punto1) && (r1.punto2.equals(r2.punto2)) || 
			(r1.punto1.equals(r2.punto2) && (r1.punto2.equals(r2.punto1))))) 
			{return true;}	
	else return false;
}
/**
 * Verifica si las rectas son iguales analizando sus pendientes
 * @param r1
 * @param r2
 * @return V o F
 */
private boolean mismaPendiente(Recta r1, Recta r2) {
	float pendiente;
	pendiente = ((r1.punto1.getY() - r2.punto1.getY()) / (r1.punto1.getX() - r2.punto1.getX()));
if(pendiente == r1.pendiente() && pendiente == r2.pendiente()) return true;
else return false;
}

}
