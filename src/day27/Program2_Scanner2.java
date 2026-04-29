/**
 * 
 */
package day27;

import java.util.Scanner;

/**
 * 
 */
public class Program2_Scanner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    Object[] data=new Object[6];
    String output="";
    data[0]=sc.next();
    data[1]=sc.next().charAt(0);
    data[2]=sc.next();
    data[3]=sc.nextFloat();
    data[4]=sc.next().charAt(0);
    data[5]=sc.next();
    
 
    	//output=output+" " + str;
    for(Object str:data) {
    	output=output+" " + str;
    }
    System.out.println(output.trim());
    sc.close();
	}

}
