import java.util.Scanner;
import java.util.Random;
public class MontyHall
{
    public static void MontyHall()
    {
        int count = 1;
        int win = 0;
        int lose = 0;
        
        while (count <= 1000)
        {
            Random generator = new Random();
            int carDoor = generator.nextInt(3) + 1;
            Scanner scan = new Scanner(System.in);
            System.out.print("Pick door 1, 2 or 3: ");
            int playerPick = scan.nextInt();
            
            int goatDoor;
            do 
            {
                goatDoor = generator.nextInt(3) + 1;
            } while (goatDoor == playerPick);
            
            System.out.println("There is a goat behind door " + goatDoor + ". \n" +
                "Would you like to switch your door or open your original choice?");
            
            
            
            System.out.println(carDoor);
            System.out.println(goatDoor);
        }
    }
}
