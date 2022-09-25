package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int cantidadAves;
	
public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		cantidadAves++;
		cantAves++;

}
public Ave () {
	this(null,0,null,null,null);
}

public static int cantidadAves(){
	return cantidadAves;
	}
public String movimiento() {
		return "volar";
	}
public static Ave crearHalcon(String nombre, int edad, String genero) {
	halcones++;
	cantidadAves++;
	cantAves++;
	Ave halcon=new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	listado.add(halcon);
	return halcon;
}
public static Ave crearAguila(String nombre, int edad, String genero) {
	aguilas++;
	cantidadAves++;
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
