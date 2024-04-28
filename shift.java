public class shift {

    public static String shiftingLetters(String s, int[] shifts) {
        int totalShift = 0;
        StringBuilder result = new StringBuilder();

        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift += shifts[i];
            char newChar = (char) ((s.charAt(i) - 'a' + totalShift) % 26 + 'a');
            result.insert(0, newChar); // Insert at the beginning to maintain order
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {1, 2, 3};
        String result = shiftingLetters(s, shifts);
        System.out.println(result);
    }
}
