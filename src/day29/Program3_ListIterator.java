/**
 * 
 */
package day29;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

/**
 * 
 */
public class Program3_ListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+ " ");
		}
		System.out.print(listIterator.previous()+ " ");
		System.out.print(listIterator.previous()+ " ");
	}

}
