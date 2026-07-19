// Question 1: Write a Java Program to reverse a String.


public class ReversingString{
    public static void main (String[] agrs){
        String ActualString="Lucky is learing java";
        String reversedString="";
        for(int i=ActualString.length()-1;i>=0;i--){
            reversedString=reversedString+ActualString.charAt(i);
            }
        System.out.println("Original String: "+ActualString);
        System.out.println("Reversed String: "+reversedString);
    }
}


/*public class ReversingString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
*/