import java.util.Scanner;
public class Leerconsola {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Dime el primer numero");
        int n1 = scan.nextInt();
        System.out.print("Dime el segundo numero");
        int n2 = scan.nextInt();
        int mayor = n1>n2?n1:n2;
        System.out.print("el número mayor es: " +mayor);
        
        scan.close();

    }
}
