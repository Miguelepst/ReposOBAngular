class Ejercicios_tema_4 {

    Ejercicios_tema_4() {
    };

    public void usoIf(int numeroIf) {

        System.out.println("Respuesta 1, (if):  ");
        if (numeroIf > 0) {
            System.out.println("Numero positivo");
        }
        if (numeroIf < 0) {
            System.out.println("Numero negativo");
        }

        System.out.println("-------\n");
    }

    public void usoWhile() {
        int numeroWhile = 0;
        System.out.println("Respuesta 2, (While): ");
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("-------\n");

    }

    public void usoDoWhile() {
        int numeroWhile = 2;
        System.out.println("Respuesta 3, (Do While): ");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        System.out.println("-------\n");

    }

    public void usoForBucle() {
        System.out.println("Respuesta 4, (for): ");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("-------\n");
    }

    public void usoSwicht(String estacion) {
        System.out.println("Respuesta 5, (switch, case): ");
        switch (estacion) {
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            case "invierno":
                System.out.println("invierno");
                break;

            default:
                System.out.println("Este valor no pertenece a una estacion: verano, otoño, primavera, inverno ");
        }
        System.out.println("-------\n");

    }

}

public class Main {

    public static void main(String[] args) {

        Ejercicios_tema_4 eje2 = new Ejercicios_tema_4();
        eje2.usoIf(-1); // comprovar si un numero es negativo o pisitivo
        eje2.usoWhile();
        eje2.usoDoWhile();
        eje2.usoForBucle();
        eje2.usoSwicht("otoño");

        /*
         * Ejecicio1 ej1 = new Ejecicio1();
         * ej1.MetodoMain();
         */

        /*
         * // ## Mas practicas
         * ///// ----------------------------------------------------------------
         * // 4.1: Condicionales
         * // https://campus.open-bootcamp.com/cursos/3/leccion/2210
         * System.out.println("4.1: Condicionales: ");
         * ConceptoCondicioonales obCondi = new ConceptoCondicioonales();
         * obCondi.metodo1();
         * obCondi.bucleWhile();
         * obCondi.doWhile();
         * 
         * // 4.1: Condicionales
         */

    }

}

class Varios {

    public Varios() {
    }

    public void funcion1() {
        // int valores[] = { 10, 20, 30, 40, 50 };

        int valores[] = new int[5];

        for (int i = 0; i <= valores.length; i++) {
            System.out.println(valores[i]);
        }
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