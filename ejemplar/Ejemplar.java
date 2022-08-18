package ejemplar;
import java.io.Serializable;
public abstract class Ejemplar implements Serializable{
	
	protected String titulo;
	protected String autor;
	protected String anio;
	public Ejemplar(){}
	public Ejemplar(String t, String autor, String anio){
		this.titulo = t;
		this.autor = autor;
		this.anio = anio;
	}
	

	public String getTitulo(){
		return this.titulo;
	}
	public String getAutor(){
		return this.autor;
	}
	public String getAnio(){
		return this.anio;
	}

	public void setTitulo(String t){
		this.titulo=t;
	}
	public void setAutor(String aut){
		this.autor=aut;
	}
	public void setAnio(String anio){
		this.anio=anio;
	}
	
	public String toString(){
		return "Titulo:" + this.titulo + "\nAutor:" + this.autor + "\nAño:" + this.anio + "\n";
	}
}
