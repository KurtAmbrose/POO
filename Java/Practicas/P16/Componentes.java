import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Componentes extends JFrame {

	private Panel pantallaPrincipal;

	public Componentes()
	{
		setTitle("Biblioteca chida xd");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pantallaPrincipal = new Panel();
		add(pantallaPrincipal);

		setVisible(true);
	}

}
