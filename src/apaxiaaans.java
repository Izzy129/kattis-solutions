import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        String[] sArray = s.split("");
        System.out.print(sArray[0]);
        for (int i = 1; i < sArray.length; i++) {
            if (!(sArray[i].equalsIgnoreCase(sArray[i-1]))) {
                System.out.print(sArray[i]);
            }
        }
    }
}
