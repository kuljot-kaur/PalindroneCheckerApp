/**
 * @author Kuljot
 * @version 9.0
 */

public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: crossed pointers or single char left
        if (start >= end) {
            return true;
        }
        // If mismatch, not palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call moving towards the middle
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "racecar";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}