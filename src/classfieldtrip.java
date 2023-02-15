    import java.util.Arrays;
    import java.util.Scanner;

    public class classfieldtrip {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String list = "";
            while (scan.hasNext()) 
                list+=scan.next();
            
            scan.close();

            char[] listArr = list.toCharArray();
            
            Arrays.sort(listArr);
            
            for (char c: listArr) 
                System.out.print(c);
        }
    }
