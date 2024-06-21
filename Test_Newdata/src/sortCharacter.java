import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sortCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Input one line of words: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Process and print results
        processAndPrintResult(input);
    }

    public static void processAndPrintResult(String input) {
        // Define vowels and consonants sets
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        // Normalize input to lowercase and remove whitespaces
        input = input.toLowerCase().replaceAll("\\s", "");

        // Using TreeMap to sort characters automatically
        Map<Character, Integer> vowelMap = new TreeMap<>();
        Map<Character, Integer> consonantMap = new TreeMap<>();

        // Iterate through each character in the input
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelMap.put(ch, vowelMap.getOrDefault(ch, 0) + 1);
            } else if (consonants.indexOf(ch) != -1) {
                consonantMap.put(ch, consonantMap.getOrDefault(ch, 0) + 1);
            }
            // Ignore characters that are neither vowel nor consonant
        }

        // Print the results as specified
        System.out.println("Vowel Characters :");
        for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();

        System.out.println("Consonant Characters :");
        for (Map.Entry<Character, Integer> entry : consonantMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
    }
}
