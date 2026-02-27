/**
 * @author Kuljot
 * @version 2.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");
                String word = "madam";

                String reversed = "";

                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed = reversed + word.charAt(i);
                }

        System.out.println("Input text :" + word);
                if (word.equals(reversed)) {
                    System.out.println("Is it a Palindrome? : true");
                } else {
                    System.out.println("Is it a Palindrome? : false");
                }
            }
        }

