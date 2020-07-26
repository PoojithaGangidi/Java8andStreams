package java8andstreams;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CountNoOfA {
	/* Name of the class has to be "Main" only if the class is public. */
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
      ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");  
      list.add("and");
      list.add("ant");
      System.out.println(Result(list));
	}

       public static List<String> Result (ArrayList<String> list)
       {
		ArrayList<String> result=new ArrayList<String>();
		for(String num:list)
		{
		        if(num.charAt(0)=='a' && num.length()==3)
				result.add(num);
			
		}
		return result;
	}
}
