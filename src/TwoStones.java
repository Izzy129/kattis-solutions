import java.util.*;

public class TwoStones {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int stones = scan.nextInt(); 
        
            if (stones % 2 == 0) // even check
                System.out.println("Bob");
            else // will process this if odd
                System.out.println("Alice");
    }
}