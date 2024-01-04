// Fibonacci series 
//import java.util.Scanner;
// public class series {
//     static void fibonacci(int val){
//         int num1=0;
//         int num2=1;
//         for(int i=0;i<val;i++){
//         System.out.println(num1+" ");
//         int num3=num1+num2;
//         num1=num2;
//         num2=num3;
//     }}
//     public static void main(String[] args) {
//         Scanner value=new Scanner(System.in);
//         System.out.print("Enter the value for the series:");
//         int val=value.nextInt();
//         fibonacci(val); 
//     }
// }


// import java.util.Scanner;
// public class series
// {
   
// static void Palindrome(String val)
//    {
//         String rev="";
//          int length=val.length();
//          for(int i=length-1; i>=0; i--)
//          {
//             rev= rev + val.charAt(i);
//             if(val.equals(rev))
//             {
//                 System.out.println(val+"is a Plaindrome");
//             }else 
//             {
//                 System.out.println(val+"is not a Palindrome");
//             }
//          }
//     }

//     public static void main(String[] args) 
//     {
//         Scanner in =new Scanner(System.in);
//         System.out.print("Enter the word to be checked for palindrome: ");
//         String val=in.nextLine();
//         Palindrome(val);
//     }
// }

import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  