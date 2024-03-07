// Clase que representa la ventana principal de la aplicación
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentesSwing extends JFrame {
    private PanelOpciones panelOpciones;

    public ComponentesSwing() {
        setTitle("Componentes Swing");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelOpciones = new PanelOpciones();
        add(panelOpciones);

        setVisible(true);
    }
}