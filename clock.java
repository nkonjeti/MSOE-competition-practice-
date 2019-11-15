

import java.util.Scanner;
public class clock
{
   public static void main (String args[]) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter minutes");
       double num = s.nextDouble();
      double x = 0;
       double y = 0;
       if(num > 0) {
          double angle = (5/60)*num*360;
          System.out.println(angle);
          x = -Math.cos(Math.toRadians(angle));
          y = Math.sin(Math.toRadians(angle));
          
           
        }
           
       System.out.println("Minute hand is at (x,y) " + ": " + x +"," + y);    
       
       
       
       
       
    }
}

