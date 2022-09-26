package zooAnimales;
import java.util.ArrayList;


public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;	
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int cantidadAnfibios;


public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
	super(nombre,edad,habitat,genero);
	this.colorPiel=colorPiel;
	this.venenoso=venenoso;
	cantidadAnfibios++;
	listado= new ArrayList<>();
	
}
public Anfibio () {
	this(null, 0, null, null, null, false);
}
public static int cantidadAnfibios() {
	return cantidadAnfibios;
}
public String movimiento() {
	return "saltar";
}
public static Anfibio crearRana(String nombre, int edad, String genero) {
	ranas++;
	cantidadAnfibios++;
	
	Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo",true);
	return rana;
}
public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
	salamandras++;
	cantidadAnfibios++;

	Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	listado.add(salamandra);
	return salamandra;
	}	
public String getColorPiel() {
	return colorPiel;
}
public void setColorPiel(String ce) {
	this.colorPiel=ce;
}
public boolean isVenenoso() {
	return venenoso;
}
public void setVenenoso(boolean lc) {
	this.venenoso=lc;
}
}
