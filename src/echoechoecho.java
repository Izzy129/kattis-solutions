import java.util.Scanner;

public class echoechoecho {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        System.out.println(word + " " + word + " " + word);
    }
}
