package ejemplar;
import java.io.Serializable;
public class Director implements Serializable{
	private String nombre;
	public Director(String n){
		nombre = n;
	}
	public void setNombre(String n){
		nombre = n;
	}
	public String getNombre(){
		return nombre;
	}
	public String toString(){
		return "Nombre: " + nombre;
	}
}
