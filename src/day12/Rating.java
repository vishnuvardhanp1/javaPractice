/**
 * 
 */
package day12;

/**
 * 
 */
public class Rating {
	int userId;
	float rate;
	
	 Rating() {
		System.out.println("Parent Constructor Rating is called");
	}
	 
	 void defaultRating() {
		 System.out.println("Default Constructor called");
		 rate=3.0F;
	 }

}
