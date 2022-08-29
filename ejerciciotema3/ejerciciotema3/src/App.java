public class App {
    public static void main(String[] args) throws Exception {
        /*
         * - Primera parte:
         * Crear una función con tres parámetros que sean números que se suman entre sí.
         * Llamar a la función en el main y darle valores.
         * - Segunda parte:
         * Crear una clase coche.
         * Dentro de la clase coche, una variable numérica que almacene el número de
         * puertas que tiene.
         * Una función que incremente el número de puertas que tiene el coche.
         * Crear un objeto miCoche en el main y añadirle una puerta.
         * Mostrar el número de puertas que tiene el objeto.
         */

        suma(1, 2, 3);
        System.out.println("");

        Coche miCoche = new Coche();
        System.out.println("El numero de puertas del coche son de: " + miCoche.getNumeroPuertas());
        miCoche.incrementarPuertas();
        System.out.println("El numero de puertas del coche son de: " + miCoche.getNumeroPuertas());

    }

    public static void suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(String.format("El resultado de la suma de de %d + %d + %d es: %d", a, b, c, resultado));
    }

    // crear clase coche
    public static class Coche {

        int numeroPuertas = 0;

        public void incrementarPuertas() {
            System.out.println("Aumentando una puerta al coche");
            numeroPuertas++;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }

    }
}
