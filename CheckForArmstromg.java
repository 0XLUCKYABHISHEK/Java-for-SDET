/**
 * This program checks whether a given number is an Armstrong number or not.
 * An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits raised to the power of the number of digits.
 * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */

/*
public class CheckForArmstrong {
    public static void main(String[] args) {
        int number = 1634; // You can change this number to test other values
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
*/

/* Armstrong number between 1000
*/
public class CheckForArmstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1000 and 9999 are:");
        for (int number = 10; number <= 9999; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}