package sentencia_switch;

public class Switch1 {

    public static void main(String[] args) {

        int a = 8;
        int b = 5;
        char op = '-';  //PUEDE CAMBIAR EL OPERADOR ARITMETICO

        System.out.print("EL RESULTADO ES : ");

        switch ( op ) {
            case '+':
                System.out.println( a + b );
                break;

            case '-':
                System.out.println( a - b );
                break;

            case '*':
                System.out.println( a * b );
                break;

            case '/':
                System.out.println( a / b );
                break;

            default:
                System.out.println("error" );
                break;
        }
    }
}