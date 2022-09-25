package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona extends Zoologico{
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<>();

public Zona(String nombre, Zoologico zoo) {
	this.nombre=nombre;
	this.zoo=zoo;
}
public Zona() {
	this(null, null);
}
public void agregarAnimales(Animal animal) {
	animales.add(animal);
}
public int cantidadAnimales() {
	return animales.size();
	}
public Zoologico getZoo() {
	return zoo;
}
public void setZoo(Zoologico zoo) {
	this.zoo=zoo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public Zona getZona(){
	return zonas;
}
public void setZona(Zona z){
	this.zonas=z;
}

}
