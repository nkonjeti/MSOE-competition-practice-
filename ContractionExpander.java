

import java.util.Scanner;
public class ContractionExpander
{
    public static void main (String args[])
    {
        
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String sentence = s.nextLine();
      String string = sentence.replaceAll("I'm", "I am");
      string = string.replaceAll("I've", "I have");
      string = string.replaceAll("I'll", "I will");
      System.out.println(string);
      
      
      
        
    }
}
