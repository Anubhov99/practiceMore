import java.util.*;

public class Hackerrank {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the binary string
        System.out.print("Enter the binary string: ");
        String input = scanner.nextLine();

        // Call the function and print the result
        System.out.println("Minimum number of data packets: " + getMinSubsequences(input));
    }

    public static int getMinSubsequences(String input) {
        // Base case: if the input is empty or only one character, it is already a special string
        if (input.length() <= 1) {
            return 1;
        }

        // Initialize the count of subsequences to 1 (for the initial subsequence)
        int subsequences = 1;

        // Traverse the string and count the transitions
        for (int i = 1; i < input.length(); i++) {
            // If the current character is the same as the previous one, we need a new subsequence
            if (input.charAt(i) == input.charAt(i - 1)) {
                subsequences++;
                // Skip the next character to ensure no two adjacent characters are the same
                i++;
            }
        }

        return subsequences;
    }
}

class Main1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the length of the array (not needed for processing)
        int n = scanner.nextInt();

        // Read the size of each subsequence
        int k = scanner.nextInt();

        // Read the numbers into a list
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Call the function and print the result
        System.out.println(partitionArray(k, numbers));
    }

    public static String partitionArray(int k, List<Integer> numbers) {
        // Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Calculate the maximum allowable frequency
        int maxSubsequences = numbers.size() / k;

        // Check if any element exceeds the maximum allowable frequency
        for (int freq : frequencyMap.values()) {
            if (freq > maxSubsequences) {
                return "No";
            }
        }

        return "Yes";
    }
}