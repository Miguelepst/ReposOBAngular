public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicios tema 8");
        Persona persona = new Persona();
        persona.setNombre("Miguel");
        persona.setEdad(43);
        persona.setTelefono("+57 312 487 2877");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Nombre: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefeno;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefeno = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefeno;
    }

}
