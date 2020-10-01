package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;

public class Collect_Q19 {

	
/*	Question:  Collect no’s frm list1 which is not present in list2 
	           & Collect no’s frm list2 which is not present in list1
	           and store it in output1[].
	           ex: input1={1,2,3,4}; 
	               input2={1,2,3,5};
	               output1={4,5};
*/
	
	public static void main(String[] args) {
	
	List<Integer> l1 = new ArrayList<>();//input 1 add

	l1.add(1);

	l1.add(2);

	l1.add(3);

	l1.add(4);

	List<Integer> l2 = new ArrayList<>();//input 2 add

	l2.add(1);

	l2.add(2);

	l2.add(3);

	l2.add(5);

	List<Integer> l3 = new ArrayList<>();
	
	List<Integer> l4 = new ArrayList<>();
	
	l3.addAll(l1);
	l4.addAll(l2);
	l1.removeAll(l2);
	l4.removeAll(l3);

	l1.addAll(l4);

	int[] output = new int[l1.size()];

	for (int i = 0; i < output.length; i++) {//0,1
		output[i] = l1.get(i);//4,5
	}

	for (int c : output) {//4,5
		System.out.println(c);//4,5
	}
	
	
}
}
