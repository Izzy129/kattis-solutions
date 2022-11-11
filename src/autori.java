import java.util.*;
public class autori {
    public static void main(String args[]) {
        getFirstLetters();
    }
    
    public static void getFirstLetters() {
        Scanner input = new Scanner(System.in); // input stream
        String s = input.next();
        
        Scanner scan = new Scanner(s); // input usage
        scan.useDelimiter("-");
        
        ArrayList<String> wordArray = new ArrayList<String>();
        String newString = "";
        
        while (scan.hasNext())
            wordArray.add(scan.next());
        for (String word: wordArray) 
            newString += word.charAt(0);
        System.out.println(newString);
    }
}
