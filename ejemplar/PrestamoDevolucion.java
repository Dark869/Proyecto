package ejemplar;
import usuario.*;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.io.Serializable;
public class PrestamoDevolucion implements Serializable{
	private int dia;
	private int mes;
	private int anio;
	private Ejemplar existe;
	private Usuario registrado;
	public PrestamoDevolucion() {
		
	}
	public PrestamoDevolucion(int d, int m, int a, Ejemplar e, Usuario u){
		this.dia=d;
		this.mes=m;
		this.anio=a;
		existe = e;
		registrado = u;
	}
	
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAnio(){
		return this.anio;
	}

	public void setDia(int d){
		this.dia=d;
	}
	public void setMes(int m){
		this.mes=m;
	}
	public void setAnio(int a){
		this.anio=a;
	}
	public Ejemplar getEjemplar(){
		return existe;
	}
	public Usuario getUsuario(){
		return registrado;
	}
	public int Devolver(int d, int m, int a){
		LocalDate inicio = LocalDate.of(this.anio, this.mes, this.dia);
		LocalDate fin = LocalDate.of(a, m, d);
		long dias = DAYS.between(inicio, fin);
		int salida =(int)dias;
		return salida;
	}
	public String toString(){
		return "Fecha de Prestamo...Dia: "+dia+"  Mes: "+mes+"  Añio:"+anio+"  Ejemplar:"+existe+"  Usuario:"+registrado;
	}	

}