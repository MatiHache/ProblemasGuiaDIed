/**
 * 
 */
package Problema01;

/**
 * @author matiashillar
 *
 */
public class App {

	public static void main(String[] args) {
		
		Punto P1 = new Punto(1,1);
		Punto P2 = new Punto(2,2);
		
		Recta R1 = new Recta(P1, P2);
		System.out.println("Pendiente R1: "+R1.pendiente());
		
		Punto P3 = new Punto(3,3);
		
		Recta R2 = new Recta(P2,P3);
		System.out.println("¿Son iguales R1 y R2?: "+R1.equals(R2));
	}

}
