package Section1_25_Question;


/*Question: Given two integer arrays. merge the common elements into a new array.
            find the sum of the elements
            input1:{1,2,3,4}
            input2:{3,4,5,6}
            logic:{3,4}
            output:7*/

public class MurgeArry_Q1 {
	public static void main(String[] args) {
		int a []= {1,2,3,4};
		int b[]= {3,4,5,6};
		int c[]=new int[a.length+b.length];
		
		int location=0;
		int sum=0;
		for(int i=0;i<a.length;i++) //0,1,2,3
		{
			for(int j=0;j<b.length;j++) //0,1,2,3 /0,1,2,3 /0,1,2,3 /0,1,2,3
			{
				if(a[i]==b[j]) {//1==3...3==3...4==4
					c[location]=a[i];//0,1
					location++;//1,2
				}
			}
		}
		
		for(int i=0;i<c.length;i++) {//0,1
			int temp=c[i];//3,4
			sum=sum+temp;//3+4
		}
		System.out.println(sum);//7
		
		
	}

}
