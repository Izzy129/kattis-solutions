import java.util.Scanner;

public class greetings2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        int numOfEs = (s.length() - 2) * 2;
        System.out.print("h");
        for (int i = 0; i < numOfEs; i++) {
            System.out.print("e");
        }
        System.out.print("y");
    }
}