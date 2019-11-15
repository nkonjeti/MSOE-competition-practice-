

import java.util.Scanner;
public class I_before_e_except_after_c
{
   public static void main (String args[]) {
       
       Scanner s = new Scanner(System.in);
       System.out.println("Enter sentence");
       String sentence = s.nextLine();
       String[] words = sentence.split(" ");
       int count = 1;
       for (String x: words) {
           if (x.contains("ei")) {
              if (!x.contains("cei")) {
                  System.out.println(count + " : " + x);
                }
            }
            count++;
        
           
        }
    }   
    
}

