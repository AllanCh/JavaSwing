package graficos;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		MarcoTeclas miMarco = new MarcoTeclas();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoTeclas extends JFrame {
	public MarcoTeclas() {
		setVisible(true);
		setBounds(450, 100, 600, 450);
		KeyEvent tecla = new KeyEvent();
		addKeyListener(tecla);
	}
}

class KeyEvent implements KeyListener {

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {

	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {

	}

}