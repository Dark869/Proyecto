package vista;
import java.awt.*;
import java.awt.event.*;
import controlador.*;
import java.io.*;
public class VentanaLectorEstudiante extends Frame{
	private Controlador controladorEstudiante;
	private Menu menu;
	private Button bGuardar;
	private TextField tfNombre, tfMatricula, tfDireccion, tfTelefono;
	public VentanaLectorEstudiante(){
		setTitle("Agregar Estudiante");
		addWindowListener(new wlCerrarVentana());
		setLayout(new FlowLayout());
		add(new Label("Matricula "));
		tfMatricula = new TextField(4);
		add(tfMatricula);
		add(new Label("Nombre Estudiante"));
		tfNombre = new TextField(6);
		add(tfNombre);
		add(new Label("Direccion"));
		tfDireccion = new TextField(10);
		add(tfDireccion);
		add(new Label("Teléfono"));
		tfTelefono = new TextField(4);
		add(tfTelefono);
		bGuardar = new Button("Guardar");
		bGuardar.addActionListener(new alGuardar());
		add(bGuardar);
		setSize(750, 100);
		setVisible(true);
	}
	public void addMenu(Menu vista){
		menu= vista;
	}
	public void mostrarVentana(){
		setSize(750,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void addControlador(Controlador ce){
		controladorEstudiante = ce;
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
			System.out.println("Guardando al estudiante");
			String m = tfMatricula.getText();
			String n = tfNombre.getText();
			String d = tfDireccion.getText();
			String t = tfTelefono.getText();
			
			controladorEstudiante.agregarEstudiante(m,n,d,t);
		}
		
	}
	
}