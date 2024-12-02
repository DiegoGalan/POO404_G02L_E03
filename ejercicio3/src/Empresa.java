public class Empresa {
public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Diego Peña", 3000.00);
        Gerente gerente1 = new Gerente("Diego Alberto Canizalez", 5000.00, 1500.00);

        System.out.println("Información del Empleado:");
        empleado1.mostrarInfo();
        System.out.println("Salario: " + empleado1.calcularSalario());
        System.out.println();

        System.out.println("Información del Gerente:");
        gerente1.mostrarInfo();
        System.out.println("Salario Total: " + gerente1.calcularSalario());
    }
}
