package Problema03;

import Problema02.Temperatura;
import java.util.ArrayList;


public class Registro {

static final int capacidad_max = 30;
private String ciudad;
private  ArrayList<Temperatura> historico; 

public Registro() {
	this.ciudad = "-";
	this.historico = new ArrayList<>();
}

public Registro(String ciudad) {
	this.ciudad = ciudad;
	this.historico = new ArrayList<>();
}

public String getCiudad() {
	return this.ciudad;
}

void imprimir() {
	System.out.println("TEMPERATURAS REGISTRADAS EN: "+this.ciudad);
	for(int i=0; i<this.historico.size(); i++) {
		System.out.println((i+1)+". "+this.historico.get(i).toString());
	}
}

public void agregar(Temperatura t) {
	if(this.historico.size()==30) return;
	else this.historico.add(t);
}

public double mediaAsCelcius() {
	double media = 0;
	for(Temperatura temp : this.historico) {
		media += temp.asCelcius();
	}
	return media / this.historico.size();
}

public double mediaAsFahrenheit() {
	double media = 0;
	for(Temperatura temp : this.historico) {
		media += temp.asFahrenheit();
	}
	return media / this.historico.size();
}

public Temperatura maximo() {
	Temperatura max = historico.get(0);
	for(int i=1; i<this.historico.size()-1;i++) {
	if(this.historico.get(i).getGrados() > max.getGrados()) {
		max = historico.get(i);
	}
	}
	return max;
}

}
