public class Arboles {
    public Arboles(){
        System.out.println("Un arbol generico");
    }
    public Arboles(String tipo){
        System.out.println("Un arbol tipo "+tipo);
    }
    public Arboles(int altura){
        System.out.println("un arbol de "+altura+" metros");
    }
    public Arboles(int altura,String tipo){
        System.out.println("Un " +tipo+" de "+altura+" metros");
    }
    public static void main(String args[]){
        Arboles arbol1=new Arboles(4);
        Arboles aebol2=new Arboles("roble");
        Arboles arbol3=new Arboles();
        Arboles arbol4=new Arboles(5,"pino");
    }
}
