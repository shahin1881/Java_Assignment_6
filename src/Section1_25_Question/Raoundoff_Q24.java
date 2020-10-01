package Section1_25_Question;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*Question:  input1 is a map<Integer,Float>
             {1:2.3,2:5.6,3:7.7,4:8.4} 
             get the even number from keys and find the avg of values of these keys.
             answer should be rounded to two numbers after decimal
    eg:- the output number 15.2499999 should be 15.28*/

public class Raoundoff_Q24 {

	
	   public static float avgOfEvenKeyValues(Map<Integer, Float> m1) {
	   int n1=0,n3=0;
	  float n2=0;
	  Iterator<Integer> i= m1.keySet().iterator();
	   while(i.hasNext()){
	  n1=(Integer) i.next();
	  if(n1%2==0){
	   n2+=m1.get(n1);
	   n3++;
	   }
	  }
	  float n=Math.round((n2/n3)*100)/100f;
	  return n;
}
	
	     public static void main(String[] args) {
		 Map<Integer,Float> m1=new HashMap<Integer, Float>();
		 m1.put(1, (float) 12.93);
		 m1.put(2, (float) 15.67);
		 m1.put(3, (float) 17.27);
		 m1.put(4, (float) 14.88);
		 System.out.println(avgOfEvenKeyValues(m1));
		}

}

























/*public static void main(String[] args) {

Map<Integer,Float> m1 = new HashMap<Integer,Float>();
m1.put(1, (float) 2.3);
m1.put(2, (float) 5.6);
m1.put(3, (float) 7.7777777777);
m1.put(4, (float) 8.4);

Float f=0f;
for(Entry<Integer,Float> m:m1.entrySet()){
	 System.out.println(" "+m.getValue());
	 f=m.getValue()+f;
}

System.out.println("Addition of all the float Values: "+f);
Float f1=(float) Math.round(f*100)/100f;
System.out.println(f1);

}
}*/