public class NestedLoops
{
    public static void nestedForLoops()
    {
        for (int left = 1; left <= 2; left++)
        {
            for (int right = 1; right <= 4; right++)
            {
                System.out.println(left + " " + right);
            }
        }
    }
    
    public static void nestedWhileLoops()
    {
        int left = 1;
        while (left <= 2)
        {
            int right = 1;
            while (right <= 4)
            {
                System.out.println(left + " " + right);
                right ++;
            }
            left ++;
        }
    }
    
    public static void nestedDoLoops()
    {
        int left = 1;
        do {
            int right = 1;
            do {
                System.out.println(left + " " + right);
                right ++;
            } while (right <= 4);
            left ++;
        } while (left <= 2);
    }
}

        
 

            