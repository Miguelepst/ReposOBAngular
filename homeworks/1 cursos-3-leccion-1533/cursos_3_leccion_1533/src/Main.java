public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Primera parte
        System.out.println(funSuma(2, 2, 2));

        // Segunda parte:
        Coche objMicoche = new Coche();
        System.out.println("Numero de puestas: " + objMicoche.numPuertas);
        objMicoche.incrementarNumPuertas();
        objMicoche.incrementarNumPuertas();
        objMicoche.incrementarNumPuertas();
        System.out.println("Numero de puestas: " + objMicoche.numPuertas);

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
