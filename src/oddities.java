import java.util.Scanner;

public class oddities {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        
        for (int i = 0; i < cases; i++) {
            int currentNum = scan.nextInt();
            if (currentNum % 2 == 0)
                System.out.println(currentNum + " is even");
            else 
                System.out.println(currentNum + " is odd");
        }
        
    }
}
