public class Main {
    public static void main(String[] args) {
        int numero = 5;

        // Bucle for: muestra los números del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // Bucle while: se repite mientras quede energía
        int energia = 3;
        while (energia > 0) {
            System.out.println("Energía restante: " + energia);
            energia--;
        }
        System.out.println("Sin energía.");

        // Solución del reto: tabla de multiplicar del 5
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
