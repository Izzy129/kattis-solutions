import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        if (s.substring(0,3).matches("555")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
