import java.util.Scanner;

public class shatteredcake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeWidth = scan.nextInt();
        int shattered = scan.nextInt();
        int total = 0;

        for (int i = 0; i < shattered; i++) {
            int width = scan.nextInt();
            int length = scan.nextInt();
            total += width*length;
        }
        scan.close();
        
        System.out.println(total/cakeWidth);
    }
}
