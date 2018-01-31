import java.util.*;
import java.util.Scanner;

public class Fibonacci
{
   public static void main(String[] args)
   {
      int index = -1;

      while (index < 0)
      {
         System.out.println("What index of the fibonacci sequence are you looking for?");
         Scanner in = new Scanner(System.in);
         index = in.nextInt();
      }

      int tmp1 = 0;
      int tmp2 = 1;
      int tmpResult;

      for (int i=0; i<index; i++)
      {
         tmpResult = tmp1 + tmp2;
         tmp1 = tmp2;
         tmp2 = tmpResult;
         System.out.println(tmpResult);
      }

      System.out.println("The number you requested was " + tmpResult);
   }
}
