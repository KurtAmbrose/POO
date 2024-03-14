import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel{

	private JLabel titulo;
	private JCheckBox [] opc = new JCheckBox[2];
	private JButton confirmarOpc; 
	private JPanel panel; 

	public Panel() 
	{
		//Paneles

		setLayout(new GridLayout(3, 1));
		titulo = new JLabel("BIENVENIDO A LA BIBLIO :D");
		panel = new JPanel();
		panel.add(titulo);

		// Chechboxes

		opc[0] = new JCheckBox("Regresar libro");
		opc[1] = new JCheckBox("Buscar libro");

		//Botón
		
		confirmarOpc = new JButton("Continuar");
		// confirmarOpc.addActionListener(this);

		add(panel);

		for(int i = 0; i < 2; i++)
		{
			add(opc[i]);
		}

		add(confirmarOpc);
	}

}

