import java.util.Scanner;

public class NumericalMethods
{
    public static void numericalMethods()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What Fibonacci number do you want to see: ");
        int nTerm = scan.nextInt();
        int f1 = 1;
        int f2 = 1;
        int fn = 1;
        int rep = 1;
        while (rep <= (nTerm-2))
        {
            fn = f1 + f2;
            f2 = f1;
            f1 = fn;
            rep++;
        }
        System.out.println("The " + nTerm + " term of the Fibonacci sequence is " + fn);
    }
}