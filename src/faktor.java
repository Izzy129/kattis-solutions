import java.util.Scanner;

public class faktor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); 
        double articles = scan.nextInt();
        double impact = scan.nextInt();
        impact -= .99;
        
        System.out.println((int) (articles*impact + 1));
    }
}
