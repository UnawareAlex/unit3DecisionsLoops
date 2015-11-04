import java.util.Random;

public class DrunkardsWalk
{
    public static void drunkardsWalk()
    {
        Random generator = new Random();
        int x = 0;
        int y = 0;
        int rep = 1;
        while (rep <= 100)
        {
            int direction = generator.nextInt(4) + 1;
            if (direction == 1)
            {
                y += 1;
            }
            else if (direction == 2)
            {
                x += 1;
            }
            else if (direction == 3)
            {
                y -= 1;
            }
            else
            {
                x -= 1;
            }
            rep++;
        }
        System.out.println("The drunkard ended at the point (" + x + "," + y + ")");
    }
}