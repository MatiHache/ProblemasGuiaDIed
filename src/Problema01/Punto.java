/**
 * 
 */
package Problema01;



/**
 * @author matiashillar
 *
 */
public class Punto {

	/**
	 * @param args
	 */
	private float x;
	private float y;
	
	public Punto (float x, float y) {
		this.x = x;
		this.y = y;
		
	}

	public float getX() {
		return x;
	}

	public void setX(float nuevoValor) {
		this.x = nuevoValor;
	}

	public float getY() {
		return y;
	}

	public void setY(float nuevoValor) {
		this.y = nuevoValor;
	}
	
	public boolean equals(Object otroPunto) {
		if(otroPunto instanceof Punto && this.sonIguales((Punto)otroPunto, this)==true) {
		return true;
		}
		else {
			return false;
		}
		}
	
	private boolean sonIguales(Punto otroPunto, Punto unPunto) {
		if((unPunto.getX()==otroPunto.getX())&&(unPunto.getY()==otroPunto.getY())) {
			return true;
		}
		else {
			return false;
		}
	}

}
	



