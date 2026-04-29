/**
 * 
 */
package day27;

import java.util.Scanner;

/**
 * 
 */
public class Program2_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      System.out.println("Integer input " + num);
      String str=sc.next();
      System.out.println("String input " + str);
      float marks=sc.nextFloat();
      System.out.println("Float input " + marks);
      sc.nextLine();
      String line=sc.nextLine();
      System.out.println("Line input " + line);
      char alpha=sc.next().charAt(0);
      System.out.println("Char input " + alpha);
      boolean result=sc.nextBoolean();
      System.out.println("Boolean input " + result);
      sc.close();
	}

}
