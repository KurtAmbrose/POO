import javax.swing.*;
import javax.swing.event.*;


public class masElementos {
	
	public static void main(String [] args)
	{
		//VENTANA INICIAL
		JFrame frame = new JFrame("Más Elementos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		//TOGGLE BUTTON
		JToggleButton toggleButton = new JToggleButton("TOGGLE");
		toggleButton.setSelected(false);
		toggleButton.addActionListener(e -> {

			if(toggleButton.isSelected())
			{
				System.out.println("VIVA AMLO");
			}
			else
			{
				System.out.println("VIVA PEÑA");
			}
		});

		//SLIDER
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(20);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener(){

			public void stateChanged(ChangeEvent e){

				JSlider source = (JSlider) e.getSource();
				if(!source.getValueIsAdjusting())
				{
					System.out.println("Valor del Slider: " + source.getValue());
				}
			}

		});


		frame.add(toggleButton);
		frame.add(slider);
		frame.setVisible(true);
	}
}
