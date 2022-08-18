package vista;
import controlador.*;
import java.util.Scanner;

public class Menu{
	private Controlador controladorTotal;
	private Controlador controlEstudiante;
	private Controlador controlLibro;
	private Controlador controlProfesor;
	private Controlador controlTesis;
	private Controlador controlDirector;
	private Controlador controlPrestamoDevolucion;
	private Scanner sc = new Scanner(System.in);
	private VentanaLectorEstudiante lector;
	private VentanaLectorProfesor lectorP;
	private VentanaLectorLibro lectorL;
	private VentanaLectorTesis lectorT;
	private VentanaPrestamoEstudiante lectorPrestamo;
	private VentanaPrestamoProfesor lectorPrestamoPro;
	private VentanaDevolverEstudiante lectorDevoEst;
	private VentanaDevolverProfesor lectorDevoPro;
	private int opc, opc2;	

	public void addControlador(Controlador controladort) {
		this.controladorTotal = controladort;
	}
	public void addControladorUsuario(Controlador controlUsu){
		controlEstudiante=controlUsu;
	}
	public void addControladorEjemplar(Controlador controlEjem){
		controlLibro = controlEjem;
	}
	public void addControladorProfesor(Controlador controlProf){
		controlProfesor = controlProf;
	}
	public void addControladorTesis(Controlador controlTesi){
		controlTesis = controlTesi;
	}
	public void addControladorDirector(Controlador controlDirector){
		controlDirector = controlDirector;
	}
	public void addControladorPrestamoDevolucion(Controlador controlPresDevo){
		controlPrestamoDevolucion = controlPresDevo;
	}
		public void iniciarMenu(){
		
		solicitaOpcion();
		opc=leerOpcion();
		switch (opc){
		case 1:
			System.out.println(".....Menú de Estudiantes.....");
			solicitaOpcion2();
			opc2=leerOpcion();
			switch (opc2){
			case 1:
				lector = new VentanaLectorEstudiante();
				lector.addControlador(controladorTotal);
				controladorTotal.addVentanaEstudiante(lector);
				lector.mostrarVentana();
				
				break;
			case 2:
				for(int i=0;i<5;i++) {
					controladorTotal.mostrarEstudiante(i);
				}
				break;
			case 3:
				System.out.println("Regresando al menu principal");
				iniciarMenu();
				break;
			  default:
				System.out.println("Opcion no Valida");
				break;
			}
			break;
		case 2:
			System.out.println(".....Menú de Profesores.....");
			solicitaOpcion2();
			opc2=leerOpcion();
			switch (opc2){
			case 1:
				lectorP = new VentanaLectorProfesor();
				lectorP.addControlador(controladorTotal);
				controladorTotal.addVentanaProfesor(lectorP);
				lectorP.mostrarVentana();
				break;
			case 2:
				for(int i=0;i<5;i++) {
					controladorTotal.mostrarProfesor(i);
				}
				break;
			case 3:
				System.out.println("Regresando al menu principal");
				iniciarMenu();
				break;
			  default:
				System.out.println("Opcion no Valida");
				break;
			}
			break;
		case 3:
			System.out.println(".....Menú de Libros.....");
			solicitaOpcion2();
			opc2=leerOpcion();
			System.out.println("opción 2");
			switch (opc2){
			  case 1:
				lectorL = new VentanaLectorLibro();
				lectorL.addControlador(controladorTotal);
				controladorTotal.addVentanaLibro(lectorL);
				lectorL.mostrarVentana();
				break;
			  case 2:
				for(int i=0; i<5;i++){
					controladorTotal.mostrarLibro(i);
				}
				break;
			  case 3:
				System.out.println("Regresando al menu principal");
				iniciarMenu();
				break;
			  default:
				System.out.println("Opcion no Valida");
				break;
			}
			break;
		case 4:
			System.out.println(".....Menú de Tesis.....");
			solicitaOpcion2();
			opc2=leerOpcion();
			System.out.println("opción 2");
			switch (opc2){
			  case 1:
				  lectorT = new VentanaLectorTesis();
				  lectorT.addControlador(controladorTotal);
				  controladorTotal.addVentanaTesis(lectorT);
				  lectorT.mostrarVentana();
				break;
			  case 2:
				for(int i=0;i<5;i++){
					controladorTotal.mostrarTesis(i);
				}
				break;
			  case 3:
				System.out.println("Regresando al menu principal");
				iniciarMenu();
				break;
			  default:
				System.out.println("Opcion no Valida");
				break;
			}
			break;
		case 5:
			System.out.println(".....Menú de Prestamos.....");
			solicitaOpcion3();
			opc2=leerOpcion();
			switch (opc2){
			  case 1:
				System.out.println("Quien va a recibir el préstamo?");
				System.out.println("1 : Estudiante");
				System.out.println("2 : Profesor");
				System.out.println("3 : Regresar");
				int opc3 = leerOpcion();
				switch(opc3){
					case 1:
						lectorPrestamo = new VentanaPrestamoEstudiante();
						lectorPrestamo.addControlador(controladorTotal);
						controladorTotal.addVentanaPrestamoEstudiante(lectorPrestamo);
						lectorPrestamo.mostrarVentana();
					break;
					case 2:
						lectorPrestamoPro = new VentanaPrestamoProfesor();
						lectorPrestamoPro.addControlador(controladorTotal);
						controladorTotal.addVentanaPrestamoProfesor(lectorPrestamoPro);
						lectorPrestamoPro.mostrarVentana();
					break;
					case 3:
						System.out.println("Regresando al menu principal");
						iniciarMenu();
					break;
			  		default:
						System.out.println("Opcion no Valida");
						iniciarMenu();
					break;
				}
				break;
			  case 2:
				System.out.println("Quien va a devolver el préstamo?");
				System.out.println("1 : Estudiante");
				System.out.println("2 : Profesor");
				System.out.println("3 : Regresar");
				int opc4 = leerOpcion();
				switch(opc4){
					case 1:
						lectorDevoEst = new VentanaDevolverEstudiante();
						lectorDevoEst.addControlador(controladorTotal);
						controladorTotal.addVentanaDevolverEstudiante(lectorDevoEst);
						lectorDevoEst.mostrarVentana();
					break;
					case 2:
						lectorDevoPro = new VentanaDevolverProfesor();
						lectorDevoPro.addControlador(controladorTotal);
						controladorTotal.addVentanaDevolverProfesor(lectorDevoPro);
						lectorDevoPro.mostrarVentana();
					break;
					case 3:
						System.out.println("Regresando al menu principal");
						iniciarMenu();
					break;
				
				}
				break;
			  case 3:
				System.out.println("Regresando al menu principal");
				iniciarMenu();
				break;
			  default:
				System.out.println("Opcion no Valida");
				break;
			}
			break;
		
		default:
			System.out.println("Opcion no Valida");
			break;
		}
	}

	public void solicitaOpcion(){
		System.out.println(" 1: Estudiantes");
		System.out.println(" 2: Profesores");
		System.out.println(" 3: Libros");
		System.out.println(" 4: Tesis");
		System.out.println(" 5: Prestamos");
		System.out.println(" 6: Salir");
	}
	public void solicitaOpcion2(){
		System.out.println(" 1: Agregar");
		System.out.println(" 2: Consultar");
		System.out.println(" 3: Regresar");	
	}
	public void solicitaOpcion3(){
		System.out.println(" 1: Prestar");
		System.out.println(" 2: Devolver");
		System.out.println(" 3: Regresar");
	}
	public int leerOpcion(){
		int opcion;
		System.out.println("Escribe una opción:");
		opcion=sc.nextInt();
		sc.nextLine();
		return opcion;
	}
}