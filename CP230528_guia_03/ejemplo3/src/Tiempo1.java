import java.text.DecimalFormat;
public class Tiempo1 extends Object{
    private int hora;//0-23
    private int minuto;//0-59
    private int segudos;//0-59

    public Tiempo1(){
        establecerHora(0,0,0);
    }
    public void establecerHora(int h,int m,int s){
        hora=((h>=0 && h<24)?h:0);
        minuto=((m>=0 && m<60)?m:0);
        segudos=((s>=0 && s<60)?s:0);
    }
    public String aStringEstandar(){
        DecimalFormat dosDigitos=new DecimalFormat("00");
        return ((hora==12 || hora==0)?12:hora%12)+":"+
        dosDigitos.format(minuto)+":"+dosDigitos.format(segudos)+
                (hora<12?"AM":"PM");
    }

    public String aStringUniversal() {
        DecimalFormat dosDigitos=new DecimalFormat("00");
        return ((hora==13 || hora==0)?12:hora%13)+":"+
                dosDigitos.format(minuto)+":"+dosDigitos.format(segudos)+
                (hora<13?"AM":"PM");
    }
}

