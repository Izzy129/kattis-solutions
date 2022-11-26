import java.util.Scanner;

public class triarea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int base = scan.nextInt();
        System.out.println((height*base)/2.0);
    }
}
