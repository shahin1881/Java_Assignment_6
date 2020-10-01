package Section1_25_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Q10_Ten {
   /*Input: input1={1,2,3}
            input2={3,4,5}
            input3;+(union)
            output:inp1+inp2//12345
            
            input1:{1,2,3,4,5}
            input 2:{2,3,4,5}
            input3=*(intersection)
            output:inp1*inp2//2345
            
            INPUT1:{1,2,3,4,5}
            INPUT2:{3,6,7,8,9}
            INPUT3:-(MINUS)
            output:inp1-inp2*/ //-2 -4 -4 -4 -4 
	
	
		
	public static void main(String[] args) {
			
			/*int no[]={1,2,3};			
	        int no1[]={3,4,5};
			int ans[] = new int[no.length+no1.length];	
		    int index=0;
			LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
			for(int i=0;i<no.length;i++)
			{
				int n= no[i];
				hs.add(n);
			}
			for(int i=0;i<no1.length;i++)
			{
				int j=no1[i];
				hs.add(j);
			}
			for(int x:hs)
			{
				ans[index] = x;
				index++;
			}
			for(int i=0;i<index;i++)
			{
				System.out.print(ans[i]+" ");
			}
		}
}*/
	//------------------------------------------------------------------------		
		/*	input1:{1,2,3,4,5}
		      input 2:{2,3,4,5}
		      input3=*(intersection)*/
			
			/*int no[]={1,2,3,4,5};		
			int no1[]={2,3,4,5};
			int c[] = new int[no.length+no1.length];		
			int index=0;
			int count=0;
			for(int i=0;i<no.length;i++)
			{
				for(int j=0;j<no1.length;j++)
				{
					if(no[i]==no1[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					c[index]=no[i];
					index++;
					count=0;
				}
				else
				{
					count=0;
				}
			}
			for(int x=0;x<index;x++)
			{
				System.out.print(c[x]+" ");
			}
		}
}*/
	//------------------------------------------------------------------------	
		
		/*INPUT1:{1,2,3,4,5}
		INPUT2:{3,6,7,8,9}
		INPUT3:-(MINUS)
		output:inp1-inp2*/ //-2 -4 -4 -4 -4*/
			
			int no[]={1,2,3,4,5};			
			int no1[]={3,6,7,8,9};
			int ans[]=new int[no.length+no1.length];		
			int index=0;
			
			for(int i=0;i<no.length;i++)
			{
				int c = no[i]-no1[i];
				ans[index] = c ; 
				index++;
			}
			for(int i=0;i<index;i++)
			{
				System.out.print(ans[i]+" ");
			}
		}
	}	
		






	/* public static void main(String[] args) {
            int[] a = {1,2,3,4,5};
            int[] b = {0,2,4,6,8};
            Scanner s = new Scanner(System.in);
            int c = s.nextInt();
            int d[] = arrayFunctions(a,b,c);
            for(int e:d)
                  System.out.println(e);
      }
      public static int[] arrayFunctions(int[] a, int[] b, int c) {
            List l1 = new ArrayList();
            List l2 = new ArrayList();
            List l3 = new ArrayList();
            for(int i = 0;i < a.length;i++)
                  l1.add(a[i]);
            for(int i = 0;i < b.length;i++)
                  l2.add(b[i]);
            switch(c){
                  case 1:
                        l1.removeAll(l2);
                        l1.addAll(l2);
                        Collections.sort(l1);
                        l3 = l1;
                        break;
                  case 2:
                        l1.retainAll(l2);
                        Collections.sort(l1);
                        l3 = l1;
                        break;
                  case 3:
                        if(l1.size() == l2.size())
                              for(int i = 0;i < l1.size();i++)
                                    l3.add(Math.abs(l2.get(i)-l1.get(i)));
                        break;
            }
            int[] d = new int[l3.size()];
            for(int i = 0;i < d.length;i++)
                  d[i] = l3.get(i);
            return d;
      }
}*/
