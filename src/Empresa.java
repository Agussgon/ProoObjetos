import java.util.ArrayList;

public class Empresa {

private ArrayList<Empleado> empleados;


// Creamos los empleados  en la empresa
public Empresa(){

    empleados=new ArrayList<>();

    // al ser un metodo estatico accedemos directamente sin crear un objeto a la única instancia
    EmpleadoDependencia empleado1= (EmpleadoDependencia)EmpleadoFactory.getInstance() .crearEmpleado("EMP-D"); // casteo para que se comporte como E.D


    EmpleadoContratado empleado2=(EmpleadoContratado)EmpleadoFactory.getInstance().crearEmpleado("EMP-C");

    empleado1.setNombre("Juan");
    empleado1.setSueldoMensual(280000);

    empleado2.setNombre("Florencia");
    empleado2.setImportePorHoras(5000);

    empleados.add(empleado1);
    empleados.add(empleado2);


}

    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + empleados +
                '}';
    }

    // calcular el sueldo total
}
