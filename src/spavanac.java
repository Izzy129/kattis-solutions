import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();

        scan.close();
        
        if (min - 45 >= 00) {
            min -= 45;
        } else { 
            min = 60 - Math.abs(min - 45);
            if (hour - 1 < 0) { 
                hour = 23;
            } else {
                hour-=1;
            }
        }
        System.out.println(hour + " " + min);
    }
}