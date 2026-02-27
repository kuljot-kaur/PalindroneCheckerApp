import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        String reversed = "";
        while (!stack.isEmpty()) reversed += stack.pop();
        return input.equals(reversed);
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Recursive palindrome check
    public static boolean recursivePalindrome(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursivePalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "racecar".repeat(1000); // large input to measure performance

        // Stack method timing
        long start = System.nanoTime();
        stackPalindrome(input);
        long end = System.nanoTime();
        System.out.println("Stack approach: " + (end - start) + " ns");

        // Deque method timing
        start = System.nanoTime();
        dequePalindrome(input);
        end = System.nanoTime();
        System.out.println("Deque approach: " + (end - start) + " ns");

        // Recursive method timing
        start = System.nanoTime();
        recursivePalindrome(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive approach: " + (end - start) + " ns");
    }
}