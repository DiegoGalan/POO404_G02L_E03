package Guia3;

import java.text.DecimalFormat;

public class Tiempo1 extends Object {

    private int hora; //0 - 23
    private int minuto; //0 - 59
    private int segundo; //0 - 59

    //EL CONSTRUCTOR DE TIEMPO1 INICIALIZA CADA VARIABLE DE INSTANCIA EN CERO
    //SE ASEGURA DE QUE CADA OBJETO TIEMPO1 INICIE EN UN ESTADO CONSISTENTE

    public Tiempo1() {
        establecerHora(0, 0, 0); //SE LLAMA AL METODO ESTABLECER HORA
}

    //ESTABLECER UN NUEVO VALOR DE HORA UTILIZANDO HORA UNIVERSAL; REALIZAR
    //COMPROBACIONES DE VALIZ EN LOS DATOS; ESTABLECER VALORES INVALIDOS EN CERO

    public void establecerHora(int h, int m, int s) {
        hora = ((h >= 0 && h < 24) ? h : 0);
        minuto = ((m >= 0 && m < 60) ? m : 0);
        segundo = ((s >= 0 && s < 60) ? s : 0);
}

//CONVERTIR A STRING EN FORMATO DE HORA UNIVERSAL
    public String aStringUniversal() {
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return dosDigitos.format(hora) + "," + dosDigitos.format(minuto) + "," + dosDigitos.format(segundo);
    }

    //CONVERTIR A STRING EN FORMATO DE HORA ESTANDAR
    public String aStringEstandar() {
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return ((hora == 12 || hora == 0) ? 12 : hora % 12) + "," + dosDigitos.format(minuto) + "," + dosDigitos.format(segundo) + (hora < 12 ? " AM" : "PM");
    }

}
