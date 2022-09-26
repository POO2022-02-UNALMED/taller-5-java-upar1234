package gestion;
import zooAnimales.Animal;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;
import java.util.ArrayList;
import zooAnimales.Anfibio;

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
	zonas= new ArrayList<>();
}
public void agregarZonas(Zona zona) {
	zonas.add(zona);
}
public static int cantidadTotalAnimales() {
	 return (Ave.cantidadAves()+Mamifero.cantidadMamiferos()+Reptil.cantidadReptiles()+Anfibio.cantidadAnfibios()+Pez.cantidadPeces());
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
