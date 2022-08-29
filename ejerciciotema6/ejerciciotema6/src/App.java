public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crea una clase Persona con las siguientes variables:
         * La edad
         * El nombre
         * El teléfono
         * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
         * esta nueva clase tendrá la variable credito solo para esa clase.
         * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
         * edad, el telefono, el nombre y el credito, tienes que darles valor y
         * mostrarlas por pantalla.
         * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de
         * Persona, y con una variable salario que solo tenga la clase Trabajador.
         */

        Cliente cliente1 = new Cliente();
        cliente1.edad = 31;
        cliente1.nombre = "Camilo";
        cliente1.telefono = 1757;
        cliente1.credito = 300;
        System.out.println(cliente1.edad + " " + cliente1.nombre + " " + cliente1.telefono + " " + cliente1.credito);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario = 5000;
}