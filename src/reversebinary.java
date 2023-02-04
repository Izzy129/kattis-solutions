import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Integer num = Integer.valueOf(scan.nextInt()); // used this instead of a created a new Integer object since that's deprecated
        
        scan.close();
        String binary = Integer.toBinaryString(num);
        String binaryReversed = "";
        for (int i = binary.length() - 1; i >= 0; i--) {
            binaryReversed += binary.charAt(i);
        }

        System.out.println(Integer.valueOf(binaryReversed, 2));
    }
}
