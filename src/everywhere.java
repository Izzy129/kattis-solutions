import java.util.*;

public class everywhere {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        Set<String> s = new TreeSet<String>();
        
        for (int i = 0; i < cases; i++) {
            s.clear();
            int places = scan.nextInt();
            for (int j = 0; j < places; j++) {
                s.add(scan.next());
            }
            System.out.println(s.size());
            
        }
    }
}
