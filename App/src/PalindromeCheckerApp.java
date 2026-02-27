public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // Normalize: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        // Compare normalized and reversed strings
        return normalized.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}