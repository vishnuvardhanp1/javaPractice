/**
 * 
 */
package day29;

import java.util.LinkedList;

/**
 * 
 */
public class Program2_LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.add(1,8);
        linkedList.addLast(40);
        System.out.println(linkedList);
	}

}
