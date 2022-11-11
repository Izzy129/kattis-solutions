import java.util.Scanner;

public class encodedmessage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cases = scan.nextInt();

    for (int i = 0; i < cases; i++) {
      String message = scan.next();
      int arraySize = (int)(Math.sqrt(message.length()));
      char[][] messageArray = new char[arraySize][arraySize];
      int j = 0;

      for (int c = messageArray.length - 1; c >= 0; c--) { // there's probably proper terms for this traversal but I forgot it
        // loop to build array from message
        for (int r = 0; r < messageArray.length; r++) {
          messageArray[r][c] = message.charAt(j++);
        }
      }
      for (int r2 = messageArray.length - 1; r2 >= 0; r2--) { // there's probably proper terms for this traversal but I forgot it
        // loop to print decoded array
        // there's definitely a better way of doing this (e.g. decoding message with a method instead of doing random traversals for it), but im tired
        for (int c2 = messageArray.length - 1; c2 >= 0; c2--) {
          System.out.print(messageArray[r2][c2]);
        }

      }
      System.out.println();
    }
  }
}