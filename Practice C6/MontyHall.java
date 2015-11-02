import java.util.Scanner;
import java.util.Random;
public class MontyHall
{
    public static void MontyHall()
    {
        int count = 1;
        int switchWin = 0;
        int stayWin = 0;
        
        while (count <= 1000)
        {
            Random generator = new Random();
            int carDoor = generator.nextInt(3) + 1; //randomly chooses door for car
            Scanner scan = new Scanner(System.in);
            //System.out.print("Pick door 1, 2 or 3: ");
            //int playerPick = scan.nextInt(); //player picks a door 1 through 3
            int playerPick = generator.nextInt(3) + 1;
            
            int goatDoor;
            do 
            {
                goatDoor = generator.nextInt(3) + 1; 
                //opens a door that is NOT the car OR the player pick
            } while (goatDoor == carDoor || goatDoor == playerPick);
            
            //System.out.println("There is a goat behind door " + goatDoor + ". \n" +
                //"Would you like to switch your door (1) or stick with your choice (2)?");
//             Scanner s = new Scanner(System.in); 
//             String switchDoor = s.nextInt();
            int switchDoor = generator.nextInt(2) + 1;
            int playerPickFinal;
            if (switchDoor == 1)
            {
               do 
               {
                playerPickFinal = generator.nextInt(3) + 1; 
                //opens a door that is NOT the car OR the player pick
               } while (playerPickFinal == goatDoor || playerPickFinal == playerPick);
               if (playerPickFinal == carDoor)
               {
                   switchWin++;
               }
            }
            else
            {
                playerPickFinal = playerPick;
                if (playerPickFinal == carDoor)
                {
                    stayWin++;
                }
            }
            count++;
        }
        System.out.println("Number of wins from switching doors: " + switchWin);
        System.out.println("Number of wins by staying on door: " + stayWin);
    }
}
