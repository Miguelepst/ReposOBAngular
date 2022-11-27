public class Main {

    public static void main(String[] args) {

        Ejecicio1 ej1 = new Ejecicio1();
        ej1.MetodoMain();

        // ## Mas practicas
        ///// ----------------------------------------------------------------
        // 4.1: Condicionales
        // https://campus.open-bootcamp.com/cursos/3/leccion/2210
        System.out.println("4.1: Condicionales: ");
        ConceptoCondicioonales obCondi = new ConceptoCondicioonales();
        obCondi.metodo1();
        obCondi.bucleWhile();
        obCondi.doWhile();

        // 4.1: Condicionales

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

// class ejercicio1:
class Ejecicio1 {

    Ejecicio1() {
    }

    public void MetodoMain() {

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
        System.out.println("Numero de puertas final: " + objMicoche.numPuertas);

        // Fin: ejercicio 1 cursos/3/leccion/1533

    }

    public static int funSuma(int a, int b, int c) {
        return a + b + c;
    }

}

//// ------ Clases de estudio

class ConceptoCondicioonales {
    public ConceptoCondicioonales() {
    }

    public void metodo1() {
        int valor1 = 0;
        int valor2 = 0;

        if (valor1 == valor2) {
            System.out.println("valor1 es igual a valor 2");
        }
    }

    public void bucleWhile() {
        int num = 1;
        while (num < 10) {
            System.out.println(num);
            num++;
        }
    }

    public void doWhile() {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num < 10);
    }
}