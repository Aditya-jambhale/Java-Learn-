// import java.util.Scanner;
// public class primewfunc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the number to check if its prime or not:");
//         int num = scanner.nextInt();
//         scanner.close();
//          prime(num);
//     }
//     static void prime(int num) {
//            int c =2;
//            if(c<num)
//            {
//              System.out.println("Enter a valid number");
//            }else if(c%2==0)
//            {
//             System.out.println("Not a prime number");
//             c=c+1;
//            }else 
//            {
//             System.out.println("It is a prime number");
//            }
        
// }}
import java.util.Scanner;

public class PrimeWithFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it's prime or not:");
        int num = scanner.nextInt();
        scanner.close();

        boolean isPrime = checkPrime(num);

        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }

    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
