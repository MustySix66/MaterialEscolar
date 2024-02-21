import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {

        // Se ingresa la palabra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        String palabra = scanner.nextLine();

        // Convertimos a minúsculas para facilitar la comparacion
        palabra = palabra.toLowerCase(); 
        String palabraInvertida = "";

        // invertimos la palabra y la ingresamos en un String
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
            System.out.println(palabraInvertida); //prueba
        }

        boolean esPalindromo = true;
        // Comparamos la palabra invertida con la original
        for (int i = 0; i < palabra.length(); i++) {
            // Si dejan de ser similares, se declara falsa la condicion y se rompe el ciclo
            if (palabra.charAt(i) != palabraInvertida.charAt(i)) {
                esPalindromo = false;
                break;
            }
        }

        // Hacemos la comparativa e imprimimos la palabra
        if (esPalindromo) {
            System.out.println("La palabra es Capicua.");
        } else {
            System.out.println("La palabra no es Capicua.");
        }

        scanner.close();
    }
}
