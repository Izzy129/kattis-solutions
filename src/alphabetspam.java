import java.util.Scanner;

public class alphabetspam {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        double whitespace = 0;
        double uppercase = 0;
        double lowercase = 0;
        double symbol = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String currentChar = "" + s.charAt(i);
            if (currentChar.matches("[A-Z]")) // uppercase counter
                uppercase++;
            else if (currentChar.matches("[a-z]")) // lowercase counter
                lowercase++;
            else if (currentChar.matches("_")) // whitespace counter
                whitespace++;
            else //symbol counter
                symbol++;
        }
        System.out.println(whitespace/s.length());
        System.out.println(lowercase/s.length());
        System.out.println(uppercase/s.length());
        System.out.println(symbol/s.length());
    }
}
