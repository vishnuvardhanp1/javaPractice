/**
 * 
 */
package day4;

/**
 * 
 */
public class Program4_CountOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//counting no of digits in number
		int count=0;
		int num=123456;
		
		while(num >0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
