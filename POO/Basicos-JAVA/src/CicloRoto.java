public class CicloRoto {
    public static void main(String[] args) {
        int i = 0;
        while (i<=100) {
            i++;
            if (i%2 != 0){
                continue;
            }
            System.out.print(i+" - ");
            
        }
    }
}
