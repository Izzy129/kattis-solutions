import java.util.Scanner;

public class oddecho {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        
        if (lines % 2 == 1) {
            for (int i = lines; i >=0 ; i--) {
                if (i % 2 == 0)
                    System.out.println(scan.nextLine());
                else
                    scan.nextLine();
            }
        } else {
            for (int i = 0; i <= lines ; i++) {
                if (i % 2 == 0)
                    System.out.println(scan.nextLine());
                else
                    scan.nextLine();
            }
        }
    }
}
