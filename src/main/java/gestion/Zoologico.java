package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
public Zoologico() {
	this(null, null);
}
public Zoologico (String nombre, String ubicacion){
	this.nombre=nombre;
	this.ubicacion=ubicacion;
}
public void agregarZonas(Zona zona) {
	zonas.add(zona);
}
public int cantidadTotalAnimales() {
	 return (Animal.Mamifero.cantidadMamiferos+Animal.Ave.cantidadAves+Animal.Reptil.cantidadReptiles+Animal.Pez.cantidadPeces+Animal.Anfibio.cantidadAnfibios);
	}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
	}
public String getUbicacion() {
	return ubicacion;
}
public void setUbicacion(String ubicacion) {
	this.ubicacion=ubicacion;
	}
public ArrayList<Zona> getZona(){
		return zonas;
	}

}
