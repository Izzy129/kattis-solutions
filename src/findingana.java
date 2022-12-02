import java.util.Scanner;

public class findingana {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        System.out.println(s.substring(s.indexOf("a")));
      
    }
}
