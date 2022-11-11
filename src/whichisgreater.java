public class whichisgreater {
    public static void main(String[] args) {
        System.out.println(WhichIsGreater(13, 14));
    }
    public static int WhichIsGreater(int num1, int num2) {
        
        if (num1 > num2) 
            return 1;
        else 
            return 0;
    }
}
