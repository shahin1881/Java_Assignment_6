package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;

public class frute_Q21 {

	public static void main(String[] args) {
/*		Question: input1-List1-{apple,orange,grapes}
	              input2-List2-{melon,apple,mango}
	              output={mango,orange}
	              operation-- In 1st list remove strings starting with 'a' or 'g'
	                          In 2nd list remove strings ending with 'n' or 'e'
	              Ignore case, return in string array
*/
		
		String[] input1 = { "apple", "orange", "grapes" };

		String input2[] = { "melon", "apple", "mango" };

		String s = "";

		String s1 = "";

		List<String> l = new ArrayList<String>();// It is an ordered collection of objects in which duplicate values can be stored.

		for (int i = 0; i < input1.length; i++) {//0,1,2
			char c = input1[i].charAt(0);//a,o,g

			if (c != 'a' && c != 'g' && c != 'A' && c != 'G') {
				s = input1[i];//orange
				l.add(s);
			}

		}

		for (int i = 0; i < input2.length; i++) {//0,1,2
			char c = input2[i].charAt(input2[i].length() - 1);

			if (c != 'n' && c != 'e' && c != 'N' && c != 'E') {

				s1 = input2[i];//mango
				l.add(s1);//orange/mengo
			}

		}

		String output[] = new String[l.size()];//2..orange,mengo

		for (int i = 0; i < output.length; i++) {//0,1
			output[i] = l.get(i);

			System.out.println(output[i]);//orange..mengo
		}
		
		
	}
}
