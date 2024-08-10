public class Gerente extends Empleado {
    private double bono;
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Salario Base: " + super.calcularSalario());
        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + (super.calcularSalario() + bono));
    }
    public String getNombre() {
        return super.getNombre();
    }
  
}
