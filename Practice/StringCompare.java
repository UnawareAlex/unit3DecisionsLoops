// 5) To compare strings in Java you can’t simply use the relational operators. 
// You need to use methods of the String class: equals(), compareTo(), and substring(). 
// Assume the following code:
// 
// String word1 = "catalog";
// String word2 = "cat";
// Write the following conditions in Java:
// 
// 1) word1 is lexicographically greater than "aaa"
// 2) word1 is lexicographically equal to word2
// 3) word1 is lexicographically less than word2 
// 4) word1 and word2 have the same three-letter prefix


public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        int result = word1.compareTo("aaa");
        String adj = "";
        if (result == 0)
        {
            adj = "equal";
            System.out.println("word1 is " + adj + " than \"aaa\"");
        }
        else if (result > 0)
        {
            adj = "greater";
            System.out.println("word1 is " + adj + " than \"aaa\"");
        }
        else
        {
            adj = "less";
            System.out.println("word1 is " + adj + " than \"aaa\"");
        }
        
        if (word1.equals(word2))
        {
            System.out.println("word1 is equal to word2");
        }
        else 
        {
            System.out.println("word1 is NOT equal to word2");
        }
        
        int result2 = word1.compareTo(word2);
        if (result2 == 0)
        {
            adj = "equal";
            System.out.println("word1 is " + adj + " than " + word2);
        }
        else if (result2 > 0)
        {
            adj = "greater";
            System.out.println("word1 is " + adj + " than " + word2);
        }
        else
        {
            adj = "less";
            System.out.println("word1 is " + adj + " than " + word2);
        }
        
        if (word1.substring(0,3).equals(word2.substring(0,3)))
        {
            System.out.println("The prefixes are equal");
        }
        else
        {
            System.out.println("The prefixes are NOT equal");
        }
    }
}
        