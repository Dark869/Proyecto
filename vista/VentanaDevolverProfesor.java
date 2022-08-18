package vista;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import controlador.Controlador;
import vista.VentanaPrestamoProfesor.alGuardar;
import vista.VentanaPrestamoProfesor.wlCerrarVentana;

public class VentanaDevolverProfesor extends Frame{
	private Controlador controladorProfesor;
	private Menu menu;
	private Button bPrestar;
	private TextField tfDia,tfMes, tfAnio, tfMatricula, tfTitulo;
	public VentanaDevolverProfesor(){
		setTitle("Prestamo estudiante");
		addWindowListener(new wlCerrarVentana());
		setLayout(new FlowLayout());
		add(new Label("Dia de la devolucion"));
		tfDia= new TextField(4);
		add(tfDia);
		add(new Label("Mes de la devolucion(1-12)"));
		tfMes= new TextField(4);
		add(tfMes);
		add(new Label("Anio de la devolución"));
		tfAnio = new TextField(4);
		add(tfAnio);
		add(new Label("Numero personal"));
		tfMatricula = new TextField(4);
		add(tfMatricula);
		add(new Label("Titulo del libro a devolver"));
		tfTitulo = new TextField(10);
		add(tfTitulo);
		bPrestar = new Button("Devolver");
		bPrestar.addActionListener(new alGuardar());
		add(bPrestar);
		setSize(1100, 100);
		setVisible(true);
	}
	public void addMenu(Menu vista){
		menu= vista;
	}
	public void mostrarVentana(){
		setSize(1100,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void addControlador(Controlador ce){
		controladorProfesor = ce;
	}
	class wlCerrarVentana implements WindowListener{
		public void windowClosing(WindowEvent e){
			setVisible(false);
			dispose();
			System.exit(0);
		}
		public void windowActivated(WindowEvent e){}
		public void windowClosed(WindowEvent e){}
		public void windowDeactivated(WindowEvent e){}
		public void windowDeiconified(WindowEvent e){}
		public void windowIconified(WindowEvent e){}
		public void windowOpened(WindowEvent e){}
	}

	class alGuardar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Devolviendo Libro");
			String dia = tfDia.getText();
			int d =(Integer.parseInt(dia));
			String mes = tfMes.getText();
			int m = (Integer.parseInt(mes));
			String anio = tfAnio.getText();
			int a = (Integer.parseInt(anio));
			String titu = tfTitulo.getText();
			String np = tfMatricula.getText();
			System.out.println("Prueba");
			controladorProfesor.devolverPrestamoProfesor(d,m,a,titu,np);
		}
	}
}
