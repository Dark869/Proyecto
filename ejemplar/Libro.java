package ejemplar;
import java.io.Serializable;
public class Libro extends Ejemplar{
	private String edicion;
	private String isbn;
	private int numExistencias;
	Editorial[] edit = new Editorial[1];
	private int numEditorial=0;
	public Libro(){}
	public Libro(String t, String aut, String anio, String edicion, String isbn, int ne){
		super(t,aut,anio);
		this.edicion = edicion;
		this.isbn = isbn;
		this.numExistencias = ne;
	}
	public String getEdicion(){
		return this.edicion;
	}
	public String getIsbn(){
		return this.isbn;
	}
	public int getNumExistencias(){
		return this.numExistencias;
	}

	public void setEdicion(String edicion){
		this.edicion = edicion;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setNumExistencias(int ne){
		this.numExistencias = ne;
	}
	public void addEditorial(String n, String p) {
		if(numEditorial<1){
			edit[numEditorial] = new Editorial(n,p);
			numEditorial++;
		}else {
			System.out.println("No se puede añadir otra editorial");
		}
	}
	public String getTitulo(){
		return titulo;
	}
	public String toString(){
		return super.toString() + "Edicion" + this.edicion + "\nISBN:" + this.isbn +"\nNumero de existencias:" + this.numExistencias + "\nEditorial:"+ edit[0].getNombre() + "\nUbicacion:" + edit[0].getPais();
	}
	
}
