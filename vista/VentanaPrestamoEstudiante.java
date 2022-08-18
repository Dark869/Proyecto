package vista;
import java.awt.*;
import java.awt.event.*;
import controlador.*;
import java.io.*;
public class VentanaPrestamoEstudiante extends Frame {
	private Controlador controladorEstudiante;
	private Menu menu;
	private Button bPrestar;
	private TextField tfDia,tfMes, tfAnio, tfNp, tfTitulo;
	public VentanaPrestamoEstudiante(){
		setTitle("Prestamo estudiante");
		addWindowListener(new wlCerrarVentana());
		setLayout(new FlowLayout());
		add(new Label("Dia del prestamo"));
		tfDia= new TextField(4);
		add(tfDia);
		add(new Label("Mes del prestamo(1-12)"));
		tfMes= new TextField(4);
		add(tfMes);
		add(new Label("Anio del prestamo"));
		tfAnio = new TextField(4);
		add(tfAnio);
		add(new Label("Matricula del estudiante"));
		tfNp = new TextField(4);
		add(tfNp);
		add(new Label("Titulo del libro"));
		tfTitulo = new TextField(10);
		add(tfTitulo);
		bPrestar = new Button("Prestar");
		bPrestar.addActionListener(new alGuardar());
		add(bPrestar);
		setSize(1000, 100);
		setVisible(true);
	}
	public void addMenu(Menu vista){
		menu= vista;
	}
	public void mostrarVentana(){
		setSize(1000,100);
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
			System.out.println("Dando Prestamo");
			String dia = tfDia.getText();
			int d =(Integer.parseInt(dia));
			String mes = tfMes.getText();
			int m = (Integer.parseInt(mes));
			String anio = tfAnio.getText();
			int a = (Integer.parseInt(anio));
			String titu = tfTitulo.getText();
			String numP = tfNp.getText();
			controladorEstudiante.agregarPrestamoEstudiante(d,m,a,titu,numP);
		}
		
	}
	
}
