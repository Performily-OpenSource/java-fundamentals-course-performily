class Estudiante {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

}

// RETO FINAL (cuando termines el registro de estudiantes del video):
// 1. Agrega un cuarto estudiante al array.
// 2. Cambia el nombre o la edad de uno de los estudiantes.
// 3. Intenta asignar una edad de 0 y observa qué sucede.
// 4. Explica por qué los atributos están declarados como private.

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Sofía");
        estudiante.setEdad(16);

        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getEdad());
    }
}
