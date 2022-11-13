import java.util.Scanner;

public class bijele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] current = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        
        for (int i = 0; i < current.length; i++) {
            if (current[i] == correct[i]) {
                System.out.print(0 + " ");
            } else {
                System.out.print(correct[i] - current[i] + " ");
            }
        }
    }
}
