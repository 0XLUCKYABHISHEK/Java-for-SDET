/*
public class Fibonacci{
    public static void main(String[] args) {
        int n=10,firstTerm=0,sceondTerm=1;
        System.out.println("Fibonacci Series till "+n+" terms:");
        for(int i=1;i<=n;i++){
            System.out.print(firstTerm+", ");
            int nextTerm=firstTerm+sceondTerm;
            firstTerm=sceondTerm;
            sceondTerm=nextTerm;
        }
    }    
}
*/

//with method
 public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Series till " + n + " terms:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}