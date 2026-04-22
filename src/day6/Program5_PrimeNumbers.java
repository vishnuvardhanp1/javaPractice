/**
 * 
 */
package day6;

/**
 * 
 */
public class Program5_PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
			if(num == 1)
				System.out.println("Neither prime nor composite");
			else if(num == 2)
				System.out.println("Number is prime");
			else if(num%2 == 0)
				System.out.println("Number is not prime");
			else {
				boolean flag=true;
				for(int fact=3;fact<Math.sqrt(num);fact=fact+2) {
					if(num%fact == 0) {
						flag=false;
						System.out.println("Number is not prime");
						break;
					}
				}
				if(flag)
				System.out.println("Number is prime");
			}
	} 

}
