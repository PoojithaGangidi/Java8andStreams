package java8andstreams;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReturnAverageOfList {

	public static void main (String[] args) throws java.lang.Exception
	{

       
       List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i<=20; i++)
         {
        	 list.add(i);
         }
      int sum = 0;
      for (int i : list) {
         sum+=i;
      }
      if(list.isEmpty()){
         System.out.println("Empty list!");
      } else
      {
         System.out.println("Average = " + sum/(float)list.size());
      }
   }
}
