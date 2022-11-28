public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicios_tema_4");
        Ejercicios_tema_4 eje2 = new Ejercicios_tema_4();
        eje2.respustas();

    }
}

class Ejercicios_tema_4 {
    Ejercicios_tema_4() {
    };

    public void respustas() {
        this.usoIf(-1); // comprovar si un numero es negativo o pisitivo
        this.usoWhile();
        this.usoDoWhile();
        this.usoForBucle();
        this.usoSwicht("otoño");
    }

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
