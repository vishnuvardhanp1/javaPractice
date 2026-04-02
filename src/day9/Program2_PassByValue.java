/**
 * 
 */
package day9;

/**
 * 
 */
public class Program2_PassByValue {

	
	 static void IncByFive(int num) {
		 num=num+5;
		//return num;
		 System.out.println("Num " + num);
		 
	 }
	 
	 static int IncByFiv(int num) {
		 num=num+5;
		//return num;
		 System.out.println("Num " + num);
		 return num;
		 
	 }
	 
	 static void IncBytwo(int[] num) {
		 num[0]=num[0]+2;
		 System.out.println("data " + num[0]);
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int[] data= {10,20};
		IncBytwo(data);
		
		IncByFive(num);
		 System.out.println("Num " + num); //pass by  value it is not retained after method
		int num2=IncByFiv(num);
		IncByFive(data[0]);
		 System.out.println("Num after return  " + num2); //pass by  value it is not retained after method
		 System.out.println("data " + data[0]); //pass by reference so it was retained as address is sent
	}

}
