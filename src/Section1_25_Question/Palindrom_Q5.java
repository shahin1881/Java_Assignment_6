package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Question: Retrieve the palindorme-true number set from given number limit and return the sum
            input1:90 
            input2:120
            logic:99+101+111
            output:311*/

public class Palindrom_Q5 {
	public static void main(String[] args) {
		
		int ans = 0 ;
		for(int no=90;no<=120;no++)//90,91
		{
			int n1 = no;//90,91
			int n3 = 0;
			while(n1!=0)
			{
				int x = n1 % 10;//90%10 =0 /9 /1
				n3 = (n3 * 10) + x;//0,9
				n1 = n1/10;//90/10 =9 /9/10 =0
			}
			
			if(no==n3)//90==9
			{
				ans = ans + no;
			}
		}System.out.println(ans);
	}

}         














      /*   public static int sumOfPalindromeNos(int n1,int n2){
		  List<Integer> l1=new ArrayList<Integer>();
		  for(int i=n1;i<=n2;i++)//90
		  {
		   int r=0, 
			   n3=i;//90,9,0
		   while(n3!=0)
		   {
		    r=(r*10)+(n3%10);//0*10 + 90%10 = 0,9
		    n3=n3/10; //90,9
		    }
		   if(r==i)
		    l1.add(i); 
		   }
		   System.out.println(l1);
		   int s=0;
		   for(int i=0;i<l1.size();i++)
		   s+=l1.get(i);
		   return s;
		 }
	 
	 
		  public static void main(String[] args)
		{
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the range:");
		  
		  int n1=s.nextInt();//90
		  int n2=s.nextInt();//120
		  System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindromeNos(n1,n2));
		 }
		}*/