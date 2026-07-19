// Question 1: Write a Java Program to reverse a String.

public class SwapingTwoString {
    public static void main(String[] args) {
        String str1 = "ABHISHEK";
        String str2 = "MISHRA";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping strings using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}