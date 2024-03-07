import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener 
{
	private JTextField pantalla;
	private JButton[] botonesNumeros;
	private JButton[] botonesOperadores;
	private JButton botonPunto;
	private JButton botonIgual;
	private JButton botonBorrar;
	private double num1, num2, resultado;
	private String operador;

	public Calculadora()
	{
		setTitle("Mi primer programa gráfico en Java :D.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		add(pantalla, BorderLayout.NORTH);

		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(4, 4));

		botonesNumeros = new JButton[10];
		for(int i = 0; i < 10; i++)
		{
			botonesNumeros[i] = new JButton(String.valueOf(i));
			botonesNumeros[i].addActionListener(this);
			panelBotones.add(botonesNumeros[i]);
		}

		botonesOperadores = new JButton[4];
		String [] operadores = {"+", "-", "*", "/"};

		for(int i = 0; i < 4; i++)
		{
			botonesOperadores[i] = new JButton(operadores[i]);
			botonesOperadores[i].addActionListener(this);
			panelBotones.add(botonesOperadores[i]);
		}

		botonPunto = new JButton(".");
		botonPunto.addActionListener(this);
		panelBotones.add(botonPunto);

		botonIgual = new JButton("=");
		botonIgual.addActionListener(this);
		panelBotones.add(botonIgual);

		botonBorrar = new JButton("C");
		botonBorrar.addActionListener(this);
		panelBotones.add(botonBorrar);

		add(panelBotones, BorderLayout.CENTER);

		pack();
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();

		if(source instanceof JButton)
		{
			JButton clickedButton = (JButton) source;
			String buttonText = clickedButton.getText();
			if(buttonText.matches("[0-9]"))
			{
				pantalla.setText(pantalla.getText() + buttonText);
			}
			else if (buttonText.equals("."))
			{
				if(!pantalla.getText().contains("."))
				{
					pantalla.setText(pantalla.getText() + ".");
				}
			}
			else if (buttonText.equals("C"))
			{
				pantalla.setText("");
			}
			else if (buttonText.equals("="))
			{
				num2 = Double.parseDouble(pantalla.getText());
				switch (operador)
				{
					case "+":
						resultado = num1 + num2;
						break;

					case "-":
						resultado = num1 - num2;
						break;

					case "*":
						resultado = num1 * num2;
						break;

					case "/":
						if(num2 != 0)
						{
							resultado = num1 / num2;
						}
						else
						{
							resultado = Double.NaN; //Indica que la operación da una indeterminación
						}
						break;
				}
				
				pantalla.setText(String.valueOf(resultado));
			}
			else
			{
				num1 = Double.parseDouble(pantalla.getText());
				operador = buttonText;
				pantalla.setText("");
			}
		}
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> new Calculadora());
	}
}

