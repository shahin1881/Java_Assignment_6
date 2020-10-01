package Section1_25_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayReverced_Q13 {

	/*
	 Question: input array={red,green,blue,ivory} sort the given array reverse
	            the given array if user input is 1 it should give 0th element of an
	            reversed array.
	  
	 */

	  
	public static void main(String[] args) {
		String[] array = {"red", "green", "blue", "ivory"};// reverene red,ivory,green,,blue ....... blue,green,red,ivory
		  
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a iteger: ");
		//	for (int i = 0; i < s.length; i++) {

				int n=sc.nextInt();


		

		String s1 = new String();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < array.length; i++)// 0,1,2,3
			list.add(array[i]);
		 System.out.println(list);//[red, green, blue, ivory]
		 
		Collections.sort(list,Collections.reverseOrder());
		 System.out.println(list);//[red, ivory, green, blue]
		//Collections.sort(list);
		
		
		for (int i = 0; i < list.size(); i++)// 0,1,2,3
			if (i == (n - 1))
				
				s1 = list.get(i);
	
	System.out.println(s1);//red

}
}           
	










	
 /*   String[] s = new String[4];
	System.out.println("enter here");
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < s.length; i++) {

		s[i] = sc.nextLine();

	}

	 String s[] = { "red", "green", "blue", "ivory" };

	String s1[] = new String[s.length];//creating new array
	int index = 0;

	for (int i = s.length - 1; i >= 0; i--) {
		String temp = s[i];//Storing value in String temp
		s1[index] = temp;//value array stoar s1
		index++;//index incriment
	}
	
	
		System.out.println("enter use value= ");
		//int no=sc.nextInt();
	int no = 1;// user type here value
	System.out.println(s1[no - 1]);//final out

}

}
*/