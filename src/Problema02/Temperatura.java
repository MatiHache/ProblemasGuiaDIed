package Problema02;

public class Temperatura {

	private double grados;
	private Escala escala;
	/**
	 * Constructor por defecto
	 */
	public Temperatura () {
		this.escala = Escala.CELCIUS;
		this.grados = 0;
		
	}
	/**
	 * Constructor con parámetros pasados
	 * @param grados
	 * @param escala
	 */
	public Temperatura (double grados, Escala escala) {
		this.grados = grados;
		switch(escala) {
		case CELCIUS:
			this.escala = Escala.CELCIUS;
			break;
		case FAHRENHEIT:
			this.escala = Escala.FAHRENHEIT;
			break;
		}
		
	}
	public double getGrados() {
		return this.grados;
	}
	/**
	 * Devuelve un string con la temperatura, formateada
	 */
	public String toString() {
		String temp;
		switch(this.escala) {
		case FAHRENHEIT:
			temp = this.grados+"ºF";
			break;
		case CELCIUS:
			temp = this.grados+"ºC";
			break;
		default: temp = "Error";
		}
		return temp;
	}
	/**
	 * Devuelve temperatura en CELCIUS, haciendo conversion si es necesario
	 * @return grados
	 */
	public double asCelcius() {
		double grados;
		switch(this.escala) {
		case FAHRENHEIT:
			grados = (this.grados - 32) * ((double)5/9);
			break;
		case CELCIUS:
			return this.grados;
			
		default: grados = -1;
		}
		return grados;
	}
	/**
	 * Devuelve temperatura en Fahrenheit, haciendo conversion si es necesario
	 * @return grados
	 */
	public double asFahrenheit() {
		double grados;
		switch(this.escala) {
		case FAHRENHEIT:
			return this.grados;
			
		case CELCIUS:
			grados = this.grados * ((double)9/5) + 32;
			break;
		default: grados = -1;
		}
		return grados;
	}
	/**
	 * Aumenta temperatura en grados, realizando conversion si es necesario
	 * @param temp
	 */
	public void aumentar(Temperatura temp) {
	//	if(temp.grados <= 0) throw new Exception("Valor de temperatura inválido");
		//else {
		switch(this.escala) {	
		
	case FAHRENHEIT:
		if(temp.escala == Escala.FAHRENHEIT) {
			this.grados += temp.grados;
		}
			else {
				this.grados +=  temp.asFahrenheit();
			}	
		break;
		
	case CELCIUS:
		if(temp.escala == Escala.CELCIUS) {
			this.grados += temp.grados;
		}
			else {
				this.grados += temp.asCelcius();
			}	
		break;
		}
		}
		//}
	/**
	 * Disminuye temperatura en grados, realizando conversion si es necesario
	 * @param temp
	 */
	public void disminuir(Temperatura temp) {
		//if(temp.grados <= 0) throw new Exception("Valor de temperatura inválido");
		//else {
		switch(this.escala) {	
		
	case FAHRENHEIT:
		if(temp.escala == Escala.FAHRENHEIT) {
			this.grados -= temp.grados;
		}
			else {
				this.grados = this.asFahrenheit() - temp.grados;
			}	
		break;
		
	case CELCIUS:
		if(temp.escala == Escala.CELCIUS) {
			this.grados -= temp.grados;
		}
			else {
				this.grados = this.asCelcius() - temp.grados;
			}	
		break;
	}
	}
	//}
}
	

