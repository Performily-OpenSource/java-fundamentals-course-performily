class Mascota {
    String nombre;
    String especie;
    int edad;
}

// RETO: crea una clase Estudiante con los atributos nombre y grado.
// Agrega un constructor para darles sus valores iniciales
// y un método que muestre los datos del estudiante.
// Luego crea un objeto Estudiante en main y llama a ese método.

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();

        mascota1.nombre = "Luna";
        mascota1.especie = "Gato";
        mascota1.edad = 2;

        System.out.println(mascota1.nombre);
        System.out.println(mascota1.especie);
        System.out.println(mascota1.edad);
    }
}
