public class Empleado extends Persona {

    private int idEmpleado;

    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
