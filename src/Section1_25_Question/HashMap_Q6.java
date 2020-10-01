package Section1_25_Question;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*  Question:  HashMap with regnum as key and mark as value. find the avg of marks whose
               key is odd.
               input:{12:90,35:90,33:90,56:88}
               output:avg of(90+90) =90  */

public class HashMap_Q6 {
  
	
	public static int AvgOfMarks(Map<Integer,Integer> m1){
		   int n=0,c=0;
		   Iterator<Integer> i=m1.keySet().iterator();
		   while(i.hasNext()){
		   Integer b=i.next();//integer
		   if(b%2!=0)
		   {
		    c++;//1,2
		    n+=m1.get(b);//90+90 =180
		    } 
		   }
		  return (n/c); //180/2
		 }
		 public static void main(String[] args) {
		  Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		  m1.put(12, 70);
		  m1.put(35, 90);
		  m1.put(33, 60);
		  m1.put(56, 88);
		
		  System.out.println(AvgOfMarks(m1));
		 }
		}