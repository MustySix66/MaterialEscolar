import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        // Agregamos el scanner
        Scanner scan = new Scanner(System.in);
        String texto = " ";
        while (true) {
            // Definimos variables.
            System.out.print("¿Cual es la cantidad que deseas retirar? ");
            float SolRetiro = scan.nextFloat();
            // Validamos que la cantidad elegida sea menor a 500.
            if (SolRetiro<=500) {
                // Validamos que la cantidad sea un multiplo de $20
                if (SolRetiro % 20 == 0) {
                    System.out.println("¡Retiro exitoso!");
                    break;
                }else{
                    texto="El cajero solo puede dar multiplos de $20";
                }
            }else{
                texto="No está permitido retirar más de $500.";
            }

            // Añadimos una clase para limpiar la consola despues de cada ciclo.
            limpiarConsola();
            System.out.println(texto);
        }
        // Cerramos el Scaner
        scan.close();
    }

    // Clase que limpia la consola.
    public static void limpiarConsola() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}


