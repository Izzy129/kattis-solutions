// 10-31-22

import java.util.*;
import java.io.*;
public class qaly {
    public static void main(String [] args) throws FileNotFoundException { 
        Scanner scan = new Scanner(System.in); // data file
        
        int periods = scan.nextInt(); // periods of constant QoL
        
        double totalQaly = 0.0; // accumulated QALY
        
        for (int i = 0; i < periods; i++) {
            double q = scan.nextDouble(); // 0 <= q <= 1
            double y = scan.nextDouble(); // 0 <= y <= 100
            if ((y < 0 || y > 100) && (q < 0 || q > 1)) // check to see if q and y are in range, otherwise exit loop
                break;
            totalQaly += q*y; // add result to sum 
        } 
        
        System.out.printf("%.3f\n", totalQaly); // prints accumulated QALY with .3 precision
    } // end of method
} // end of program
