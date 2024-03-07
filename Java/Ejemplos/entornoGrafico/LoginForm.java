import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame
{
    //campos para escribir usuario y contraseña
    private JTextField usernameField;
    private JPasswordField passwordField;

    private JTextField [] datosUsuario;

    public LoginForm() //CONSTRUCTOR QUE PERMITE CREAR EL ENTORNO GRÁFICO Y ARMARLO
    {
        super("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);

        JPanel panel = new JPanel(); //CREA LA VENTANA
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 5));

        JLabel usernameLabel = new JLabel("Usuario");
        inputPanel.add(usernameLabel);
        usernameField = new JTextField();
        inputPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña");
        inputPanel.add(passwordLabel);
        passwordField = new JPasswordField();
        inputPanel.add(passwordField);

        panel.add(inputPanel, BorderLayout.CENTER);

        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                if(username.equals("usuario") && password.equals("contraseña"))
                {
                    JFrame ventanaUsuario = new JFrame();
                    ventanaUsuario.setSize(300, 300);
                    ventanaUsuario.setVisible(true);

                    JPanel panelUsuario = new JPanel();
                    panelUsuario.setLayout(new GridLayout(2, 5));

                    JLabel nombreLabel = new JLabel("Nombre");
                    panelUsuario.add(nombreLabel);
                }
                else
                {
                    JOptionPane.showMessageDialog(LoginForm.this, "NO NIGGERS ALLOWED");
                }
            }
        });

        panel.add(loginButton, BorderLayout.SOUTH);

        //Prepara el entorno gráfico
        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
}