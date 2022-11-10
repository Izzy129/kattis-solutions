import java.util.*;

public class sibice {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int matches = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        double answer = Math.sqrt(w*w + h*h);

        for (int i = 0; i < matches; i++) {
            if (answer >= scan.nextInt())
                System.out.println("DA");
            else
                System.out.println("NE");
        }
    }
}
