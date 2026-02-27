import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack-based strategy implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return input.equals(reversed);
    }
}

// Deque-based strategy implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class to use chosen strategy
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    public PalindromeCheckerContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Use stack strategy
        PalindromeCheckerContext context = new PalindromeCheckerContext(new StackStrategy());
        System.out.println("Using Stack Strategy:");
        printResult(input, context.checkPalindrome(input));

        // Switch to deque strategy dynamically
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy:");
        printResult(input, context.checkPalindrome(input));
    }

    private static void printResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}