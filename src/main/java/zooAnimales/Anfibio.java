package zooAnimales;
import java.util.ArrayList;


public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;	
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int A=listado.size();

public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
	super(nombre,edad,habitat,genero);
	this.colorPiel=colorPiel;
	this.venenoso=venenoso;
	listado.add(this);
}
public Anfibio () {
	this(null, 0, null, null, null, false);
}
public int cantidadAnfibios() {
	return ranas+salamandras;
}
public String movimiento() {
	return "saltar";
}
public static Anfibio crearRana(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
	ranas++;
	cantAnfibios++;
	Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo",true);
	return rana;
}
public static Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
	salamandras++;
	cantAnfibios++;
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
public boolean getVenenoso() {
	return venenoso;
}
public void setVenenoso(boolean lc) {
	this.venenoso=lc;
}
}
