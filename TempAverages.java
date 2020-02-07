//lab test
//Andrew Gung
import java.util.*;

public class TempAverages
{

  public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);

   double temp1, temp2, temp3, temp4, temp5, temp6, temp7;
   double oddTempAverage, evenTempAverage;
   //input
   {
     temp1 = s.nextDouble();
     temp2 = s.nextDouble();
     temp3 = s.nextDouble();
     temp4 = s.nextDouble();
     temp5 = s.nextDouble();
     temp6 = s.nextDouble();
     temp7 = s.nextDouble();

   s.nextLine();
 }

 //average for even
 {
   evenTempAverage = (float) (temp2 + temp4 + temp6)/3;
   System.out.println(evenTempAverage);
 }

 //average for odd
 {
   oddTempAverage = (float) (temp1 + temp3 + temp5 + temp7)/4;
   System.out.println(oddTempAverage);

    }
  }
}
