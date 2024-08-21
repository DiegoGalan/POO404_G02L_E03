package bucle_for;

public class NuevoFor {

    /**
     * @PARAM ARGS THE COMMAND LINE ARGUMENTS
     */

    public static void main(String[] args) {

        //TODO code application logic here
        int Numero[] = {1,2,3,4,5,6,7,8,9,0};
        int Suma = 0;

        //for CLASICO
        for (int indice = 0; indice < 10; indice ++) {
            Suma = Suma + Numero [indice];
        }
        System.out.println("TOTAL CON FOR CLASICO " + Suma);
        Suma = 0;
        System.out.println("SUMA REINICIALIZADA VALE " + Suma);

        //for MEJORADO
        for (int valor: Numero) {
            Suma += valor;
        }
        System.out.println("TOTAL CON FOR MEJORADO " + Suma);
    }
}
