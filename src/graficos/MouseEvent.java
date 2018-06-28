package graficos;

import java.awt.event.*;
import javax.swing.JFrame;

public class MouseEvent {
	public static void main(String[] args) {
		MouseFrame miMarco = new MouseFrame();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MouseFrame extends JFrame {
	public MouseFrame() {
		setVisible(true);
		setBounds(450, 100, 600, 450);
		addMouseListener(new EventoRaton());
	}
}

class EventoRaton extends MouseAdapter {
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("Has hecho click");
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("Entro en la pantalla");
	}
}