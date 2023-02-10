import java.util.*;

public class grassseed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cost = scan.nextDouble();
        double lawns = scan.nextDouble();
        double total = 0.0;
        
        for (int i = 0; i < lawns; i++) {
            total += scan.nextDouble() * scan.nextDouble();
        }
        
        total *= cost;
        System.out.printf("%.7f", total);
    }
}
