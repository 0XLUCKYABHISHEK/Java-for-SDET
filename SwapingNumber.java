public class SwapingNumber{
    public static void main(String[]args){
        int num1=20;
        int num2=30;
    System.out.println("Before Swaping num1= "+num1+ "  Num2= "+num2);
    num1=num1+num2;
    System.out.println(" num1= "+num1+ "  Num2= "+num2);
    num2=num1-num2;
    System.out.println(" num1= "+num1+ "  Num2= "+num2);
    num1=num1-num2;
    System.out.println("Before Swaping num1= "+num1+ "  Num2= "+num2);

    }
}