//Take the input and find the largest and smallest
import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner large = new Scanner(System.in);
        System.out.print("Enter a num1 :");
        int num1=large.nextInt();
        System.out.print("Enter a num2 :");
        int num2=large.nextInt();
        
        if (num1>num2) {
            System.out.println(num1+"is greater");
         }
         else if (num2>num1) {
            System.out.println(num2+"is greater");
        }
        else if(num1==num2){
          System.out.println("Both are equal");
          
        }scanner.close();
}}

