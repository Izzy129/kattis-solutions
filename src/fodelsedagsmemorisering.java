
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class fodelsedagsmemorisering {
  public static void main(String args[]) {

    ArrayList < Person > friends = new ArrayList < > ();
    String name = "";
    int likes = 0;
    String birthday = "";
    try (Scanner scan = new Scanner(System.in)) {
      int people = scan.nextInt();
      scan.nextLine();
      
      for (int i = 0; i < people; i++) {
        String currentLine = scan.nextLine();
        try (Scanner messageScan = new Scanner(currentLine)) {
            name = messageScan.next();
            likes = messageScan.nextInt();
            birthday = messageScan.next();
        } 
        if (!(Person.canAdd(friends, new Person(name, likes, birthday)))) {
          friends.add(new Person(name, likes, birthday));
        }
      }
    }
    // alphabetical sort
    Collections.sort(friends);

    // print answer 
    System.out.println(friends.size());
    for (Person p: friends) {
      System.out.println(p.name);
    }
  }

  public static class Person implements Comparable < Person > {
    public String name = "";
    public int likes = 0;
    public String birthday = "";

    public Person(String n, int l, String b) {
      name = n;
      likes = l;
      birthday = b;
    }
    @Override
    public int compareTo(Person p) {
      if (this.name.compareTo(p.name) > 0) {
        return 1;
      }
      if (this.name.compareTo(p.name) < 0) {
        return -1;
      }
      return 0;
    }
    public static boolean canAdd(ArrayList < Person > a, Person p) {

      for (int i = 0; i < a.size(); i++) {
        if (p.birthday.matches(a.get(i).birthday)) {
          if (p.likes > a.get(i).likes) {
            a.set(i, p);
          }
          return true;
        }
      }
      return false;
    }
    public String toString() {
      String s = "";
      s += name + " ";
      s += likes + " ";
      s += birthday;
      return s;
    }
  }
}
