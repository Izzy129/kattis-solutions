import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {
            
            // below line does what all those IF statements do, just a lot less readable
            //System.out.println(i % x == 0 && i % y == 0 ? "FizzBuzz" : i % x == 0 ? "Fizz" : i % y == 0 ? "Buzz" : i);
            
            if (i % x == 0 && i % y == 0) 
                System.out.println("FizzBuzz");
            else if (i % x == 0) 
                System.out.println("Fizz");
            else if (i % y == 0) 
                System.out.println("Buzz");
            else 
                System.out.println(i);
            
        }
    }
}