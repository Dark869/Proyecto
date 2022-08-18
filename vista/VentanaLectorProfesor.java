package vista;
import java.awt.*;
import java.awt.event.*;
import controlador.*;
import java.io.*;
public class VentanaLectorProfesor extends Frame{
	private Controlador controladorProfesor;
	private Menu menu;
	private Button bGuardar;
	private TextField tfNombre, tfDireccion, tfTelefono, tfNPersonal, tfFacultad;
	public VentanaLectorProfesor(){
		setTitle("Agregar Profesor");
		addWindowListener(new wlCerrarVentana());
		setLayout(new FlowLayout());
		add(new Label("Nombre"));
		tfNombre = new TextField(4);
		add(tfNombre);
		add(new Label("Direccion"));
		tfDireccion = new TextField(10);
		add(tfDireccion);
		add(new Label("Teléfono"));
		tfTelefono = new TextField(10);
		add(tfTelefono);
		add(new Label("Numero personal"));
		tfNPersonal = new TextField(4);
		add(tfNPersonal);
		add(new Label("Facultad"));
		tfFacultad = new TextField(4);
		add(tfFacultad);
		bGuardar = new Button("Guardar");
		bGuardar.addActionListener(new alGuardar());
		add(bGuardar);
		setSize(800, 100);
		setVisible(true);
	}
	public void addMenu(Menu vista){
		menu= vista;
	}
	public void mostrarVentana(){
		setSize(800,100);
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
			System.out.println("Guardando al profesor");
			String n = tfNombre.getText();
			String d = tfDireccion.getText();
			String t = tfTelefono.getText();
			String np = tfNPersonal.getText();
			String f = tfFacultad.getText();
			controladorProfesor.agregarProfesor(n,d,t,np,f);
		}
	}
	
}