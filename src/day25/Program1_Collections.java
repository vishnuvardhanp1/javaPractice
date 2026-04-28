/**
 * 
 */
package day25;

import java.util.*;

/**
 * java.util
 * hierarchy
 * interface iterable
 * interface collection extends iterable
 * interface list extends collection
 * class ArrayList implements list
 * 
 *not possible List l=new List();
 *possible
 *List<Integer> l=new ArrayList();
 *ArrayList<String> a=new ArrayList();
 * 
 */
public class Program1_Collections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> arrayList=new ArrayList();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);
    arrayList.add(40);
    arrayList.add(50);
    arrayList.add(60);
    System.out.println(arrayList);
    ArrayList<Integer> arrayList2=new ArrayList();
    arrayList2.add(70);
    arrayList2.add(80);
    arrayList.addAll(arrayList2);
    System.out.println(arrayList);
    System.out.println(" CONTAINS " + arrayList.contains(100));
    System.out.println(" GET " + arrayList.get(0));
    System.out.println(" SIZE " + arrayList.size());
    arrayList.remove(0);
    System.out.println(" REMOVE " + arrayList);
    System.out.println(" INDEX OF 70  " + arrayList.indexOf(70));
    System.out.println(" IS EMPTY " + arrayList.isEmpty());
    arrayList.set(0, 200);
    System.out.println(" UPDATE AT 0TH " + arrayList);
    
	}

}
