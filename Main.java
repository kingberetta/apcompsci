// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      System.out.println("What is your name?");
      String a = scn.nextLine();
      
      System.out.println("Where are you from");
      String b = scn.nextLine();
      
      System.out.println("Tell me more about yourself, " + a);
      String c = scn.nextLine();
      
      System.out.println("That's very nice, How old are your parents?");
      String d = scn.nextLine();
      
      System.out.println("That's interesting, they look a lot younger than " + d);
      String e = scn.nextLine();
      
      System.out.println("Well thank you for talking to me, " + a + ". It was very nice talking to you and I look forward to visiting " + b + " now that you've mentioned it!");
      
      scn.close();
    }
}
