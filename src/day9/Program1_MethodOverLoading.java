/**
 * 
 */
package day9;

/**
 * 
 */
public class Program1_MethodOverLoading {

	static int data=-1;
	static void add()
	{
		System.out.println(10+data);
	}
	
	static void add(int num) {
		int newData=-100;
		System.out.println(num+newData);
	}
	
	static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	static void add(int num1,float num2) {
		System.out.println(num1+num2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    add();
    add(data);
    add(14,13);
    add(15,16.4F);
    
	}

}
