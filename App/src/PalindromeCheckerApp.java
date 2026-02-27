import java.util.Stack;

public class PalindromeCheckerApp {

    // PalindromeChecker class encapsulates palindrome logic
    static class PalindromeChecker {

        // Method to check palindrome using Stack
        public boolean checkPalindrome(String input) {
            Stack<Character> stack = new Stack<>();

            // Push characters onto stack
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            // Pop characters and build reversed string
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            // Compare original and reversed strings
            return input.equals(reversed);
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        String input = "radar";

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}