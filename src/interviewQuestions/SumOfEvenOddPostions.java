/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class SumOfEvenOddPostions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=1234567;
     int position=1;
     
     int evenSum=0; 
     int oddSum=0;
     while(num!=0) {
    	 
    	 int digit=num%10;
    	 if(digit%2 == 0)
    		 evenSum=evenSum+digit;
    	 else
    		 oddSum=oddSum+digit;
    	 
    	 num=num/10;
    	 position++;
     }
     System.out.println("Odd position sum = " + oddSum);
     System.out.println("Even position sum = " + evenSum);
	}

}
