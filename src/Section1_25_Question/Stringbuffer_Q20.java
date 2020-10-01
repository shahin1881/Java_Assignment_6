package Section1_25_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Stringbuffer_Q20 {
	public static void main(String[] args) {
		
/*		Question:  input-- String input1="AAA/abb/CCC"
			       char input2='/'
			       output-- String[] output1;
			       output1[]={"aaa","bba","ccc"};

			        operation-- get the strings from input1  using stringtokenizer
			                    reverse each string
			                    then to lower case
			                    finally store it in output1[] string array

*/
		
		
		
		String input1 = "AAA/abb/CCC";

		StringTokenizer st = new StringTokenizer(input1, "/");

		List<String> l = new ArrayList<String>();

		while (st.hasMoreTokens()) {//0,1,2
		StringBuffer sb = new StringBuffer(st.nextToken().toLowerCase());

			l.add(sb.reverse().toString());

		}
		String[] output = new String[l.size()];

		for (int i = 0; i < output.length; i++) {//0,1,2
			output[i] = l.get(i);
		}

		for (String p : output) //{0,1,2
			System.out.print('"'+p+'"');//"aaa","bba","ccc"
		}
		
		
	}


