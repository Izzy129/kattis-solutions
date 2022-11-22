import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int total = 0;
        for (int i = 0; i < cases; i++) {
            total += scan.nextInt();
        }
        System.out.println(total -= cases - 1);
    }
}
