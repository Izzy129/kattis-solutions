import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("%.2f", (double) scan.nextInt()/4);
        scan.close();
    }
}
