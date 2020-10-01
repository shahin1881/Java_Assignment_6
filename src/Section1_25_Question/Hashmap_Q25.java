package Section1_25_Question;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap_Q25 {
	public static void main(String[] args) {
		/*
		 Question:  HashMap<String,String>
		            input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”}; String[]
		            input2={“speaker”,”mouse”}; 
		           C Float output=600.8(500.6+100.2);
		  
		 */
/*
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("mouse", "100.2");
		hm.put("speakar", "500.6");
		hm.put("monitor", "2000.23");

		String[] n = new String[2];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {

			n[i] = sc.next();
		}
		
		float ans=0;
		for(int i=0;i<n.length;i++) {//0,1
			String str1 = n[i];//speakar,mouse
			
			for(Map.Entry<String,String> hk:hm.entrySet()){
				String str2 =hk.getKey();//mouse,monitor,speaker/mouse,mouse,speakar
				
				if(str1.equalsIgnoreCase(str2)) 
				{
					float f=Float.valueOf(hk.getValue());//500.6,100.2
					ans= ans+f;//500.6+100.2 = 600.8
				}
				
			}
		
		

		}System.out.println(ans);
		
		

	}
}
*/               
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("mouse", "100.2");
		hm.put("speaker", "500.6");
		hm.put("Monitor", "2000.23");

		String[] n = new String[2];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {

			n[i] = sc.next();
		}
		float ans=0;
		for(int i=0;i<n.length;i++) {
			String str1 = n[i];
			
			for(Map.Entry<String,String> hk:hm.entrySet()){
				String str2 =hk.getKey();
				if(str1.equalsIgnoreCase(str2)) {
					float f=Float.valueOf(hk.getValue());
					ans= ans+f;
				}
				
			}
		
		
		}System.out.println(ans);
		
		

	}
}
