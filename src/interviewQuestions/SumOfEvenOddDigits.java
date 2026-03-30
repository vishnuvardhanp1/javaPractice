/**
 * 
 */
package interviewQuestions;

/**
 * Logic
Take a number n
Extract digits using:
digit = n % 10
n = n / 10
Check each digit:
if digit % 2 == 0 → add to evenSum
else → add to oddSum
 */
public class SumOfEvenOddDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234689;
		int evenSum=0;
		int oddSum=0;
		
		while(n!=0) {
			int digit=n%10;
			System.out.println(digit);
			if(digit%2 == 0) {
				evenSum=evenSum+digit;
			System.out.println("evensum " +evenSum);
			} else {
				oddSum=oddSum+digit;
				System.out.println("oddSum  " +oddSum);
			}
			
			n=n/10;
		}
		
		System.out.println("even sum is " + evenSum);
		System.out.println("odd sum is " + oddSum);
	}

}
