import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, original, remainder, reverse = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}