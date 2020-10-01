package Section1_25_Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

  /* Question: An arraylist of Strings is given as input. The count of the String elements
              that are not of size input2 string is to be returned.
              input1: {"aaa","bb","cccc","d"}
              input2: "bb"
              output: 3("bb"-length:2)*/

public class arrystring_Q8 {
	
	
	public static void main(String[] args)
	{
		
			String s[]= {"aaa","bb","cccc","d"};
	        String s1="bb";
	        int ans=0;
	        for(int i=0;i<s.length;i++)
	{
		    if(s1.length()!=s[i].length()) {
			ans++;
		}
	
	}
	
	     System.out.println(ans);
	
	}
}
	
	
		
		
		
		
		
       /*String s[]= {"aaa","bb","cccc","d"};
		String s1="bb";
		int count=0;
		for(int i=0;i<s.length;i++)//0,1,2,3
		{
			if(s1.length()!=s[i].length()) {
				count++;//1,2,3
			}
			else{
			     System.out.println("the number of matching string: "+count);//1
	             }
			}
		
		System.out.println("the string does not matching: "+count);//3
		
	}*/

		
		
		
		
		
		
		
		
		
		
		
		
		
		
