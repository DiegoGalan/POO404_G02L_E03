import javax.swing.JOptionPane;
public class PruebaTiempo {
    public static void main(String args[]){
        Tiempo1 tiempo=new Tiempo1();
        String salida="La hora unversal inicial es: "+tiempo.aStringUniversal()+"\n\nLa hora estándar inicial es: "+
        tiempo.aStringEstandar();
        tiempo.establecerHora(13,27,6);
        salida+="\n\nLa hora universal después de establecerHora es: "+
        tiempo.aStringUniversal()+"\n\nLa hora estándar después de establecerHora es: "+tiempo.aStringEstandar();
        tiempo.establecerHora(99,99,99);
        salida+="\n\nDespués de intentar ajustes inválidos: "+
        "\n\nHora universal: "+ tiempo.aStringUniversal()+
        "\n\nHora estándar:"+tiempo.aStringEstandar();
        JOptionPane.showMessageDialog(null,salida,"Prueba de la clase Tiempo1",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
