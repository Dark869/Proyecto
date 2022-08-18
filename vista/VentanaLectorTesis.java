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
import java.io.*;
import controlador.Controlador;


public class VentanaLectorTesis extends Frame {
	private Controlador controladorLibro;
	private Menu menu;
	private Button bGuardar;
	private TextField tfTitulo,tfAutor, tfAnio, tfEdicion, tfDic;
	public VentanaLectorTesis(){
		setTitle("Agregar Ejemplar");
		addWindowListener(new wlCerrarVentana());
		setLayout(new FlowLayout());
		add(new Label("Titulo de Tesis "));
		tfTitulo = new TextField(4);
		add(tfTitulo);
		add(new Label("Autor(es)"));
		tfAutor = new TextField(6);
		add(tfAutor);
		add(new Label("Anio"));
		tfAnio = new TextField(4);
		add(tfAnio);
		add(new Label("Clasificacion"));
		tfEdicion = new TextField(4);
		add(tfEdicion);
		add(new Label("Director"));
		tfDic = new TextField(4);
		add(tfDic);
		bGuardar = new Button("Guardar");
		bGuardar.addActionListener(new alGuardar());
		add(bGuardar);
		setSize(700, 100);
		setVisible(true);
	}
	public void addMenu(Menu vista){
		menu= vista;
	}
	public void mostrarVentana(){
		setSize(700,100);
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
			String clasif = tfEdicion.getText();
			String dic = tfDic.getText();
			controladorLibro.agregarTesis(ti,a,ani,clasif,dic);
			}
	}
}
