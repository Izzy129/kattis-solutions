import java.util.Scanner; 
import java.util.ArrayList;

public class heimavinna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(";"); // to separate problem sets
        
        int totalProblems = 0;
        
        while (scan.hasNext()) {

            String current = scan.next();
            current = current.replace("-", " ");
            
            Scanner currentScan = new Scanner(current);
            ArrayList<Integer> theList = new ArrayList<>();
            
            while (currentScan.hasNext()) 
                theList.add(currentScan.nextInt());
            if (theList.size() == 1) {
                totalProblems++;
            } else {
                totalProblems+= theList.get(1) - theList.get(0) + 1;
            }
        }
        System.out.println(totalProblems);
    }
}
