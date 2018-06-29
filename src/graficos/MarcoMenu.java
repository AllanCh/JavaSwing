package graficos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MarcoMenu {

	public static void main(String[] args) {
		MenuFrame miMarco = new MenuFrame();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MenuFrame extends JFrame {
	public MenuFrame() {
		setBounds(450, 100, 550, 400);
		MenuLamina miLamina = new MenuLamina();
		add(miLamina);
		setVisible(true);
	}
}

class MenuLamina extends JPanel {
	public MenuLamina() {
		JMenuBar miBarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		JMenuItem generales = new JMenuItem("Generales");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(copiar);
		edicion.add(cortar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		herramientas.add(generales);
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		add(miBarra);
	}
}