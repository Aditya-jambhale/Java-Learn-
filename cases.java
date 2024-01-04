//switch case
import java.util.Scanner;
public class cases {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    String fruit=scanner.next();
    switch (fruit) {
        case "orange" :
         System.out.println("ROund Fruit");
         break;
         case "Mango":
         System.out.println("KINg of fruits");
         break;
         case "Apple":
         System.out.println("A sweet red furit");
         break;
         case "Bannana" :
         System.out.println("A yellow fruit");
         break;
         default :
         System.out.println("You didn't entered a valid fruit" );

 
    }

    
}
}