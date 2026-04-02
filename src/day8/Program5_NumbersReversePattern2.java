/**
 * 
 */
package day8;

/**
 * 
 */
public class Program5_NumbersReversePattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int row=1;row<=5;row++) {
	   for(int sp=1;sp<row;sp++) { 
		   System.out.print(" "); 
	   
   
	}
	   for(int col=1;col<=6-row;col++) {
		   System.out.print(col); 
	   }
	   System.out.println();
   }
	}

}
