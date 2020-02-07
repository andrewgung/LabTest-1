//lab test
//Andrew Gung
import java.util.*;

public class TempAverages
{

  public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);

   float temp1, temp2, temp3, temp4, temp5, temp6, temp7;
   float oddTempAverage, evenTempAverage;
   //input
   {
     temp1 = s.nextFloat();
     temp2 = s.nextFloat();
     temp3 = s.nextFloat();
     temp4 = s.nextFloat();
     temp5 = s.nextFloat();
     temp6 = s.nextFloat();
     temp7 = s.nextFloat();

   s.nextLine();
 }

 //even average
 {
   evenTempAverage = (float) (temp2 + temp4 + temp6)/3;
   System.out.println(evenTempAverage);

//odd average
   oddTempAverage = (float) (temp1 + temp3 + temp5 + temp7)/4;
   System.out.println(oddTempAverage);  }

 }
}
