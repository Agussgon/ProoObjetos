package SistemaEmpleados;

public class EmpleadoLimpiezaGeneral extends EmpleadoLimpieza {

    private Integer horasExtras;

    // el valor de la hora extra es igual para todos los empelados de limpieza general ,
    // no lo modifica ningún empleado en particular.
    static private Double valorHoraExtra;

    public EmpleadoLimpiezaGeneral(String nombre, String apellido, String direccion,
                                   int dni, Double sueldo, String turno) {
        super(nombre, apellido, direccion, dni, sueldo, turno);

    }

    // lo vamos a actualizar desde la clase , no directamente desde el objeto
    static public void actualizarValorHoraExtra(Double nuevoValor) {
        valorHoraExtra = nuevoValor;
    }

    public void realizarHorasExtras(int horas) {

        horasExtras += horas;
        Double sueldoActualizado = this.getSueldo() + horasExtras * valorHoraExtra;
        this.setSueldo(sueldoActualizado);

    }

    public Integer getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    public static Double getValorHoraExtra() {
        return valorHoraExtra;
    }

}
