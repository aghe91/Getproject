package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        // Remove punctuation marks and convert to lowercase
        st = st.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();

        // Split the string into words
        String[] words = st.split(" ");

        // Calculate the average length of the words
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        double averageLength = (double) sum / words.length;

        // Find duplicate words and their number of occurrences
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print the results
        System.out.println("Duplicate words and their number of occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("Average length of the words: " + averageLength);
    }
}




