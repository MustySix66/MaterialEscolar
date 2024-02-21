import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
         // Se ingresa la palabra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String palabra = scanner.nextLine();

        // Convertimos a minúsculas para facilitar la comparacion
        palabra = palabra.toLowerCase(); 

        // Remplazamos los espacios para convertir la frase en una palabra.
        palabra=palabra.replace(" ", "");
        String palabraInvertida = "";

        // invertimos la palabra y la ingresamos en un String
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        if (palabra.equals(palabraInvertida)==true){
            System.out.println("La frase es un palindromo. ");
        }else{
            System.out.println("La frase no es un palindromo. ");
        }
        scanner.close();
    }
}
