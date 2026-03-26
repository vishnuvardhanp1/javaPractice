/**
 * 
 */
package day4;

/**
 * 
 */
public class Program5_Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // reverse a number
		int num=12345;
		int reverse=0;
		//for(int num=12345; num > 0;)
		while(num > 0) {
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
		System.out.println("Reverse of number : " + reverse);
	}

}
