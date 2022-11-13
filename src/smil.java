import java.util.Scanner;

public class smil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == ':' || s.charAt(i) == ';') {
                if (s.charAt(i+1) == ')') {
                    System.out.println(i);
                } else if (s.charAt(i+1) == '-' && s.charAt(i+2) == ')') {
                    System.out.println(i);
                }
            }
        }
    }
}