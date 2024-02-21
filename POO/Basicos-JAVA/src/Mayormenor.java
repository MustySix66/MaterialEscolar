public class Mayormenor {
    public static void main(String[] args) {
        int n1 = 5 ;
        int n2 = 10;
        int n3 = 15;
        if(n1 > n2){
            System.out.println("El mayor es " + n1);
        }else{
            System.out.println("El menor es " + n2);
            if(n2 > n3){
                System.out.println("el mayor es " + n2);
            }else{
                System.out.println("el menor es " + n3);
            }
        }
        int mayor = n1>n2?n1:n2;
        System.out.println("El mayor es " + mayor);
        }
    }

