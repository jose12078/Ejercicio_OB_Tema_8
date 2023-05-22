
    public class Main {
        public static void main(String[] args) {
            // Crear objeto Persona
            Persona persona = new Persona();

            // Establecer valores utilizando los métodos set
            persona.setEdad(25);
            persona.setNombre("Juan");
            persona.setTelefono("123456789");

            // Mostrar los valores utilizando los métodos get
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Teléfono: " + persona.getTelefono());
        }
    }


    public class Persona {
        private int edad;
        private String nombre;
        private String telefono;

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

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

