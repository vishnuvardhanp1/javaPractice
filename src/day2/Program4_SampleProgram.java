/**
 * 
 */
package day2;

/**
 * 
 */
public class Program4_SampleProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if num =0 print 0
		//if num is postive print positive
		//ifnum is negative print negative]
		
		int num=6;
		if(num == 0) {
			 System.out.println(num + " is zero ");
		}
		else if(num > 0) {
			System.out.println(num + " is positive");
		} else if(num < 0) {
			System.out.println(num + " is negative");
		}
		
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
