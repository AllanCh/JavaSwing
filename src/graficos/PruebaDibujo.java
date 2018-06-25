package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {
	public static void main(String[] args) {
		MarcoConDibujo miMarco = new MarcoConDibujo();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujo extends JFrame {
	public MarcoConDibujo() {
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		LaminaConFigura miLamina = new LaminaConFigura();
		add(miLamina);
	}
}

class LaminaConFigura extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);	
		g2.draw(rectangulo);
	}
}