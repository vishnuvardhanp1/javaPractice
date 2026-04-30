/**
 * 
 */
package day28;

import java.util.Vector;

/**
 * 
 */
public class Program1_Vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // Create Vector
        Vector<Integer> v = new Vector<>();

        // add elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(20); // duplicate allowed

        // print vector
        System.out.println("Vector: " + v);

        // access element
        System.out.println("Element at index 1: " + v.get(1));

        // update element
        v.set(1, 25);
        System.out.println("After update: " + v);

        // remove element
        v.remove(2);
        System.out.println("After remove: " + v);

        // size
        System.out.println("Size: " + v.size());

        // check contains
        System.out.println("Contains 20? " + v.contains(20));

        // iterate
        System.out.print("Elements: ");
        for (int num : v) {
            System.out.print(num + " ");
        }

        // clear vector
        v.clear();
        System.out.println("\nAfter clear: " + v);
	}

}
