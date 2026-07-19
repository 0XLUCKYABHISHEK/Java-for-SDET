/* Problem statement -
        Reverse the words in a sentence, for example: "jai ganesh" -> "ganesh jai"
 */
import java.util.Scanner;

public class ReversingWord {
    // Reverse the order of words in the given string.
    static String reverseWords(String str) {
        // If the input is null or blank, return it unchanged.
        if (str == null || str.isBlank()) {
            return str;
        }

        // Trim extra spaces at the ends and split the sentence into words.
        // The regex "\\s+" splits on one or more whitespace characters.
        String[] words = str.trim().split("\\s+");

        // Use StringBuilder for efficient string concatenation.
        StringBuilder sb = new StringBuilder();

        // Append the words in reverse order.
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            // Add a space between words, but not after the last appended word.
            if (i != 0) {
                sb.append(" ");
            }
        }

        // Convert StringBuilder back to a String and return it.
        return sb.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner to read input from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        // Read the full line entered by the user.
        String sentence = scanner.nextLine();

        // Reverse the words in the sentence.
        String reversed = reverseWords(sentence);

        // Print the result.
        System.out.println("Reversed words: " + reversed);

        // Close the scanner to free resources.
        scanner.close();
    }
}
