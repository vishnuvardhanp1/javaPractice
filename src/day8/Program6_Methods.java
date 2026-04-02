/**
 * 
 */
package day8;

/**
 * 
 */
public class Program6_Methods {

	static boolean checkEven(int num) {
		if(num%2 == 0) return true;
		else
		return false;
		
	}
	
	static void printEven(int num) {
		if(num%2 == 0) System.out.println("Even number is : " + num);
		else
			System.out.println("Odd number is : " + num);
	}
	
	static float add(int num1,float num2) {
		float sum=num1+num2;
		return sum;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result1=checkEven(12);
		boolean result2=checkEven(13);
		System.out.println(result1);
		System.out.println(result2);
		printEven(11);
		printEven(140);
		float total=add(10,0.5F);
		System.out.println(total);

	}

}
