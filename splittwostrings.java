
//splitstrings and check for palindrome
public class splittwostrings {
    public static void main(String[] args) {
        String s1 = "ulacfd";
        String s2 = "jizalu";
        int splitIndex = 3;

        // First string
        String s1prefix = s1.substring(0, Math.min(splitIndex, s1.length()));
        String s1suffix = s1.substring(Math.min(splitIndex, s1.length()));

        // Second string
        String s2prefix = s2.substring(0, Math.min(splitIndex, s2.length()));
        String s2suffix = s2.substring(Math.min(splitIndex, s2.length()));

        if (isPalindrome(s1prefix + s2suffix)||isPalindrome(s1suffix+s2prefix)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    private static boolean isPalindrome(String string) {
        String reversedString = new StringBuilder(string).reverse().toString();
        return string.equals(reversedString);
    }
}
// check the palindrome at each index
// public class PalindromeFormation {
//     public static void main(String[] args) {
//         String a = "abca";
//         String b = "xyzb";

//         boolean result = canFormPalindrome(a, b);
//         System.out.println(result);
//     }

//     private static boolean canFormPalindrome(String a, String b) {
//         int n = a.length();

//         for (int i = 0; i < n; i++) {
//             String aprefix = a.substring(0, i + 1);
//             String asuffix = a.substring(i + 1);

//             String bprefix = b.substring(0, i + 1);
//             String bsuffix = b.substring(i + 1);

//             if (isPalindrome(aprefix + bsuffix) || isPalindrome(bprefix + asuffix)) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     private static boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;

//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }
// }
