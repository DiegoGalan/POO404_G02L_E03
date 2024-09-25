package sv.edu.udb.util;

import sv.edu.udb.datos.PersonasDatos;
import sv.edu.udb.beans.PersonaBeans;
import sv.edu.udb.datos.OcupacionesDatos;
import javax.swing.table.DefaultTableModel;
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
    private JLabel lblOcupacion;
    private JLabel lblFechaNacimiento;
    private JButton btnEliminar;
    private JComboBox cmbOcupacion;
    private JTextField txtFechaNacimiento;


    DefaultTableModel modelo = null;
    PersonaBeans personaBeans = null;
    PersonasDatos personasDatos = new PersonasDatos();
    OcupacionesDatos ocupacionesDatos = new OcupacionesDatos();

    /*
    *CONSTRUCTOR CON PARAMETRO PARA INICIALIZAR EL JFRAME CREADO
     */

    public Persona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(700, 500));
        this.setLocationRelativeTo(getParent());

        /*
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
         */

        modelo = personasDatos.selectPersona();
        tblDatos.setModel(modelo);
        cmbOcupacion.setModel(ocupacionesDatos.selectOcupaciones());

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
                btnObtenerDatos();
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEliminarDatos();
            }
        });
    }
    public void btnEliminarDatos(){
        personasDatos.delete(Integer.parseInt(txtId.getText()));
        btnLimpiar();
        modelo = personasDatos.selectPersona();
        tblDatos.setModel(modelo);
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
            cmbOcupacion.setSelectedIndex(Integer.parseInt(modelo.getValueAt(fila, 5).toString()));
            txtFechaNacimiento.setText(modelo.getValueAt(fila, 6).toString());
            btnObtenerDatos.setText("Editar");
        }
    }

    public void btnObtenerDatos() {
        int id;
        String nombres;
        int edad;
        String telefono;
        String sexo;
        int idOcupacion;
        String fechaNacimiento;

        if (txtId.getText().isEmpty()) {
            id = 0;
        } else {
            id = Integer.parseInt(txtId.getText());
        }

        nombres = txtNombre.getText();
        edad = Integer.parseInt(txtEdad.getText());
        telefono = txtTelefono.getText();
        sexo = comboBox1.getSelectedItem().toString();
        idOcupacion = ocupacionesDatos.getIdOcupacion(cmbOcupacion.getSelectedItem().toString());
        fechaNacimiento = txtFechaNacimiento.getText();

       personaBeans = new PersonaBeans(id, nombres, edad, telefono, sexo, idOcupacion, fechaNacimiento);

       if (btnObtenerDatos.getText().equals("Guardar")) {
           personasDatos.insert(personaBeans);
       } else if (btnObtenerDatos.getText().equals("Editar")) {
           personasDatos.update(personaBeans);
       }
       modelo = personasDatos.selectPersona();
       tblDatos.setModel(modelo);
    }

    private void btnLimpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        comboBox1.setSelectedIndex(0);
        cmbOcupacion.setSelectedIndex(0);
        txtFechaNacimiento.setText("");
        btnObtenerDatos.setText("Guardar");
    }

    public static void main(String[] args) {
        JFrame frame = new Persona("INGRESO DE DATOS");
        frame.setVisible(true);
    }
}
