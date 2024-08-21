class Clase {
    static int contador;
    Clase(){
        contador++;
    }
    int getContador(){
        return contador;
    }
}
public class Codigo{
    public  static void main(String[] args){

        Clase uno =new Clase();
    }
}
