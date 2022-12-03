import java.util.Scanner;

public class conundrum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!((i%3 == 0 && s.charAt(i) == 'P') || (i%3 == 1 && s.charAt(i) == 'E') || (i%3 == 2 && s.charAt(i) == 'R'))) {
                counter++;
            }
        }
        scan.close();
        System.out.println(counter);
    }
}