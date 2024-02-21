import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        // Declaramos variables
        String palabraSecreta;
        String letrasAdivinadas="";
        int intentos = 5;
        char letra;

        Scanner scan = new Scanner(System.in);
        // Se solicita la palabra al ususario
        System.out.print("Usuario 1- Introduce una palabra: ");
        palabraSecreta = scan.nextLine();

        // borramos pantalla
        limpiarConsola();

        // Inicio del juego
        System.out.println("Usuario 2- Tienes "+ intentos +" intentos para adivinar la palabra secreta.");
        for (int i = 0; i < palabraSecreta.length(); i++) {
            letrasAdivinadas += "_";
        }
        System.out.println(letrasAdivinadas);

        // Comienza el juego
        while (intentos>0) {
            System.out.println("Introduce una letra.");
            letra=scan.next().charAt(0);
            boolean letraAdivinada = false;
            for (int i = 0; i < palabraSecreta.length() ; i++) {
                if (palabraSecreta.charAt(i)==letra) {
                    letrasAdivinadas=letrasAdivinadas.substring(0,i)
                    +letra+letrasAdivinadas.substring(i+1);
                    letraAdivinada=true;
                }
            }

            // Actualizamos el estado del juego
            if (letraAdivinada) {
                System.out.println("¡La letra "+letra+" está en la palabra secreta!");
                
            }else{
                System.out.println("La letra "+letra+" no está en la palabra secreta.");
                intentos--;
                System.out.println("Te quedan "+intentos+ " intentos.");
            }

            System.out.println(letrasAdivinadas);

            // Comprobamos si el usuario ya ganó
            if (letrasAdivinadas.equals(palabraSecreta)) {
                System.out.println("¡Felicidades, sos alto capo!");
                break;
            }
        }
        if (intentos==0) {
            System.out.println("Ni modo papi, perdiste, la palabra era "+palabraSecreta);
        }
        scan.close();
    }
    


    private static void limpiarConsola() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
