// take input and add all the integers
import java.util.Scanner;

public class InputAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // 2. Adding the 'n' numbers:
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of the numbers is: " + sum);
    }
}


