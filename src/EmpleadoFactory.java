
// Creamos la clase en base a los objetos a instanciar
public class EmpleadoFactory {

    // implementar el singleton

    // atributo estatico , única instancia
    private static EmpleadoFactory instance;

    //crear un constructor privado
    private EmpleadoFactory(){
    }
    // devuelvo o creo la fabrica , retorna la instancia unica
    public static EmpleadoFactory getInstance(){

        if(instance == null){

            instance=new EmpleadoFactory();
        }
            return instance; // puedo solo retornarla e inicarlar en el momento de declararla.

    };



    public Empleado crearEmpleado(String codigo){

        //retorna un empleado
        Empleado resultado= null;

        switch(codigo){
            case "EMP-D":
                resultado= new EmpleadoDependencia(); // esto depende del constructor en este caso esta vacio

            case "EMP-C":
                resultado= new EmpleadoContratado();
                break;

        }

        return resultado;

    }

}
