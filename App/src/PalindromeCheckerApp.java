/**
 * @author Kuljot
 * @version 8.0
 */

public class PalindromeCheckerApp {

    // Move Node class here, static so main can access it directly
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check palindrome - also outside main
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null, curr = slow.next, nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Compare halves
        Node first = head;
        Node second = prev;
        while (second != null) {
            if (first.data != second.data) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "level";

        // Convert string to linked list
        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}