/**
 * @author Kuljot
 * @version 4.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        String original = "level";
        String reversed = "";


        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("input : " + original);
        if (original.equals(reversed)) {
            System.out.println("is a Palindrome? : true");
        } else {
            System.out.println("is a Palindrome? : false");
        }
            }
        }

