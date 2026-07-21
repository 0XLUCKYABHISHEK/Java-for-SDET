import java.util.Arrays;
public class ArrayReverse{

    public static void main (String [] args)
    {
        int a []={101,111111144,55,22,44,88,55,45};
          System.out.println(Arrays.toString(a));
        //   System.out.print("before ; "+a[i]);
        for (int i=a.length-1;i>=0;i--){
          System.out.println(+a[i]+",");
        }
        Arrays.sort(a);
          System.out.println(Arrays.toString(a));
        

    }
}