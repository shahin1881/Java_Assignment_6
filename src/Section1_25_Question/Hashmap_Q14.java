package Section1_25_Question;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Question: Create a program to get the hashmap from the given input string array where the key for the hashmap
            is first three letters of array element in uppercase and the value of hashmap is the element itself
            Input:{“goa”,”kerala”,”gujarat”}                 [string array]
            Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]*/

public class Hashmap_Q14 {

	public static void main(String[] args) {
		String[] n = new String[3];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {

			n[i] = sc.nextLine();

		}

		// String[] n = {"goa","kerala","gujarat"};
		
		HashMap<String, String> hm = new HashMap<String, String>();//hashmap using key and value

		for (int i = 0; i < n.length; i++) {//0,1,2

			String key = "";
			String value = n[i];//goa,kerala,gujarat
			key = key + value.charAt(0) + value.charAt(1) + value.charAt(2);//goa,ker,guj
			//kes + 3value+asits value 0,1,2=====logic
			hm.put(key.toUpperCase(), value);//using hashmap veriable
		}

		for (Map.Entry<String, String> me : hm.entrySet()) {
			System.out.println(me.getKey() + "-->" + me.getValue());
		}

	}

}
