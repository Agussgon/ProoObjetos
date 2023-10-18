public class EmpleadoDependencia extends Empleado {
        private double sueldoMensual;

        public EmpleadoDependencia() {

        }

        public double getSueldoMensual() {
            return sueldoMensual;
        }

        public void setSueldoMensual(double sueldoMensual) {
            this.sueldoMensual = sueldoMensual;
        }


        @Override
        public double calcularSueldo(int dias) {

            return sueldoMensual*dias;
        }
    }

