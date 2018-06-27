package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {
		MarcoVentana miMarco = new MarcoVentana();
		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco.setTitle("Ventana 1");
		miMarco2.setTitle("Ventana 2");
		miMarco.setBounds(100, 150, 500, 350);
		miMarco2.setBounds(700, 150, 500, 350);
	}
}

class MarcoVentana extends JFrame {
	public MarcoVentana() {
		/*
		 * setTitle("Respondiendo"); setBounds(300, 300, 500, 350);
		 */
		setVisible(true);
		addWindowListener(new EscuchaVentana());
	}
}

class EscuchaVentana extends WindowAdapter {
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}