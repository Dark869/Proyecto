package usuario;
import java.io.Serializable;
public class Profesor extends Usuario implements Serializable{
	private String numeroDePersonal;
	private String facultad;
	private int prestamoEjemplar;
	public Profesor(String nom, String direc, String tel, String np, String facul){
		super(nom, direc, tel);
		numeroDePersonal= np;
		facultad=facul;
	}
	public String getNumeroDePersonal(){
		return numeroDePersonal;
	}
	public String getFacultad(){
		return facultad;
	}
	public void setNumeroDePersonal(String np){
		numeroDePersonal=np;
	}
	public void setFacultad(String f){
		facultad=f;
	}

	public String toString(){
		return super.toString() + "Numero de personal: " + numeroDePersonal + " Facultad: " + facultad; 
	}
	public void prestarLibro(){

	}
	public int getPrestamos() {
		return prestamoEjemplar;
	}
	public void setPrestamos(int pe) {
		this.prestamoEjemplar=pe;
	}
	public void setNumPersonal(String np){
		this.numeroDePersonal=np;
	}
}
