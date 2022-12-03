import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class findinganaALT {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = null;
        BufferedWriter output = null;
        try {
            String s;
            reader = new BufferedReader(new InputStreamReader(System.in));
            output = new BufferedWriter(new OutputStreamWriter(System.out));
            
            s = reader.readLine();
            reader.close();
            
            output = new BufferedWriter(new OutputStreamWriter(System.out));
            output.write(s.substring(s.indexOf("a")));
            output.close();
        } finally {
        }
    }
}
