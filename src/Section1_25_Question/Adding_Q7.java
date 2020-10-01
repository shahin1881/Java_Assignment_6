package Section1_25_Question;



public class Adding_Q7 {
   /*Question:  A integer input is accepted. find the square of individual digits and find their sum.
                input:125
                output:1*1+2*2+5*5  */
	
	public static void main(String[] args) {
		

				
				int num=125;
				int sum=0;
				int temp;
				while(num>0) {
					
								   //Actual number 125.....1*1+2*2+5*5
					temp=num%10;//last digit ex--5,2,1
					num=num/10; // remanning digit ex--12,1,0
					
					sum=sum+(temp*temp);//5*5 = 25/ 2*2 =4 / 1*1 =1...30
					
					
					
				}
				System.out.println(sum);//30
	}
		}




   