package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int A=listado.size();
	
public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
}
public Ave () {
	this(null,0,null,null,null);
}

public int cantidadAves(){
	return aguilas+halcones;
	}
public String movimiento() {
		return "volar";
	}
public static Ave crearHalcon(String nombre, int edad, String genero) {
	halcones++;
	cantAves++;
	Ave halcon=new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	listado.add(halcon);
	return halcon;
}
public static Ave crearAguila(String nombre, int edad, String genero) {
	aguilas++;
	cantAves++;
	Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	listado.add(aguila);
	return aguila;
	}
public String getColorPlumas() {
	return colorPlumas;
}
public void setColorPlumas(String cp) {
	this.colorPlumas=cp;
}
}
