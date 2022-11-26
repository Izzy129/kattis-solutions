import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int[] a = new int[cases];
        
        for (int i = cases - 1; i >= 0; i--) {
            a[i] = scan.nextInt();
        }
        for (int num : a) {
            System.out.println(num);
        }
    }
}