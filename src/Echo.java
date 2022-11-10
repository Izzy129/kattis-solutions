import java.util.Scanner;

public class Echo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word + " " + word + " " + word);
    }
}