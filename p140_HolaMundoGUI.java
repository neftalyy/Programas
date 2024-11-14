import javax.swing.*;
import java.awt.*;

public class p140_HolaMundoGUI extends JFrame{

    private JLabel lblSaludo;

    p140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Arial",Font.BOLD+Font.ITALIC, 60));
        lblSaludo.setBounds(10, 20, 200, 30);
        add(lblSaludo);
        seaTitle("Mi primer programa de Interfaz Grafica en Java");
    }
    
    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(210,10,400,300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
