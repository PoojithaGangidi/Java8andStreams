package java8andstreams;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ReturnPalindrome {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
      ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");  
      list.add("malaYALam");
      list.add("Banana");    
      list.add("Grapes");  
      list.add("and");
      list.add("ant");
      list.add("Amma");
      System.out.println(Result(list));
	}

       public static List<String> Result (ArrayList<String> list)
       {
		ArrayList<String> result=new ArrayList<String>();
		for(String s:list)
		{
		       s=s.toLowerCase();
		       String reverse = new StringBuffer(s).reverse().toString(); 
               if (s.equals(reverse)) 
                  result.add(s) ;
                
			
		}
		return result;
	}
}
