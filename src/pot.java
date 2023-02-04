import java.util.Scanner;

public class pot {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int cases = scan.nextInt();
      scan.nextLine();
      int total = 0;
      for (int i = 0; i < cases; i++) {
          total = 0;
          String num = scan.next();
          total += Math.pow(Integer.parseInt(num.substring(0, num.length() - 2)), Integer.parseInt("" + num.charAt(num.length()-1)));
            System.out.println(total);
      }
        
    }
}
