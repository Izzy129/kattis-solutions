import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (scan.nextInt() < 0) 
                counter++;
        }
        scan.close();
        System.out.println(counter);
    }
}
