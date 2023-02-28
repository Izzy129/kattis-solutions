import java.util.*;
public class countthevowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        scan.close();

        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentChar = "" + s.charAt(i);

            if (currentChar.matches("[AEIOUaeiou]")) {
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
