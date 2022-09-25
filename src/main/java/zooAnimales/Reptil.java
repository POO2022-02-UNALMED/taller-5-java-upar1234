package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int cantidadReptiles;

	
public Reptil(String nombre, int edad,String habitat, String genero,String colorEscamas, int largoCola) {
	super(nombre,edad,habitat,genero);
	this.colorEscamas=colorEscamas;
	this.largoCola=largoCola;
	cantidadReptiles++;

}
public Reptil() {
	this(null,0,null,null,null,0);
}
public static int cantidadReptiles() {
	return cantidadReptiles;
}
public String movimiento() {
	return "reptar";
}
public static Reptil crearIguana(String nombre, int edad, String genero) {
	iguanas++;
	cantidadReptiles++;
	
	Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	listado.add(iguana);
	return iguana;
}
public static Reptil crearSerpiente(String nombre, int edad, String genero) {
	serpientes++;
	cantidadReptiles++;

	Reptil serpiente= new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	listado.add(serpiente);
	return serpiente;
	}
public String getColorEscamas() {
	return colorEscamas;
}
public void setColorEscamas(String ce) {
	this.colorEscamas=ce;
}
public int getLargoCola() {
	return largoCola;
}
public void setLargoCola(int lc) {
	this.largoCola=lc;
}
}
