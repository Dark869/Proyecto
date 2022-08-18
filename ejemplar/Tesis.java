package ejemplar;
import java.io.Serializable;
public class Tesis extends Ejemplar{
	private String clasif;
	Director[] directores = new Director[5];
	int numDirectores=0;
	public Tesis(){}
	public Tesis(String t, String aut, String anio, String clasif){
		super(t, aut, anio);
		this.clasif = clasif;
	}
	public void addDirector(String n) {
		if(numDirectores<5) {
			directores[numDirectores] = new Director(n);
			numDirectores++;
		}else {
			System.out.println("Ya no se puede tener mas directores en la Tesis de ");
		}		
	}
	public Director getDirector(int i){
		return directores[i];
	}
	public String getClasif(){
		return this.clasif;
	}
	public void setClasif(String clasif){
		this.clasif=clasif;
	}
	public String toString(){
		return super.toString()+"Clasificación:" + this.clasif +"\nDirector:" + directores[0].getNombre()+"\n";
	}
}