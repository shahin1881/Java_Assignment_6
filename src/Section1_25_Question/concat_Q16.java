package Section1_25_Question;

public class concat_Q16 {

	public static void main(String[] args) {
		
/*		Question: Input1={“ABX”,”ac”,”acd”};
		          Input2=3;
		          Output1=X$d
*/
		
		
		String[] input1 = {"ABX","ac","acd"};

		
		//String[] input1 = { "ABX", "ac", "acd", "io","qcb", };

		int input2 = 3;

		String s1 = new String();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < input1.length; i++) {//0,1,1

			s1 = input1[i];//ABX,ac,acd

			if (s1.length() < (input2)) {
				char c = '@';//$

				sb.append(c);//$
			} else {

				char c = s1.charAt((input2 - 1));//ABX-1,acd-1
				sb.append(c);//X,d
			}

		}

		System.out.println(sb);//X$d

	}
		
		
	}

