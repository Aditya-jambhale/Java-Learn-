//normal funcitons declarations 
import java.util.Scanner;
public class functions{
    public static void main(String[] args) {
        sum();
    }
    static void sum()
    {
     Scanner s = new Scanner(System.in);
     System.out.print("Enter the num 1 :");
     int num1 = s.nextInt();
     System.out.print("Enter the num 2 :");
     int num2 = s.nextInt();
     int sum= num1 + num2;
     System.out.println("sum: " + sum);

    }
}