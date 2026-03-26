/**
 * 
 */
package day4;

/**
 * 
 */
public class Program5_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse a number
				int num=1001;
				int originalNumber=num;
				int reverse=0;
				for(; num > 0; num=num/10) {
				//while(num > 0) {
					int lastDigit=num%10;
					reverse=reverse*10+lastDigit;
					//num=num/10;
				}
				System.out.println("Reverse of number : " + reverse);
				if(reverse==originalNumber) {
					System.out.println("The number is palindrome");
				} else {
					System.out.println("The number is not palindrome");
				}

	}

}
