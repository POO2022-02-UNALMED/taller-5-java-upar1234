package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int P=listado.size();
	
public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
	super(nombre, edad, habitat, genero);
	this.colorEscamas=colorEscamas;
	this.cantidadAletas=cantidadAletas;
	listado.add(this);
}
public Pez() {
	this(null,0,null,null,null,0);
}
public int cantidadPeces() {
	return bacalaos+salmones;
}

public String movimiento() {
	return "nadar";
}
public static Pez crearSalmon(String nombre, int edad, String genero) {
	salmones++;
	cantPeces++;
	Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo",6);
	listado.add(salmon);
	return salmon;
	
}
public static Pez crearBacalao(String nombre, int edad, String genero) {
	bacalaos++;
	cantPeces++;
	Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
	listado.add(bacalao);
	return bacalao;
	}
public String getColorEscamas() {
	return colorEscamas;
}
public void setColorEscamas(String ce) {
	this.colorEscamas=ce;
}
public int getCantidadAletas() {
	return cantidadAletas;
}
public void setCantidadAletas(int lc) {
	this.cantidadAletas=lc;
}
}
