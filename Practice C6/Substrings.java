import java.util.Scanner;

public class Substrings
{
    public static void substrings()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String input = scan.next();
        
        for (int i = 1; i <= input.length(); i++)
        {
            int start = 0;
            int end = i;
            
            while (end <= input.length())
            {
                String sub = input.substring(start,end);
                System.out.println(sub);
                start++;
                end++;
           
            }
        }
    }
}
    