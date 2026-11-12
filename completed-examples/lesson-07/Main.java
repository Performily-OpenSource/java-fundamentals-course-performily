class Mascota {
    String nombre;
    String especie;
    int edad;

    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
}

// Solución del reto: clase Estudiante con constructor y un método
class Estudiante {
    String nombre;
    String grado;

    Estudiante(String nombre, String grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    void mostrarDatos() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Grado: " + grado);
    }
}

public class Main {
    public static void main(String[] args) {

        Mascota mascota1 = new Mascota("Luna", "Gato", 2);
        mascota1.mostrarInformacion();

        // Solución del reto
        Estudiante estudiante1 = new Estudiante("Mateo", "3.° de secundaria");
        estudiante1.mostrarDatos();
    }
}
