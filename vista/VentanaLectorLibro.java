package vista;
import java.awt.*;
import java.awt.event.*;
import controlador.*;
import java.io.*;
public class VentanaLectorLibro extends Frame{
	private Controlador controladorLibro;
	private Menu menu;
	private Button bGuardar;
	private TextField tfTitulo,tfAutor, tfAnio, tfEdicion, tfISBN, tfNe, tfEditorial, tfPais;
	public VentanaLectorLibro(){
		setTitle("Agregar Ejemplar");
		addWindowListener(new wlCerrarVentana());
		setLayout(new FlowLayout());
		add(new Label("Titulo "));
		tfTitulo = new TextField(4);
		add(tfTitulo);
		add(new Label("Autor"));
		tfAutor = new TextField(6);
		add(tfAutor);
		add(new Label("Anio"));
		tfAnio = new TextField(4);
		add(tfAnio);
		add(new Label("Edicion"));
		tfEdicion = new TextField(4);
		add(tfEdicion);
		add(new Label("ISBN"));
		tfISBN = new TextField(4);
		add(tfISBN);
		add(new Label("Numero existencias"));
		tfNe = new TextField(4);
		add(tfNe);
		add(new Label("Editorial"));
		tfEditorial = new TextField(4);
		add(tfEditorial);
		add(new Label("Pais"));
		tfPais = new TextField(4);
		add(tfPais);
		bGuardar = new Button("Guardar");
		bGuardar.addActionListener(new alGuardar());
		add(bGuardar);
		setSize(1050, 100);
		setVisible(true);
	}
	public void addMenu(Menu vista){
		menu= vista;
	}
	public void mostrarVentana(){
		setSize(1050,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void addControlador(Controlador ce){
		controladorLibro = ce;
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
			System.out.println("Guardando libro");
			String ti = tfTitulo.getText();
			String a = tfAutor.getText();
			String ani = tfAnio.getText();
			String ed = tfEdicion.getText();
			String i = tfISBN.getText();
			String sne = tfNe.getText();
			int ne=(Integer.parseInt(sne));
			String edi = tfEditorial.getText();
			String p = tfPais.getText();
			controladorLibro.agregarLibro(ti,a,ani,ed,i,ne,edi,p);
			}
		
	}
	
}