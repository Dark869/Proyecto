import ejemplar.*;
import usuario.*;
import vista.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import controlador.*;
public class Main{
	public static void main(String[] args) throws ClassNotFoundException{
		Menu vista = new Menu();
		Estudiante[] estudiante = new Estudiante[5];
		Libro[] libro = new Libro[5];
		Profesor[] profesor = new Profesor[5];
		Tesis[] tesis = new Tesis[5];
		Director[] director = new Director[5];
		PrestamoDevolucion[] prestamos = new PrestamoDevolucion[10];
		
		
		try{
			FileInputStream fisE = new FileInputStream("Estudiantes.obj");
			ObjectInputStream oisE = new ObjectInputStream(fisE);
			estudiante = (Estudiante[]) oisE.readObject();
			
			FileInputStream fisP = new FileInputStream("Profesores.obj");
			ObjectInputStream oisP = new ObjectInputStream(fisP);
			profesor = (Profesor[]) oisP.readObject();
		
			FileInputStream fisL = new FileInputStream("Libros.obj");
			ObjectInputStream oisL = new ObjectInputStream(fisL);
			libro = (Libro[]) oisL.readObject();
	
			FileInputStream fisT = new FileInputStream("Tesis.obj");
			ObjectInputStream oisT = new ObjectInputStream(fisT);
			tesis = (Tesis[]) oisT.readObject();
			
			
		
			FileInputStream fisPD = new FileInputStream("PrestamoDevolucion.obj");
			ObjectInputStream oisPD = new ObjectInputStream(fisPD);
			prestamos = (PrestamoDevolucion[]) oisPD.readObject();
		}catch(IOException e){
			System.err.println(e);
		}
		Controlador control = new Controlador();
		control.setEstudiante(estudiante);
		control.setLibro(libro);
		control.setProfesor(profesor);
		control.setTesis(tesis);
		control.setDirector(director);
		control.setPresdevo(prestamos);
		vista.addControlador(control);
		control.addMenu(vista);
		vista.iniciarMenu();
	}
}
