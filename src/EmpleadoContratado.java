public class EmpleadoContratado extends Empleado {
    private double importePorHoras;

    public EmpleadoContratado() {

    }

    public double getImportePorHoras() {
        return importePorHoras;
    }

    public void setImportePorHoras(double importePorHoras) {
        this.importePorHoras = importePorHoras;
    }


    @Override
    public double calcularSueldo(int dias) {

        return 0.0;
    }
}