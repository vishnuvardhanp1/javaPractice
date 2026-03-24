/**
 * 
 */
package day2;

/**
 * 
 */
public class Program5_Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		if(num1%2 == 0 && num1%10 != 0) {
			 System.out.println(num1 + " is multiple of 2 ");
		}
		else if(num1%10 == 0 ) {
			System.out.println(num1 + " is multiple of 10");
		}
		 else  {
			System.out.println(num1 + " is not multiple of 10");
		}
	}

}
