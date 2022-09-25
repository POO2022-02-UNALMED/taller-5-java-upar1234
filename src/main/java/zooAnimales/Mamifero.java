package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	private static int caballos;
	private static int leones;
	private boolean pelaje;
	private int patas;
	public static int M=listado.size();
	
	
public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
	super(nombre, edad, habitat, genero);
	this.pelaje=pelaje;
	this.patas=patas;
	listado.add(this);
	
}
public Mamifero() {
	this(null,0,null,null,false,0);
}

public int cantidadMamiferos() {
	return caballos+leones;
	}
public static Mamifero crearCaballo(String nombre, int edad, String genero) {
	
	Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4); 
	caballos++;
	cantMamiferos++;
	listado.add(caballo);
	return caballo;
	}
public static Mamifero crearLeon(String nombre, int edad, String genero) {
	leones++;
	cantMamiferos++;
	Mamifero leon=new Mamifero(nombre, edad, "selva", genero, true, 4);
	listado.add(leon);
	return leon;	
	}
public boolean getPelaje() {
	return pelaje;
}
public void setPelaje(boolean p) {
	this.pelaje=p;
}
public int getPatas() {
	return patas;
}
public void setPatas(int p) {
	this.patas=p;
}
public int getCaballos(){
	return caballos;
}
public void setCaballos(int caballos){
	this.caballos=caballos;
}
public int getLeones(){
	return leones;
}
public void setLeones(int l){
	this.leones=l;
}
}
