import java.util.Scanner;

public class digitswap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        System.out.println("" + s.charAt(1) + s.charAt(0));
    }
}