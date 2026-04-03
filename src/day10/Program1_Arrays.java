/**
 * 
 */
package day10;

/**
 * 
 */
public class Program1_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {10,20,30,40,50};
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		//using loop
		for(int i=0;i<=age.length-1;i++) {
			System.out.print(age[i] + " ");
		}
		
		int height[]=new int[5];
		height[0] =109;
		height[1] = 112;
		height[2]= 134;
		height[3]= 169;
		for(int i=0;i<=height.length-1;i++) {
			System.out.print(height[i] + " ");
		}
		//find the size of arry considering height is not  = 0
		int arrSize=0;
		for(int i=0;i<=height.length-1;i++) {
			if(height[i] != 0) {
				arrSize++;
			System.out.print("\n" + height[i] + " ");
			}
			
		}
		System.out.println(" \n arrsize " + arrSize + " ");
		
	}

}
