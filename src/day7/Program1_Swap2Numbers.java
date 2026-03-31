/**
 * 
 */
package day7;

/**
 * 
 */
public class Program1_Swap2Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		//using temporary variable
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		num1=10;
		num2=20;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		num1=5;
		num2=3;
		
		//168421
		//10=1010
		//13=1101
		//7=0111
		//num1=5 0101
		//num2=3 0011
		//xor 0110 =6
		//110 =6
		//011 =3
		//101 =5
		//110 =6
		//101 =5
		//011=3
		
		num1=num1^num2; //6
		num2=num1^num2; //5
		num1=num1^num2; //3
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
				
	}

}
