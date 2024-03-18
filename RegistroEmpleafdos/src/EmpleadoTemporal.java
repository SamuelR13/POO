public class EmpleadoTemporal extends Empleado {

    private String fechaFinContrato;

    public EmpleadoTemporal(String nombre, int edad, int IdEmpleado,
                            double salario, String fechaFinContrato) {
        super(nombre, edad, IdEmpleado, salario);
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setfechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
}