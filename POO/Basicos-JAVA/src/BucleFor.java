public class BucleFor {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++){
            boolean primo = true;
            for (int j=2;j<=i-1;j++){
                if (i % j == 0){
                    primo=false;
                    break;
                }
            }
            if (primo){
                System.out.print(i+"-");
            }
        }
    }
}
