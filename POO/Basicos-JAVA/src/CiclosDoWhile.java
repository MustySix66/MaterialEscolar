import java.util.Random;
import java.util.Scanner;

public class CiclosDoWhile {
    private static Random aleatorio = new Random(); // crea un objeto de clase Aleatorio.
    private static int numero=aleatorio.nextInt(100)+1; //genera un valor entre 1 y 10

    //Funcion que compara el intento con el numero aleatorio.
    private static boolean verificarNum(int intento){
        if (intento==numero){
            return true;
        }else{
            if (intento>numero){
                System.out.println("El numero que buscas es más bajo. ");
            }else{
                System.out.println("El numero es mas alto. ");
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int cont = 1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Tienes 10 intentos para adivinar el numero. ");
        System.out.println("¡Vamos a jugar!");
        do{
            System.out.println("Este es tu intento numero "+cont+", escribe un numero entre 1 y 100: ");
            int intento = lector.nextInt();
            if (verificarNum(intento)== true){
                System.out.println("¡ Felicidades, adivinaste en el intento numero: "+cont+"!");
                break;
            }else{
                System.out.println("Fallaste, vuelve a intentarlo. llevas: "+cont+" intentos");
                cont++;
            }
            if (cont>=11){
                System.out.println("te quedaste sin intentos, sorry!");
                break;
            }
        }while(true);
        lector.close();
    }
}