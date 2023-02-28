import java.util.*;
import java.io.*;
public class chanukah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();

        for (int i = 0; i < cases; i++) {
            int day = scan.nextInt();
            int candles = scan.nextInt();
            int total = 0;
            for (int j = 1; j <= candles; j++) {
                total += j;
            }
            total += candles;
            System.out.println(day + " " + total);
        }
        scan.close();       
    }
}