package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		MarcoFoco miMarco = new MarcoFoco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoFoco extends JFrame {
	public MarcoFoco() {
		setVisible(true);
		setBounds(400, 100, 600, 450);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel {
	JTextField cuadro1;
	JTextField cuadro2;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		LanzaFoco foco = new LanzaFoco();
		cuadro1.addFocusListener(foco);
	}

	private class LanzaFoco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
		}

		@Override
		public void focusLost(FocusEvent e) {
			System.out.println("Has perdido el foco");
		}

	}

}
