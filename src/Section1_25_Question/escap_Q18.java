package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escap_Q18 {
	public static void main(String[] args) {
		
	/*	
		Question:  input1=1 ,input2=2 ,input3=3 --- output=6;
		           input1=1 ,input2=13,input3=3 --- output=1;
		           input1=13,input2=2 ,input3=8 --- output=8;
		           if value equal to 13,escape the value '13', as well as the next value to 13.
		           sum the remaining values

		*/
		
		Scanner s = new Scanner(System.in);

		int[] a = new int[3];

		int sum = 0;
		System.out.println("Enter the values ");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();

		}

		for (int i = 0; i < a.length; i++) {//0,1
			if (a[i] == 13) {
				i = i + 2;

				if (i == 2 && (a.length == 3)) {
					sum = sum + a[i];
				}

				if (i >= a.length) {

					break;
				}

			}

			else {

				sum = sum + a[i];//0+1 = 1+2 = 3+3=6
			}

		}

		System.out.println(sum);//6

	}


}           
		
		
		
	

		/*	public static int thirteenLapse(int ip1, int ip2, int ip3) {

			 List<Integer> l=new ArrayList<Integer>();

			 l.add(ip1);

			 l.add(ip2);

			 l.add(ip3);

			 int s=0;

			 for(int i=0;i<l.size();i++){

			 if(l.get(i)!=13)

			 s+=l.get(i);

			 if(l.get(i)==13)

			 i=i+1;}

			 return s;

			}
			
		    	public static void main(String[] args) {
 
				 int ip1=13,ip2=2,ip3=8;

				 System.out.println(thirteenLapse(ip1,ip2,ip3));

				}


			}*/