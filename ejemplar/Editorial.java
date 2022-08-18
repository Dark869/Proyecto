package ejemplar;
import java.io.Serializable;
public class Editorial implements Serializable{
	private String pais;
	private String nombre;
	public Editorial(String n, String p){
		this.nombre=n;
		this.pais=p;
	}
	public void setPais(String p){
		pais=p;
	}
	public void setNombre(String n){
		nombre=n;
	}
	public String getPais(){
		return pais;
	}
	public String getNombre(){
		return nombre;
	}
}

