package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugadorGUI extends JFrame {
    private JugadorUtil jugadorUtil;
    private JTable table;
    private DefaultTableModel tableModel;

    private JTextField nombreField, edadField, sexoField, estadoCivilField, descripcionField, salarioField;

    public JugadorGUI() {
        jugadorUtil = new JugadorUtil();
        setTitle("Gestión de Jugadores");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
    }

    private void initUI() {
        String[] columnNames = {"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        nombreField = new JTextField(10);
        edadField = new JTextField(5);
        sexoField = new JTextField(2);
        estadoCivilField = new JTextField(10);
        descripcionField = new JTextField(15);
        salarioField = new JTextField(10);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Nombre:"));
        inputPanel.add(nombreField);
        inputPanel.add(new JLabel("Edad:"));
        inputPanel.add(edadField);
        inputPanel.add(new JLabel("Sexo:"));
        inputPanel.add(sexoField);
        inputPanel.add(new JLabel("Estado Civil:"));
        inputPanel.add(estadoCivilField);
        inputPanel.add(new JLabel("Descripción:"));
        inputPanel.add(descripcionField);
        inputPanel.add(new JLabel("Salario:"));
        inputPanel.add(salarioField);

        JButton agregarButton = new JButton("Agregar Jugador");
        JButton guardarButton = new JButton("Guardar Datos");
        JButton cargarButton = new JButton("Cargar Datos");

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarJugador();
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jugadorUtil.guardarDatos("jugadores.txt");
            }
        });

        cargarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jugadorUtil.cargarDatos("jugadores.txt");
                actualizarTabla();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(agregarButton);
        buttonPanel.add(guardarButton);
        buttonPanel.add(cargarButton);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void agregarJugador() {
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        char sexo = sexoField.getText().charAt(0);
        String estadoCivil = estadoCivilField.getText();
        String descripcion = descripcionField.getText();
        double salario = Double.parseDouble(salarioField.getText());

        Jugador jugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        jugadorUtil.agregarJugador(jugador);

        tableModel.addRow(new Object[]{nombre, edad, sexo, estadoCivil, descripcion, salario});

        nombreField.setText("");
        edadField.setText("");
        sexoField.setText("");
        estadoCivilField.setText("");
        descripcionField.setText("");
        salarioField.setText("");
    }

    private void actualizarTabla() {
        tableModel.setRowCount(0);
        for (Jugador jugador : jugadorUtil.getJugadores()) {
            tableModel.addRow(new Object[]{
                    jugador.getNombre(),
                    jugador.getEdad(),
                    jugador.getSexo(),
                    jugador.getEstadoCivil(),
                    jugador.getDescripcion(),
                    jugador.getSalario()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JugadorGUI app = new JugadorGUI();
            app.setVisible(true);
        });
    }
}

