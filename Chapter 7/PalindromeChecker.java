 
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

      
        if (isPalindrome(input)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }

        scanner.close();
    }
 
    public static boolean isPalindrome(String str) {
       
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

  
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


 