package Problema03;

import Problema02.Temperatura;

import java.util.Random;

import Problema02.Escala;

public class App {

	public static void main(String[] args) {
		Registro r1 = new Registro("DENVER");
		Registro r2 = new Registro("NAIROBI");
		Random generadorAleatorio = new Random();
		for(int i=0;i<10;i++) {
		r1.agregar(new
		Temperatura(generadorAleatorio.nextDouble()*50,Escala.CELCIUS));
		}
		for(int i=0;i<10;i++) {
		r2.agregar(new
		Temperatura(generadorAleatorio.nextDouble()*105,Escala.FAHRENHEIT));
		}
		r1.imprimir();
		System.out.println("Promedio en "+r1.getCiudad()+" :"+r1.mediaAsCelcius()
		+" C°");
		System.out.println("Maximo en "+r1.getCiudad()+":"+r1.maximo().asCelcius()
		+" C°");
		r2.imprimir();
		System.out.println("Promedio en "+r2.getCiudad()+":"+r2.mediaAsFahrenheit() +" F°");
		System.out.println("Maximo en "+r2.getCiudad()+":"+r2.maximo().asFahrenheit() +"F°");
		}

}
