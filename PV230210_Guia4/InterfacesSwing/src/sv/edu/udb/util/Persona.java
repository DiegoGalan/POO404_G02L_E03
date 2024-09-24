package sv.edu.udb.util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Persona extends JFrame {
    private JComboBox comboBox1;
    private JButton btnObtenerDatos;
    private JButton btnLimpiar;
    private JPanel pnlPersona;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblTelefono;
    private JLabel lblbSexo;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;
    private JTable tblDatos;
    DefaultTableModel modelo = null;

    /*
    *CONSTRUCTOR CON PARAMETRO PARA INICIALIZAR EL JFRAME CREADO
     */

    public Persona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent());

        //ARREGLO DE OBJETO, PARA INICIALIZAR CON VACIO LA TABLA
        Object [][] data = null;

        //ARREGLO DE STRING PARA CREAR LOS NOMBRES DE LAS COLUMNAS
        String[] colums = {
                "ID", "NOMBRES", "EDAD", "TELEFONO", "SEXO"
        };

        //INSTANCIA DEL MODELO
        modelo = new DefaultTableModel(data, colums);

        //Seteo del modelo, el cual tendra la estructura que permitira a la tabla representar a los datos
        tblDatos.setModel(modelo);

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtenerDatos();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLimpiar();
            }
        });
        tblDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tblObtenerDato(e);
            }
        });
    }
    private void tblObtenerDato(MouseEvent e){
        int fila = tblDatos.rowAtPoint(e.getPoint());
        int columna = tblDatos.columnAtPoint(e.getPoint());

        if ((fila > -1) && (columna > -1)){
            txtId.setText(modelo.getValueAt(fila, 0).toString());
            txtNombre.setText(modelo.getValueAt(fila, 1).toString());
            txtEdad.setText(modelo.getValueAt(fila, 2).toString());
            txtTelefono.setText(modelo.getValueAt(fila, 3).toString());
            comboBox1.setSelectedIndex(Integer.parseInt(modelo.getValueAt(fila, 4).toString()));
        }
    }

    public void btnObtenerDatos() {
        String id;
        String nombres;
        String edad;
        String telefono;
        String sexo;

        id = txtId.getText();
        nombres = txtNombre.getText();
        edad = txtEdad.getText();
        telefono = txtTelefono.getText();
        sexo = comboBox1.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null, "DATOS OBTENIDOS: \n ID: " + id + "\n NOMBRES: " + nombres + "\n EDAD: " + edad +
                "\n TELEFONO: " + telefono + "\n SEXO: " + sexo);

        Object[] newRow = {
                id, nombres, edad, telefono, sexo
        };
        modelo.addRow(newRow);
    }

    private void btnLimpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        comboBox1.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        JFrame frame = new Persona("INGRESO DE DATOS");
        frame.setVisible(true);
    }
}
