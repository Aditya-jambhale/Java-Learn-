import java.util.*;

public class CommonCharacters {

    public static List<String> commonChars(String[] words) {
        // Check if the input array is null or empty
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        // Array to store the minimum frequency of each character (26 letters of the alphabet)
        int[] minFreq = new int[26];
        // Initialize the minFreq array with the maximum possible integer value
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        // Debug: Print the initial state of minFreq array
        System.out.println("Initial minFreq: " + Arrays.toString(minFreq));

        // Iterate through each word in the words array
        for (String word : words) {
            // Array to store the frequency of each character in the current word
            int[] charFreq = new int[26];
            // Debug: Print the current word being processed
            System.out.println("Processing word: " + word);
            for (char c : word.toCharArray()) {
                // Increment the frequency of the current character
                charFreq[c - 'a']++;
            }
            // Debug: Print the character frequencies for the current word
            System.out.println("Character frequencies: " + Arrays.toString(charFreq));

            // Update the minimum frequency array based on the current word's character frequencies
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
            // Debug: Print the updated state of minFreq array
            System.out.println("Updated minFreq: " + Arrays.toString(minFreq));
        }

        // List to collect the common characters including duplicates
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            // Add the character to the result list as many times as its minimum frequency
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        // Debug: Print the final result list
        System.out.println("Final result: " + result);

        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"bella", "label", "roller"};
        String[] words2 = {"cool", "lock", "cook"};

        System.out.println("Test Case 1: " + commonChars(words1));  // Output: ["e", "l", "l"]
        System.out.println("Test Case 2: " + commonChars(words2));  // Output: ["c", "o"]
    }
}
