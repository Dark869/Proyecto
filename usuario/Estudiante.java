package usuario;
import java.io.Serializable;
import ejemplar.Ejemplar;
import ejemplar.PrestamoDevolucion;
public class Estudiante extends Usuario implements Serializable{
	private String matricula;
	private int prestamoEjemplar = 0;
	PrestamoDevolucion[] pd = new PrestamoDevolucion[3];
	public Estudiante(String matri, String n, String direc, String tel){
		super(n, direc, tel);
		this.matricula = matri;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String m){
		matricula = m;
	}

	public String toString(){
		return super.toString() +  "Matricula: " + matricula;
	}
	public int getPrestamos(){
		return prestamoEjemplar;
	}
	public void setPrestamos(int e){
		prestamoEjemplar =e;
	}
	public void addPrestamo(int d, int m, int a, Ejemplar e, Usuario u) {
		if(prestamoEjemplar<3) {
			pd[prestamoEjemplar] = new PrestamoDevolucion(d,m,a,e,u);
			prestamoEjemplar++;
		}else {
			System.out.println("No Puedes recibir mas prestamos");
		}
	}
	public PrestamoDevolucion getPrestamoDevolucion(int i) {
		return pd[i];
	}
	public void prestarLibro(){

	}
}
