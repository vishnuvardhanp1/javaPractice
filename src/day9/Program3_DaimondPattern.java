/**
 * 
 */
package day9;

/**
 * 
 */
public class Program3_DaimondPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int sp=1;sp<=5-i;sp++) {
			System.out.print(" ");	
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int r=1;r<=4;r++)

		{

			for(int sp=1;sp<=r;sp++)

				System.out.print(" ");

			 for(int star=1;star<=9-2*r;star++)

				 System.out.print("*");

			 System.out.println();

		}

	}

}
