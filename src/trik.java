import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ArrayList<Integer> cups = new ArrayList<>(Arrays.asList(1,0,0));

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A': 
                    Collections.swap(cups, 0, 1);
                    break;
                case 'B':
                    Collections.swap(cups, 1, 2);
                    break;
                case 'C':
                    Collections.swap(cups, 0, 2);
                    break;
            }
        }
        
        System.out.println(cups.indexOf(1) + 1);
    }
}
