package usuario;
import java.io.Serializable;
public abstract class Usuario implements Serializable {
	protected String nombre = "";
	protected String direccion = "";
	protected String telefono = "";

	public Usuario(String n, String direc, String tel){
		this.nombre=n;
		this.direccion=direc;
		this.telefono=tel;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public String getTelefono(){
		return this.telefono;
	}

	public void setNombre(String n){
		this.nombre=n;
	}
	public void setDireccion(String direc){
		this.direccion=direc;
	}
	public void setTelefono(String tel){
		this.telefono=tel;
	}

	public String toString(){
		return "Nombre:"+ this.nombre + "\nDireccion:" + this.direccion +"\nTelefono:" + this.telefono + "\n";
	}
	public abstract void prestarLibro();
}
