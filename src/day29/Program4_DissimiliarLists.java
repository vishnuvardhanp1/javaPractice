/**
 * 
 */
package day29;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Program4_DissimiliarLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List list2=new ArrayList();
    list2.add("hello");
    list2.add(10);
    list2.add(20.02);
    System.out.println();
    for(Object data : list2) {
    	System.out.print(data + " ");
    }
	}

}
