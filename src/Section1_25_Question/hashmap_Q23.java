package Section1_25_Question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap_Q23 {
	
		/* Question: In a hashmap if key is odd then find average of value as integer
		             ex: h1={1:4,2:6,4:7,5:9}
		             output=(4+9)/2
		*/


	
	
		 public static int avgValuesOfOddKeys(Map<Integer, Integer> m1) {
		  int l=0,
		      m=0;
		  Iterator<Integer> i = m1.keySet().iterator();
		  while(i.hasNext())
		  {
		  int n=(Integer) i.next();//1,2,4,5...keys
		  if(n%2!=0)//odd condition
		  {
		   m+=m1.get(n);//4+9=13
		   l++;//1,2
		   } 
		  }
		    return m/l;//13/2=6
		}
		
		
	         public static void main(String[] args) {
			 Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
			 m1.put(1, 4);
			 m1.put(2, 6);
			 m1.put(4, 7);
			 m1.put(5, 9);
			 System.out.println(avgValuesOfOddKeys(m1));
			}
		}