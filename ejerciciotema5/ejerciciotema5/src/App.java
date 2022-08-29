public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Crear clase Persona.
         * Crear variables las privadas edad, nombre y telefono de la clase Persona.
         * Crear gets y sets de cada propiedad.
         * Crear un objeto persona en el main.Utiliza los gets y sets para darle valores
         * a las propiedades edad, nombre y telefono, por último muéstralas por consola.
         */

        Persona persona = new Persona();
        persona.setEdad(16);
        persona.setNombre("Camilo");
        persona.setTelefono(123456);
        System.out.println("El usuario:" + persona.getNombre() + "tiene: " + persona.getEdad()
                + " años y su telefono es: " + persona.getTelefono());
    }

    static class Persona {

        private int edad;
        private String nombre;
        private int telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

    }
}
