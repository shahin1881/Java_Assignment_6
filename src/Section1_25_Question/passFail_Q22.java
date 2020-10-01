package Section1_25_Question;

import java.util.HashMap;
import java.util.Map;

public class passFail_Q22 {
	public static void main(String[] args) {
		/*
		 Question:   HashMap<String,Integer> h1={“abc”:50,”efg”:70}; if the mark is 
		             less than 60 then put the output in the HashMap<String,String>
		             h2={“abc”:”fail”,”efg”:”pass”}
		 */

		Map<String, Integer> h1 = new HashMap<String, Integer>();

		h1.put("abc", 50);//fail
		h1.put("efg", 70);//pass
		h1.put("pqr", 60);
		h1.put("egd", 80);
		h1.put("msk", 90);
		h1.put("etc", 30);

		Map<String, String> h2 = new HashMap<String, String>();

		for (Map.Entry<String, Integer> esi : h1.entrySet()) {

			if (esi.getValue() < 60) {//lessthen 60 then add data h2 variable
				String s = "Fail";
				h2.put(esi.getKey(), s);

			} else {
				String s = "Pass";//greater then 60 then pass add h2 variable data
				h2.put(esi.getKey(), s);
			}
		}

		System.out.println(h2);//all data stored in pass fail student

	}

}
