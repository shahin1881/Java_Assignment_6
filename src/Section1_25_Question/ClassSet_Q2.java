package Section1_25_Question;
import java.util.*;
/*  Question:  Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.
               Input:9
               Output:1+3-5+7-9=-3*/


public class ClassSet_Q2 {
	
public static void main(String[] args) {
		
		int no = 9;
		int n[]=new int[no]; 		
		int j=0;
		for(int i=1;i<=no;i++)//1,2,3,4,5,6,7,8
		{
			if(i%2!=0)//odd condition 
			{
				n[j]=i;
				j++;//1,2,3,4,5.............1,3,5,7,9
			}
		}
		
		int a=n[0];//1
		for(int i=1;i<n.length;i++)//1,2,3,4,5,6,7,8
		{
			if(i%2!=0)
			{
				a=a+n[i];//1,3,5,7
			}
			else
			{
				a=a-n[i];//-1-4 = -3-6 = -3 -8-5=-3
			}
		}System.out.println(a);
		

		
	}

}
