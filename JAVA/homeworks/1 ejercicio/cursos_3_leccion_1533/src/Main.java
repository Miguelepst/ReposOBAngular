
public class Main {
    public static void main(String[] args) {
        /// ----
        // Ejercicio 1 cursos/3/leccion/1533
        System.out.println("Primer ejercicio: https://campus.open-bootcamp.com/cursos/3/leccion/1533");
        // Primera parte
        System.out.println("Resultado de la funcion: " + funSuma(2, 2, 2));
        // Segunda parte:
        Coche objMicoche = new Coche();
        System.out.println("Numero de puertas inicial: " + objMicoche.numPuertas);
        objMicoche.incrementarNumPuertas();
        objMicoche.incrementarNumPuertas();
        objMicoche.incrementarNumPuertas();
        System.out.println("Numero de puertas: " + objMicoche.numPuertas);

    }

    public static int funSuma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int numPuertas = 2;

    /* Constructor */
    public Coche() {
    }

    public void incrementarNumPuertas() {
        numPuertas++;
    }
}
