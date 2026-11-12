public class Main {
    public static void main(String[] args) {
        String nombre = "Lucia";
        int edad = 20;
        double promedio = 16.5;
        boolean estaMatriculado = true;

        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Promedio " + promedio);
        System.out.println("Esta matriculado? " + estaMatriculado);

        edad = 23;
        System.out.println("Nueva edad: " + edad);

        // Solución del reto: mis datos personales
        String miNombre = "Ana";
        int miEdad = 14;
        String comidaFavorita = "Ceviche";

        System.out.println("Mi nombre es " + miNombre);
        System.out.println("Tengo " + miEdad + " años");
        System.out.println("Mi comida favorita es " + comidaFavorita);
    }
}
