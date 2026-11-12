import java.util.Scanner;

public class Main {

    // Solución del reto: recibe dos números enteros y devuelve su suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = teclado.nextInt();

        int resultado = sumar(numero1, numero2);
        System.out.println("La suma es: " + resultado);

        teclado.close();
    }
}
