package sentencia_switch;

import javax.swing.*;

public class Switch2 {

        /**
         * @param args the command line arguments
         */

        public static void main(String[] args) {
            // TODO code application logic here

            int replaced = JOptionPane.showConfirmDialog(null,"REPLACE EXISTING SELECTION?");
            String result = "?";

            switch (replaced) {
                case JOptionPane.CANCEL_OPTION:
                    result = "CANCELED";
                    break;

                case JOptionPane.CLOSED_OPTION:
                    result = "CLOSED";
                    break;

                case JOptionPane.NO_OPTION:
                    result = "NO";
                    break;

                case JOptionPane.YES_OPTION:
                    result = "YES";
                    break;

                default:
                    ;
            }
            System.out.println("REPLACE? " + result);
        }
}
