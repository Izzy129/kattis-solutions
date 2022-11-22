import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] moves = s.toCharArray();
        int[] cups = new int[3];
        cups[0] = 1;
        int temp = 0;

        for (char c: moves) {
            switch (c) {
                case 'A': 
                    temp = cups[1];
                    cups[1] = cups[0];
                    cups[0] = temp;
                    break;
                case 'B':
                    temp = cups[2];
                    cups[2] = cups[1];
                    cups[1] = temp;
                        break;
                case 'C':
                    temp = cups[2];
                    cups[2] = cups[0];
                    cups[0] = temp;
                    break;
            }
        }
        for (int i = 0; i < cups.length; i++) {
            if (cups[i] == 1) {
                System.out.println(++i);
                break;
            }
        }
    }
}
