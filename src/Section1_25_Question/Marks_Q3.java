package Section1_25_Question;

/*Question:arraylist of string type which has name#mark1#mark2#mark3 format. 
           retrieve the name of the student who has scored max marks(total of three)
           input:{"arun#12#12#12","deepak#13#12#12"}
            output:deepak*/

public class Marks_Q3 {
	public static void main(String[] args) {//Tokenizer
		
		String n[]={"arun#12#12#12","deepak#13#12#12"};
		
		String ans = "";		
		int ans1 = 0,add=0;
		for(int i=0;i<n.length;i++)//0,1
		{
			String x = n[i];//"arun#12#12#12" / "deepak#13#12#12"
			String a[] = x.split("#");
			
			for(int j=1;j<a.length;j++)//1,2,3 /1,2,3
			{
				String n1 = a[j];//12,12,12 /13,12,12
				int no = Integer.parseInt(n1);//12,12,12 /13,12,12
				add = add + no;//12+12+12 =36 /13+12+12 =37
				
			}
			
			if(ans1<add)//0<36 /0<37
			{
				ans1 = add;//36 /37
				ans = a[0];//arun /deepak
			}
			add=0;
		}System.out.println(ans);//deepak

	
	
	}
}
