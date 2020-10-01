package Section1_25_Question;

/*Question:Two inputs of a string array and a string is received. 
           The array shld be sorted in descending order. The index of second 
           input in a array shld be retrieved.
           input1:{"ga","yb","awe"}
           input2:awe
           output:2*/

import java.util.Arrays;
import java.util.Collections;

public class Desending_Q4 {
	
	public static void main(String[] args) {
		
		String s[]={"ga","yb","awe"};
		String x = "awe";	
		
		int location = 0;//1,2
		Arrays.sort(s,Collections.reverseOrder());
		
		for(int i=0;i<s.length;i++)//0,1,2
		{
			String a = s[i];//yb,ga,awe
			if(x.equals(a))//awe...awe.. condition true
			{
				location = i;//2
			}
			
		}System.out.println(location);//2

}
} 