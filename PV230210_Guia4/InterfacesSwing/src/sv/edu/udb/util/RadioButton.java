package sv.edu.udb.util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame {
    private JRadioButton rbtOpcion1;
    private JRadioButton rbtOpcion2;
    private JRadioButton rbtOpcion3;
    private JLabel lblTitulo;
    private JLabel lblImagen;
    private JPanel pnlImagen;

    public RadioButton(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlImagen);
        this.setMinimumSize(new Dimension(400, 250));
        this.setLocationRelativeTo(getParent());

        rbtOpcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/digicel.png")));
            }
        });
        rbtOpcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/Movistar.png")));
            }
        });
        rbtOpcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/Claro.png")));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new RadioButton("SELECCIONE UNA IMAGEN");
        frame.setVisible(true);
    }
}
