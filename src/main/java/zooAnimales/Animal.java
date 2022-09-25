package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	private static int totalAnimales=(Mamifero.cantidadMamiferos()+Ave.cantidadAves()+Reptil.cantidadReptiles()+Pez.cantidadPeces()+Anfibio.cantidadAnfibios());
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static Zona zona;
	public static int cantMamiferos;
	public static int cantAves;
	public static int cantReptiles;
	public static int cantPeces;
	public static int cantAnfibios;
public Animal() {
	this(null,0,null,null);
}
public Animal(String nombre, int edad, String habitat, String genero) {
	this.nombre=nombre;
	this.edad=edad;
	this.habitat=habitat;
	this.genero=genero;
}
	
public String movimiento(){
	return "desplazarse";
	}
public static String totalPorTipo() {
	return ("Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+Anfibio.cantidadAnfibios());
}

public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero=genero;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad=edad;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat=habitat;
}
public int getTotalAnimales() {	
	return totalAnimales;
}
public void setTotalAnimales(int ta) {
	Animal.totalAnimales=ta;
}
public Zona getZona(){
	return zona;
}
public void setZona(Zona z){
	this.zona=z;
}

@Override
public String toString() {
	if (Animal.zona==null) {
		return ("Mi nombre es "+ getNombre() + ", tengo una edad de "+ getEdad() + ", habito en " + getHabitat() + "y mi genero es " + getGenero());	
		}
	else {
		return("Mi nombre es "+ getNombre()+ ", tengo una edad de "+getEdad() + ", habito en " + getHabitat() + "y mi genero es " + getGenero() + ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre());
	}
}

}
