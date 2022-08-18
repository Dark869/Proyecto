package controlador;
import ejemplar.*;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import usuario.*;
import vista.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Controlador{
	private Tesis[] tesis;
	private int numTesis=0;

	private Libro[] libro;
	private int numLibros=0;

	private Estudiante[] estudiante;
	private int numEstudiantes=0;

	private Profesor[] profesor;
	private int numProfesores=0;

	private Director[] director;
	private int numDirectores=0;

	private PrestamoDevolucion[] presdevo;
	private int numPrestamos=0;
	private int numPrestamosPro=0;
	

	private Menu menu;
	private VentanaLectorEstudiante lector2;
	private VentanaLectorProfesor lector3;
	private VentanaLectorLibro lector4;
	private VentanaLectorTesis lector5;
	private VentanaPrestamoEstudiante lectorPrestamoEst;
	private VentanaPrestamoProfesor lectorPrestamoPro;
	private VentanaDevolverEstudiante lectorDevoEst;
	private VentanaDevolverProfesor lectorDevoPro;
	private LectorDatos lector;
	public Controlador() {
		
	}
	public void addMenu(Menu menu){
		this.menu=menu;
	}
	public void addVentanaEstudiante(VentanaLectorEstudiante lector){
		this.lector2=lector;
	}
	public void addVentanaProfesor(VentanaLectorProfesor lector){
		this.lector3=lector;
	}
	public void addVentanaLibro(VentanaLectorLibro lector){
		this.lector4=lector;
	}
	public void addVentanaTesis(VentanaLectorTesis lector){
		this.lector5=lector;
	}
	public void addVentanaPrestamoEstudiante(VentanaPrestamoEstudiante e){
		this.lectorPrestamoEst = e;
	}
	public void addVentanaPrestamoProfesor(VentanaPrestamoProfesor lectorPro) {
		this.lectorPrestamoPro=lectorPro;
	}
	public void addVentanaDevolverEstudiante(VentanaDevolverEstudiante lectorDevo){
		this.lectorDevoEst = lectorDevo;
	}
	public void addVentanaDevolverProfesor(VentanaDevolverProfesor lectorDevo){
		this.lectorDevoPro = lectorDevo;
	}
	public Controlador(Estudiante[] estudiante){
		this.estudiante = estudiante;
	}

	public Controlador(Profesor[] profesor){
		this.profesor = profesor;
	}

	public Controlador(Libro[] libro){
		this.libro = libro;
	}

	public Controlador(Tesis[] tesis){
		this.tesis = tesis;
	}
	public Controlador(Director[] director){
		this.director = director;
	}
	public Controlador(PrestamoDevolucion[] presdevo){
		this.presdevo = presdevo;
	}
	
	
	public Tesis[] getTesis() {
		return tesis;
	}

	public void setTesis(Tesis[] tesis) {
		this.tesis = tesis;
	}

	public int getNumTesis() {
		return numTesis;
	}

	public void setNumTesis(int numTesis) {
		this.numTesis = numTesis;
	}

	public Libro[] getLibro() {
		return libro;
	}

	public void setLibro(Libro[] libro) {
		this.libro = libro;
	}

	public int getNumLibros() {
		return numLibros;
	}

	public void setNumLibros(int numLibros) {
		this.numLibros = numLibros;
	}

	public Estudiante[] getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante[] estudiante) {
		this.estudiante = estudiante;
	}

	public int getNumEstudiantes() {
		return numEstudiantes;
	}

	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}

	public Profesor[] getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor[] profesor) {
		this.profesor = profesor;
	}

	public int getNumProfesores() {
		return numProfesores;
	}

	public void setNumProfesores(int numProfesores) {
		this.numProfesores = numProfesores;
	}

	public Director[] getDirector() {
		return director;
	}

	public void setDirector(Director[] director) {
		this.director = director;
	}

	public int getNumDirectores() {
		return numDirectores;
	}

	public void setNumDirectores(int numDirectores) {
		this.numDirectores = numDirectores;
	}

	public PrestamoDevolucion[] getPresdevo() {
		return presdevo;
	}

	public void setPresdevo(PrestamoDevolucion[] presdevo) {
		this.presdevo = presdevo;
	}

	public int getNumPrestamos() {
		return numPrestamos;
	}

	public void setNumPrestamos(int numPrestamos) {
		this.numPrestamos = numPrestamos;
	}

	public LectorDatos getLector() {
		return lector;
	}

	public void setLector(LectorDatos lector) {
		this.lector = lector;
	}

	public void agregarEstudiante(String matri, String nom, String direc, String tel) {
		System.out.println("num estudiantes " + estudiante.length);
		if(numEstudiantes<5){
			estudiante[numEstudiantes] = new Estudiante(matri,nom,direc,tel);
			System.out.println("Estudiante agregado correctamente");
			numEstudiantes++;
			System.out.println("....Ocultando y Destruyendo ventana.....");
	  		lector2.setVisible(false);
	 		lector2.dispose();
			try{
				System.out.println("Voy a guardar");
				FileOutputStream fos = new FileOutputStream("Estudiantes.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);	
				oos.writeObject(estudiante);
				oos.close();
			}catch(IOException e){
				System.out.println(e);
			}
			menu.iniciarMenu();
		}else{
			System.out.println("Ya no podemos registrar mas estudiantes :(");
		}
	}

	public void agregarProfesor(String n, String d, String t, String np, String f){
		if(numProfesores<5){
			profesor[numProfesores]= new Profesor(n,d,t,np,f);
			System.out.println("Profesor agregado correctamente");
			numProfesores++;
			System.out.println("....Ocultando y Destruyendo ventana.....");
	  		lector3.setVisible(false);
	 		lector3.dispose();
	 		try{
				System.out.println("Voy a guardar");
				FileOutputStream fos = new FileOutputStream("Profesores.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);	
				oos.writeObject(profesor);
				oos.close();
			}catch(IOException e){
				System.out.println(e);
			}
			menu.iniciarMenu();
		}else{
			System.out.println("Ya no podemos registrar mas profesores :(");
		}
	}
	public void agregarLibro(String t, String a, String an, String ed, String isbn, int ne, String edi, String p){
		if(numLibros<5){
			libro[numLibros] = new Libro(t,a,an,ed,isbn,ne);
			libro[numLibros].addEditorial(edi,p);
			System.out.println("Libro agregado correctamente");
			numLibros++;
			System.out.println("....Ocultando y Destruyendo ventana.....");
	  		lector4.setVisible(false);
	 		lector4.dispose();
	 		try{
				System.out.println("Voy a guardar");
				FileOutputStream fos = new FileOutputStream("Libros.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);	
				oos.writeObject(libro);
				oos.close();
			}catch(IOException e){
				System.out.println(e);
			}
			menu.iniciarMenu();
		}else{
			System.out.println("Ya no se pueden agregar mas libros :(");
		}
	}
	public void agregarTesis(String titulo, String autor, String anio,String clasif,String director){
		if(numTesis<5){
			tesis[numTesis] = new Tesis(titulo,autor,anio,clasif);
			tesis[numTesis].addDirector(director);
			System.out.println("Tesis agregada correctamente");
			numTesis++;
			lector5.setVisible(false);
			lector5.dispose();
			try{
				System.out.println("Voy a guardar");
				FileOutputStream fos = new FileOutputStream("Tesis.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);	
				oos.writeObject(tesis);
				oos.close();
			}catch(IOException e){
				System.out.println(e);
			}
			menu.iniciarMenu();
		}else{
			System.out.println("Ya no se pueden agregar mas tesis :(");
		}
		
	}


	public void agregarPrestamoEstudiante(int d, int m,int a, String titu, String matri){
		for(int i=0; i<estudiante.length; i++){
			System.out.println("KKKK");
			String aux = estudiante[i].getMatricula();
			if(matri.equals(aux)){
				System.out.println("El estudiante existe");
				for(int k=0; k<libro.length; k++){
					String aux1 = libro[k].getTitulo();
					if(titu.equals(aux1)){
						if(libro[k].getNumExistencias()>=1 && numPrestamos<3){
							presdevo[numPrestamos] = new PrestamoDevolucion(d,m,a,libro[k],estudiante[i]);
							numPrestamos++;
							System.out.println("El préstamo fue realizado");
							int exis = libro[k].getNumExistencias() - 1;
							libro[i].setNumExistencias(exis);
							System.out.println("Quedan " + libro[k].getNumExistencias() + " Ejemplares del libro " + libro[k].getTitulo());
							int e = estudiante[i].getPrestamos();
							e++;
							estudiante[i].setPrestamos(e);
							k=libro.length;
							lectorPrestamoEst.setVisible(false);
					 		lectorPrestamoEst.dispose();
							try{
								System.out.println("Voy a guardar");
								FileOutputStream fos = new FileOutputStream("PrestamoEstudiante.obj");
								ObjectOutputStream oos = new ObjectOutputStream(fos);	
								oos.writeObject(presdevo);
								oos.close();
							}catch(IOException e1){
								System.out.println(e1);
							}
							menu.iniciarMenu();
						}else{
							System.out.println("No hay existencias");
						}
						
					}else{
						System.out.println("El libro no esta registrado");
					}
				}
				i=estudiante.length;
			}
		}
		
	}
	public void agregarPrestamoProfesor(int d, int m,int a, String titu, String np){
		for(int i=0; i<profesor.length; i++){
			String aux = profesor[i].getNumeroDePersonal();
			if(np.equals(aux)){
				System.out.println("El profesor existe");
				for(int k=0; k<libro.length; k++){
					String aux1 = libro[k].getTitulo();
					if(titu.equals(aux1)){
						if(libro[k].getNumExistencias()>=1 && numPrestamosPro<5){
							presdevo[numPrestamosPro] = new PrestamoDevolucion(d,m,a,libro[k],profesor[i]);
							numPrestamosPro++;
							System.out.println("El préstamo fue realizado");
							int exis = libro[k].getNumExistencias() - 1;
							libro[i].setNumExistencias(exis);
							System.out.println("Quedan " + libro[k].getNumExistencias() + " Ejemplares del libro " + libro[k].getTitulo());
							int e = profesor[i].getPrestamos();
							e++;
							profesor[i].setPrestamos(e);
							k=libro.length;
							lectorPrestamoPro.setVisible(false);
					 		lectorPrestamoPro.dispose();
							try{
								System.out.println("Voy a guardar");
								FileOutputStream fos = new FileOutputStream("PrestamoProfesor.obj");
								ObjectOutputStream oos = new ObjectOutputStream(fos);	
								oos.writeObject(presdevo);
								oos.close();
							}catch(IOException e1){
								System.out.println(e1);
							}
							menu.iniciarMenu();
						}else{
							System.out.println("No hay existencias");
						}
						
					}else{
						System.out.println("El libro no esta registrado");
					}
				}
				i=profesor.length;
			}else{
				System.out.println("El Profesor no existe");
			}
		}	
	}
	public void devolverPrestamoEstudiante(int d, int m,int a, String titu, String matri){
		for(int i = 0; i<estudiante.length; i++){
			String aux = estudiante[i].getMatricula();
			if(matri.equals(estudiante[i].getMatricula())){
				for(int k=0; k<numLibros; k++) {
					String aux2 = libro[k].getTitulo();
					if(titu.equals(aux2)){
						System.out.println("La devolucion fue realizada");
						int exis = libro[k].getNumExistencias() + 1;
						libro[i].setNumExistencias(exis);
						System.out.println("Quedan " + libro[k].getNumExistencias() + " Ejemplares del libro " + libro[k].getTitulo());
						int e = estudiante[i].getPrestamos();
						e++;
						estudiante[i].setPrestamos(e);
						k=libro.length;
						lectorDevoEst.setVisible(false);
				 		lectorDevoEst.dispose();
						try{
							System.out.println("Voy a guardar");
							FileOutputStream fos = new FileOutputStream("DelvolverPrestamoEstudiante.obj");
							ObjectOutputStream oos = new ObjectOutputStream(fos);	
							oos.writeObject(presdevo);
							oos.close();
						}catch(IOException e1){
							System.out.println(e1);
						}
						menu.iniciarMenu();	
					}else {
						System.out.println("El estudiante no tiene el libro " + titu);
					}
				}
			i=estudiante.length;
			}
			else {
				System.out.println("La matricula " + matri +" No esta registrada");
			}
		}
		
		
	}
	
	public void devolverPrestamoProfesor(int d, int m,int a, String titu, String matri){
		for(int i = 0; i<profesor.length; i++){
			String aux = profesor[i].getNumeroDePersonal();
			if(matri.equals(profesor[i].getNumeroDePersonal())){
				System.out.println("Titulo del libro que se va a devolver");
				for(int k=0; k<libro.length; k++) {
					String aux2 = libro[k].getTitulo();
					if(titu.equals(aux2)){
						System.out.println("La devolucion fue realizada");
						int exis = libro[k].getNumExistencias() + 1;
						libro[i].setNumExistencias(exis);
						System.out.println("Quedan " + libro[k].getNumExistencias() + " Ejemplares del libro " + libro[k].getTitulo());
						int e = profesor[i].getPrestamos();
						e++;
						profesor[i].setPrestamos(e);
						k=libro.length;
						lectorDevoPro.setVisible(false);
				 		lectorDevoPro.dispose();
						try{
							System.out.println("Voy a guardar");
							FileOutputStream fos = new FileOutputStream("DelvolverPrestamoProfesor.obj");
							ObjectOutputStream oos = new ObjectOutputStream(fos);	
							oos.writeObject(presdevo);
							oos.close();
						}catch(IOException e1){
							System.out.println(e1);
						}
						menu.iniciarMenu();
					}
				}	
				i=profesor.length;
			}
		}	
	}
	public void mostrarEstudiante(int i){
		if(estudiante[i]!=null) {
			System.out.println("Mostrando estudiante "+(i+1) );
			System.out.println(estudiante[i]);
		}
		menu.iniciarMenu();
	}

	public void mostrarProfesor(int i){
		if(profesor[i] != null){
			System.out.println("Mostrando profesor "+(i+1));
			System.out.println(profesor[i]);
		}
		menu.iniciarMenu();
	}

	public void mostrarLibro(int i){
		if(libro[i] != null){
			System.out.println("Mostrando libro " + (i+1));
			System.out.println(libro[i]);
		}
		menu.iniciarMenu();
	}
	public void mostrarTesis(int i){
		if(tesis[i] != null){
			System.out.println("Mostrando tesis " + i);
			System.out.println(tesis[i]);
		}
		menu.iniciarMenu();
	}
	public void mostrarDirector(int i){
		if(director[i] != null) {
			System.out.println("Mostrando Director " + i);
			System.out.println(director[i]);
		}
		menu.iniciarMenu();
	}
}