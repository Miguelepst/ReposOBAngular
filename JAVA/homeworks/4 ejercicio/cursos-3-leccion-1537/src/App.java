public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio tema 9");

        Cliente cliente = new Cliente();
        cliente.nombre = "Miguel";
        cliente.edad = 35;
        cliente.telefono = "+57 312 487 2877";

        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {
    int credito;
}

/*
 * /cursos/3/leccion/1537
 * 
 * Crea una clase Persona con las siguientes variables:
 * 
 * La edad
 * 
 * El nombre
 * 
 * El teléfono
 * 
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
 * esta nueva clase tendrá la variable credito solo para esa clase.
 * 
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
 * edad, el telefono, el nombre y el credito, tienes que darles valor y
 * mostrarlas por pantalla.
 * 
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de
 * Persona, y con una variable salario que solo tenga la clase Trabajador.
 */