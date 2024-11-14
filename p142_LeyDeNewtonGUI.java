import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class p142_LeyDeNewtonGUI extends JFrame implements ActionListener {
    super("Calcular la 2da Ley de Newton");
    setLayout(new FlowLayout());

    p1 = new JPanel();
    p1.setLayout(new GridLayout(5, 2));

    lblFuerza = new JLabel("Fuerza: ", JLabel.RIGHT); p1.add(lblFuerza);
    txtFuerza = new JTextField(); p1.add(txtFuerza);
    lblMasa = new JLabel("Masa: ", JLabel.RIGHT); p1.add(lblMasa);
    txtMasa = new JTextField(); p1.add(txtMasa);
    lblAceleracion = new JLabel("Aceleracion: ", JLabel.RIGHT); p1.add(lblAceleracion);
    txtAceleracion = new JTextField(); p1.add(txtAceleracion);

    grpOpciones = new ButtonGroup();
    rbtFureza = new JRadioButton("Fuerza");
    rbtMasa = new JRadioButton("Masa");
    rbtAceleracion = new JRadioButton("Aceleracion");
    grpOpciones.add(rbtFureza); grpOpciones.add(rbtMasa); grpOpciones.add(rbtAceleracion);
    p1.add(rbtFureza); p1.add(rbtMasa); p1.add(rbtAceleracion);

    add(p1);
   
    btnCalcular = new JButton("Aceptar"); add(btnCalcular);
    btnSalir = new JButton("Salir"); add(btnSalir);

    rbtFureza.addChangeListener(this);
    rbtMasa.addChangeListener(this);
    rbtAceleracion.addChangeListener(this);

    btnCalcular.addActionListener(this);
    btnSalir.addActionListener(this);
}
