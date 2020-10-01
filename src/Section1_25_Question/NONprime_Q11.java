package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NONprime_Q11 {
	/*
	  Question: Retrieve the non-prime numbers within the range of a given
	            input. Add-up the non-prime numbers and return the result.
	 */


	

	public static int additionOfnonPrimeNos(int i, int j) {
		int k = 0;
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		for(int a = i; a <= j; a++) {//20,21,22,23....40
			int c = 0;
			
			for (int b = 2; b < a; b++)//2,3,4,5.........20
				if (a % b == 0)//20%2=2,20%4=4,20%5=5
					c++;//1,2,3 
			
			if  (c == 0)
				l1.add(a);
		}
		for (int e = i; e <= j; e++)//20,21,22,23,24,25,26...40
			l2.add(e);
		l2.removeAll(l1);
		for (int d = 0; d < l2.size(); d++)//0,1,2,3...16
			k += l2.get(d);//20,41,63,87,112,138,165...510
		return k;
	}

	 public static void main(String[] args) {
		int i = 20, j = 40;
		System.out.println("sum of non-prime nos. is:" + additionOfnonPrimeNos(i, j));
	}
}
