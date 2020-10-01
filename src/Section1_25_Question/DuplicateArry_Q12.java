package Section1_25_Question;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateArry_Q12 {
public static void main(String[] args) {
	
/*	 Question: Given integer array
		input :int[] arr={2,3,5,4,1,6,7,7,9};

	Remove the duplicate elements and print sum of even numbers in the array..
	print -1 if arr contains only odd numbers*/
	
	
	
	/*int[] no = new int[9];
	System.out.println("enter here");
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < no.length; i++) {

		no[i] = sc.nextInt();

	}*/
	
       int no[]={2,3,5,4,1,6,7,7,9};//input Array
	
			LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();//dublicate not allwed
			
			for(int i=0;i<no.length;i++)//0,1,2,3,4,5,6,7,8
			{
				int x = no[i];//2,3,5,4,1,7,7,9
				hs.add(x);
			}
			
			int ans= 0,
			index = 0 ;
			Iterator<Integer> it = hs.iterator();//geting data from LinkedhashSet
			int j[] = new int[no.length];//new array creating
			while(it.hasNext())
			{
				j[index] = it.next();
				index++;
			}
			for(int i=0;i<index;i++)
			{
				if(j[i]%2==0)
				{
					ans = ans + j[i];
				}
			}
			
			if(ans==0)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(ans);
			}
}
	
	
}
