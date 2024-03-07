import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gato extends JFrame implements ActionListener
{
	private JButton[][] botones;
	private char[][] tablero;
	private char jugadorActual;

	public Gato()
	{
		setTitle("Gato");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		tablero = new char[3][3];
		botones = new JButton[3][3];
		jugadorActual = 'x';

		JPanel panel = new JPanel(new GridLayout(3,3));
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				botones[i][j] = new JButton();
				botones[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
				botones[i][j].addActionListener(this);
				panel.add(botones[i][j]);
			}
		}

		add(panel);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e)
	{
		JButton boton = (JButton) e.getSource();
		int fila = -1, columna = -1;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(boton == botones[i][j])
				{	
					fila = i;
					columna = j;
					break;
				}

			}
		}

		if(tablero[fila][columna] == '\u0000') 
		{
			tablero[fila][columna] = jugadorActual;
			boton.setText(Character.toString(jugadorActual));
			if(hayGanador(fila, columna))
			{
				JOptionPane.showMessageDialog(this, "¡GANA JUGADOR " + jugadorActual + "!");
				reiniciarJuego();
			}
			else if(tableroLleno())
			{
				JOptionPane.showMessageDialog(this, "¡EMPATE!");
				reiniciarJuego();
			}
			else
			{
				jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
			}
		}
	}

	private boolean hayGanador(int fila, int columna)
	{
		return (tablero[fila][0] == jugadorActual && tablero[fila][1] == jugadorActual && tablero[fila][2] == jugadorActual)
			|| (tablero[0][columna] == jugadorActual && tablero[1][columna] == jugadorActual && tablero[2][columna] == jugadorActual)
			|| (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual)
			|| (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual);
	}

	private boolean tableroLleno()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(tablero[i][j] == '\u0000')
				{
					return false;
				}
			}
		}

		return true;
	}

	private void reiniciarJuego()
	{
		tablero = new char[3][3];
		jugadorActual = 'X';

		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				botones[i][j].setText("");
			}
		}
	}


	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(Gato::new);
	}
}
