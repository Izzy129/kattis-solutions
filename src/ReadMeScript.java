// to do

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;

import java.io.*;
import java.net.URL;

public class ReadMeScript {
    public static void main(String[] args) throws IOException {
        listGen(); // Generates a list of all the problems in the folder
        
        ArrayList<String> problems = new ArrayList<String>();
        
        Scanner file = new Scanner(new File(".\\script\\problems.txt"));
        while (file.hasNextLine()) {
            problems.add(file.nextLine());
        }
        file.close();
        problems.remove("ReadMeScript"); // Exclude ReadMe Script        


        ArrayList<String> results = new ArrayList<String>();
        for (String s: problems) {
            String title = urlToTitle("https://open.kattis.com/problems/" + s);
            String result = "| ["+title+"](https://open.kattis.com/problems/"+s+") | [Java](https://github.com/Izzy129/kattis-solutions/blob/master/src/"+s+".java) |";
            System.out.println(result);
            results.add(result);
        }

        Collections.sort(results);
        try (FileWriter writer = new FileWriter(".\\README.md")) { // write final results to readme
            Scanner introScanner = new Scanner(new File(".\\script\\intro.txt")); // write intro
            while (introScanner.hasNext()) {
                writer.write(introScanner.nextLine() + System.lineSeparator());
            }
            introScanner.close();
            for (String result: results) { // write formatted problem entries
                writer.write(result + System.lineSeparator());
            }
            Scanner outroScanner = new Scanner(new File(".\\script\\outro.txt"));
            while (outroScanner.hasNext()) { // write outro
                writer.write(outroScanner.nextLine() + System.lineSeparator());
            }
        } catch (IOException e) { // error catching
            e.printStackTrace();
        }
    } // end of main

    public static void listGen() {
        File directory = new File(".\\src");
        File[] files = directory.listFiles();
        try (FileWriter writer = new FileWriter("script\\problems.txt")) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    name = name.substring(0, name.indexOf("."));
                    writer.write(name + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String urlToTitle(String dirtyUrl) throws IOException {
        // Connect to kattis and retrieve HTML doc
        URL url = new URL(dirtyUrl);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        // Read the HTML content
        String inputLine;
        StringBuilder html = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            html.append(inputLine);
        }
        in.close();

        // get title using regular expression
        //<h1 class="book-page-heading">I've Been Everywhere, Man</h1>
        Pattern pattern = Pattern.compile("<h1 class=\"book-page-heading\">(.*?)</h1>"); // get element in page with problem title
        Matcher matcher = pattern.matcher(html.toString());
        String title = "Title not found";
        if (matcher.find()) {
            title = matcher.group(1);

            title = StringEscapeUtils.unescapeHtml4(title); // replace weird html formatting with real chars (uts8)
        }
        return title;
   }
}
