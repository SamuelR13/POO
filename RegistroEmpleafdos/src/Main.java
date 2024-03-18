import java.util.Random;

public class Main {
    public static void main(String[] args) {

        GestionEmpleados objGestion = new GestionEmpleados();

        Empleado empleado1 = new EmpleadoTemporal("Juan Lopez",20,784,100252,"31/12/2024");
        Empleado empleado2 = new EmpleadoPermanente("Edgar Pelaez",28,874,157842,2);

        objGestion.agregarEmpleado(empleado1);
        objGestion.agregarEmpleado(empleado2);
        objGestion.mostrarEmpleados();
        objGestion.eliminarEmpleado(784);
        objGestion.mostrarEmpleados();

    }
}