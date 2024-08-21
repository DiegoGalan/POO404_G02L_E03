
import javax.swing.JOptionPane;
public class CuadroDialog1 {
    public static void main(String[] args) {
        while (true){
            try{
                String nombre= JOptionPane.showInputDialog("Como te llamas?");
                String entrada= JOptionPane.showInputDialog("cuántos años tienes");
                int edad=Integer.parseInt(entrada);
                JOptionPane.showMessageDialog(null,"Hola, "+ nombre + ". El año que viene tendrás " +
                        (edad+1) + "años","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e){
                System.out.println("Error en algun dato de entrada");
                JOptionPane.showMessageDialog(null,"Error en algun dato de entrada","Error",JOptionPane.ERROR_MESSAGE);
                        String seleccion=(String) JOptionPane.showInputDialog(
                                null,
                                "Desea Salir",
                                "Seleccione una opcion",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new Object[] { "Si", "No" },
                                "si");
                if (seleccion.equals("Si")){
                    System.exit(0);
                    break;
                }
            }
        }
    }
}