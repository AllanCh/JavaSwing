package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Procesador {

	public static void main(String[] args) {
		MenuProcesador miMarco = new MenuProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MenuProcesador extends JFrame {
	public MenuProcesador() {
		setBounds(500, 100, 550, 400);
		LaminaProcesador miLamina = new LaminaProcesador();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaProcesador extends JPanel {
	JTextPane miArea;

	public LaminaProcesador() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar miBarra = new JMenuBar();
		// --------------------------------------------------------
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamagno = new JMenu("Tamaño");
		// --------------------------------------------------------
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem courier = new JMenuItem("Courier");
		JMenuItem verdana = new JMenuItem("Verdana");
		courier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miArea.setFont(new Font("Courier", Font.PLAIN, 12));
			}
		});
		arial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miArea.setFont(new Font("Arial", Font.PLAIN, 12));
			}
		});
		verdana.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				miArea.setFont(new Font("Verdana ", Font.PLAIN, 12));
			}
		});
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		// --------------------------------------------------------
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		estilo.add(negrita);
		estilo.add(cursiva);
		// --------------------------------------------------------
		JMenuItem tamagno12 = new JMenuItem("12");
		JMenuItem tamagno14 = new JMenuItem("14");
		JMenuItem tamagno16 = new JMenuItem("16");
		JMenuItem tamagno18 = new JMenuItem("18");
		tamagno.add(tamagno12);
		tamagno.add(tamagno14);
		tamagno.add(tamagno16);
		tamagno.add(tamagno18);
		// --------------------------------------------------------
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamagno);
		laminaMenu.add(miBarra);
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
		add(laminaMenu, BorderLayout.NORTH);
	}

}
