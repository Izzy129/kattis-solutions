import java.util.ArrayList;
import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int currentTotal = 0;
        int currentHeight = 0;
        int nextHeight = 1;
        
        // this problem could be done with recursion, but I couldn't transcribe my math on paper to a method so here we are
        ArrayList<Integer> theListOfGlory = new ArrayList<>();
        while (currentTotal < height) {
            currentTotal += Math.pow(currentHeight++ + nextHeight++, 2);
            if (currentTotal <= height) {  // I know this seems counter intuitive but it works lol
                theListOfGlory.add(currentHeight);
            } else {
                break;
            }
        }
        System.out.println(theListOfGlory.get(theListOfGlory.size() - 1));
    }
}