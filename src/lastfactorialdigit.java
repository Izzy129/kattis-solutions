import java.util.*;


public class lastfactorialdigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            int current = scan.nextInt();
            
            if (current == 1) {
                System.out.println(1);
            } else if (current == 2) {
                System.out.println(2);
            } else if (current == 3) {
                System.out.println(6);
            } else if (current == 4) {
                System.out.println(4);
            } else {
                System.out.println(0);
            }
                    
        }

    }
}
