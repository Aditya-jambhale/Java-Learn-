
    import java.util.Scanner;

    public class palindrome12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();
    
            String reversedString = new StringBuilder(userInput).reverse().toString();
    
            System.out.println("Reverse of the string: " + reversedString);
    
            if (isPalindrome(userInput)) {
                System.out.println(userInput + " is a palindrome.");
            } else {
                System.out.println(userInput + " is not a palindrome.");
            }
    
            scanner.close();
        }
    
        private static boolean isPalindrome(String str) {
            return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        }
    } 
