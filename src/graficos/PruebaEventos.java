package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {
	public static void main(String[] args) {
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame {
	public MarcoBotones() {
		setTitle("Botones y eventos");
		setBounds(450, 250, 500, 300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener {
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		if (botonPulsado == botonAzul)
			setBackground(Color.blue);
		else if (botonPulsado == botonAmarillo)
			setBackground(Color.yellow);
		else if (botonPulsado == botonRojo)
			setBackground(Color.red);
	}
}