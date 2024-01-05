import java.util.Scanner;

public class stringexample {
  public static void main(String[] args) {
    String message= name();
    System.out.println("Hello!" + message);
  }  
  static String name()
  {
     Scanner scanner= new Scanner(System.in);
     System.out.print("enter your name:");
     String name = scanner.next();
     return name;
     
  }
}