public class CiclosWhile {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (i%2!=0){
                System.out.print(i+" - ");
            }
            i++;
            if (i == 101){
                break;
            }
        }
    }
}
