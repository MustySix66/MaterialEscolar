// De un texto cualquiera, al ser ingresado el programa deberá decirme:
// ¿Cuantas palabras hay?
// ¿Cuantos espacios hay?
// ¿Cuantas letras sin espacios hay?
// ¿Cuantas veces aparece la frase "¿qué?"
// Cada una debe de ser una funcion diferente que debe ser llamada aparte

import java.util.Scanner;

public class Parrafos {

    // Funcion que cuenta el numero de palabras que hay en el texto
    private static int numeroPalabras(String texto) {
        int contador = 1;
        for (int i = 0; i <texto.length(); i++) {
            if (texto. charAt(i)==' '){
                contador++;
            }
        }
        return contador;
    }

    // Funcion que cuenta los parrafos que hay en el texto
    private static int numeroParrafos(String texto) {
        int contador = 0;
        for (int i = 0; i <texto.length(); i++) {
            if (texto. charAt(i)=='.'){
                contador++;
            }
        }
        return contador;
    }

    // Funcion que quita los caracteres que no sean letras y cuenta cuantas hay
    private static int numeroLetras(String texto) {
        int contador = 0;
        texto = texto.replaceAll(" ", "");
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        for (int i = 0; i <texto.length(); i++) {
            contador++;
        }
        return contador;
    }

    // Funcion que cuenta las palabras que hay en un texto
    public static int contarPalabra(String texto, String palabra) {
        String[] palabras = texto.split("\\s+"); // Este campo separa las palabras a partir de un espacio y las ingresa en una lista
        int contador = 1;
        for (String s : palabras) {
            if (s.equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    // Funcion que ingresa los datos y llama a las demas funciones
    public static void main(String[] args){
        Scanner padrinoScanner = new Scanner(System.in);
        limpiarConsola();
        System.out.println("Ingresa el texto: ");
        String texto = padrinoScanner.nextLine();
        System.out.println("Ingresa la palabra a buscar: ");
        String palabrasec = padrinoScanner.nextLine();
        System.out.println("El texto tiene "+numeroPalabras(texto)+" palabras.");
        System.out.println("El texto tiene "+numeroParrafos(texto)+ " parrafos.");
        System.out.println("El texto tiene "+numeroLetras(texto)+" letras.");
        System.out.println("El texto tiene la palabra '"+palabrasec+"' "+contarPalabra(texto, palabrasec)+" veces.");
        padrinoScanner.close();
    }

    // Funcion que limpia la consola.
    public static void limpiarConsola() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}