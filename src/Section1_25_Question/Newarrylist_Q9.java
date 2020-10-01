package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;

public class Newarrylist_Q9 {
	/*Question: An array of integers is given.The given element is removed new array is returned.
                input1:{10,10,20,30,76}
                output: {20,30,76}(10 is asked to remove)*/
	
public static void main(String[] args) {
		
		int n[]={10,10,20,30,76};
		int no= 10;
		
		int n1[] = new int[n.length];
		int j = 0 ;
		
		for(int i=0;i<n.length;i++)//0,1,2,3,4
		{
			if(no!=n[i])
			{
				n1[j]=n[i];//2,3,4
				j++;//1,2,3
			}
		}
		
		for(int i=0;i<j;i++)//0,1,2
		{
			System.out.print(n1[i]+" ");//20,30,76
		}
	}



}
       
	
	
	    /* public static int[] removalOfGivenElementFromArray(int[] a,int c){
		  List<Integer> l1=new ArrayList<Integer>();
		  for(int i=0;i<a.length;i++)//0,1,2,3,4
		   if(a[i]!=c)
		   l1.add(a[i]);
		  int b[]=new int[l1.size()];
		  for(int i=0;i<b.length;i++)//0,1,2
		   b[i]=l1.get(i);
		  return b;//20,30,76
		 } 
	     
		 public static void main(String[] args) {
		 int a[]={10,10,20,30,76};
		 int c=10;
		 int[] b=removalOfGivenElementFromArray(a,c);
		 for(int d:b)
		 System.out.println(d);
		 }
		}*/