//calculate the interest rate for the given amount
import java.util.Scanner;
public class loan {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the amount of loan you want to take:");
        int principal=p.nextInt();
        System.out.print("Eneter the Rate of interest you want to take loan at:");
        float rate=p.nextFloat();
        System.out.print("Eneter the duration you want to take loan for:");
        int duration=p.nextInt();
        float si=principal*rate*duration/100;
        System.out.println("The interest rate for the entered amount for per year is :"+si);
        float amount=principal+si;
        System.out.println("The amount you will be paying to bank at end of given duration is :"+amount);
        System.out.println("Thank you for taking the loan from our bank");
    }
}
