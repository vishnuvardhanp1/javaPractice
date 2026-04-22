/**
 * 
 */
package day22;

/**
 * 
 */
public class Program1_Wrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=10;
     
     Integer num1=10;
     System.out.println(num1.intValue());
     String str="123";
     num1=Integer.parseInt(str);
     System.out.println(num1);
     
     boolean result1=Character.isDigit('A');
     System.out.println(result1);
     boolean result2=Character.isDigit('5');
     System.out.println(result2);
     
     //int --------------------------Integer
     //autoboxing
     Integer num2=num;
     System.out.println(num2.compare(10, 20));
     System.out.println(num2);
     
     //unboxing
     //Integer to int
     num=num2;
     System.out.println(num);
	}

}
