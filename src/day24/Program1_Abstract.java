/**
 * 
 */
package day24;

abstract class Rating {
	
	abstract void rating();
	void print() {
		System.out.println("Hello");
	}
}

class ElectronicRating extends Rating {

	
	void rating() {
		// TODO Auto-generated method stub
		System.out.println("3 stars");
	}
	
}

/**
 * abstract class cannot be instantiated
 * o or more abstract methods
 * child class must overriding abstract method
 * 
 */
public class Program1_Abstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Rating rating=new Rating();
		
		ElectronicRating electronicRating=new ElectronicRating();
		electronicRating.print();
		electronicRating.rating();
		
	}

}
