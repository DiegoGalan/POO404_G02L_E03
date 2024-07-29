package sv.edu.udb.notas;

public class Principal {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("WILLY", "WONKA");

        estudiante.setNota1(8);
        estudiante.setNota2(15);
        estudiante.setNota3(10);
        System.out.println("NOTAS DE " + estudiante.nombre + "" + estudiante.getApellido());

        System.out.println("NOTA 1: " + estudiante.getNota1());
        System.out.println("NOTA 2: " + estudiante.getNota2());
        System.out.println("NOTA 3: " + estudiante.getNota3());
    }
}
