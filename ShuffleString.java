public class ShuffleString {
    public static void main(String[] args) {
        String s = "ogdnci";
        int[] indices = {1,5,2,4,0,3};

        // Create a character array to hold the shuffled string
        char[] shuffledString = new char[s.length()];

        // Construct the shuffled string based on indices
        for (int i = 0; i < indices.length; i++) {
            shuffledString[indices[i]] = s.charAt(i);
        }

        // Convert the character array to a string
        String result = new String(shuffledString);
        System.out.println("Shuffled String: " + result);
    }
}
