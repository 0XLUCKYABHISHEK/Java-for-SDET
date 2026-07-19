public class SumOfDigits 
{
    public static void main(String []a) 
    {
    int number=334422;
    int Digitsum=0;

    while(number > 0)
    {
        int digit=number%10;
        Digitsum=Digitsum+digit;
        number=number/10;
    }
    System.out.println("Sum of digits is: "+Digitsum);


    }

}