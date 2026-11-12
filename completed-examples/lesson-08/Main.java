class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor que cero.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Sofía", 16),
            new Estudiante("Mateo", 15),
            new Estudiante("Valeria", 17)
        };

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("--- Estudiante " + (i + 1) + " ---");
            estudiantes[i].mostrarDatos();
        }

        // Solución del reto final
        System.out.println("=== Reto final ===");

        // 1. Agregamos un cuarto estudiante
        Estudiante[] registro = {
            new Estudiante("Sofía", 16),
            new Estudiante("Mateo", 15),
            new Estudiante("Valeria", 17),
            new Estudiante("Lucas", 14)
        };

        // 2. Cambiamos la edad de Mateo
        registro[1].setEdad(16);

        // 3. Intentamos poner edad 0: se muestra el aviso y la edad no cambia
        registro[2].setEdad(0);

        for (int i = 0; i < registro.length; i++) {
            System.out.println("--- Estudiante " + (i + 1) + " ---");
            registro[i].mostrarDatos();
        }

        // 4. Los atributos son private para que nadie los cambie directamente:
        //    solo se pueden modificar con los setters, que revisan que los datos sean válidos.
    }
}
