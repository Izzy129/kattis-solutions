import java.util.*;
public class isithalloween {
    public static void main (String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); // scan for input
        String data = scan.nextLine();
        if (data.matches("OCT 31") || data.matches("DEC 25"))  
            System.out.println("yup");
        else
            System.out.println("nope");
    }
}
