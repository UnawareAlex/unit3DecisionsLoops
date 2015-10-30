import java.util.Scanner;

public class Diamond
{
    public static void Diamond()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int side = scan.nextInt();
        int num = (side * 2) - 1; //Number of rows, max number of stars and spaces
        String space = "_";
        String maxSpaces = "";
        int numAsteriks = 1;
        int indexStart = (side/2) - 1;
        for (int i = 1; i <= num; i++)
        {
            maxSpaces += space;

        for (int n = 0; n < num; n++)
        {
            char[] maxSpacesChars = maxSpaces.toCharArray();
            maxSpacesChars[indexStart] = '*';
            maxSpaces = String.valueOf(maxSpacesChars);
            indexStart++;
            
        }
    }
    System.out.println(maxSpaces);
}
}