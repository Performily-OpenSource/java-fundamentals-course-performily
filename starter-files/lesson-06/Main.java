import java.util.Scanner;

public class Main {

    // RETO: crea aquí un método llamado sumar que reciba dos números int
    // y devuelva su suma

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = teclado.nextInt();

        // Llama al método sumar con numero1 y numero2 y muestra el resultado

        teclado.close();
    }
}
