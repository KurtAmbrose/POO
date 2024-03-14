import javax.swing.*;
import java.awt.*;

public class ultimosElementos {

	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Últimos elementos");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300,200);

		// TEXTAREA

		JTextArea areaTexto = new JTextArea(10, 20);

		// SCROLLER

		JScrollPane scroller = new JScrollPane(areaTexto);

		// AGREGAR BARRA 

		frame.getContentPane().add(scroller, BorderLayout.CENTER);

		frame.setVisible(true);

	}


}
