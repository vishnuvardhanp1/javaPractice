/**
 * 
 */
package interviewQuestions;

/**
 * 
 */
public class CountOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=12345678;
		int primeCount=0;
		
		while(num > 0) {
			num=num/10;
			count++;
		}
		System.out.println("count is " + count); 
		num=12345678;
		while(num !=0) {
			int digit=num%10;
			if(digit ==2 || digit == 3 || digit== 5 || digit == 7) {
				primeCount++;
				
			}
			num=num/10;
			
		}
		System.out.println("prime count" + primeCount);
	}

}
