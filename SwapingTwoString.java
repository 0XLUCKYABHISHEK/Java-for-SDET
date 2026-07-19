// Question 1: Write a Java Program to reverse a String.

/*public class SwapingTwoString {
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
}*/



/* 
Swaping two strings without using a temporary variable can be done by concatenating the strings and then extracting the original values.

*/

public class SwapingTwoString {
    public static void main(String[] args) {
        String str1 = "ABHISHEK";
        String str2 = "MISHRA";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping strings without using a temporary variable
        str1 = str1 + str2; // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
        str1 = str1.substring(str2.length()); // Extract original str2

        System.out.println("After swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}