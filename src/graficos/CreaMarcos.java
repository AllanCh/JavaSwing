package graficos;
import java.awt.Frame;

import javax.swing.*;
public class CreaMarcos {
	
	public static void main (String[] args) {
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
	
class miMarco extends JFrame{
	
	public miMarco() {
		//setSize(500,300);
		//setLocation(500,300);
		setBounds(500,300,550,250);//Esta instruccion resume las dos anteriores. Location, size.
		setResizable(true);
		//setExtendedState(Frame.MAXIMIZED_BOTH);//Maximiza la ventana al iniciar el programa.
		setTitle("JAVA SWING");
	}
		
}


