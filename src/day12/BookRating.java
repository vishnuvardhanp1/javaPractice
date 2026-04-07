package day12;

public class BookRating extends Rating{
	
	boolean doYouLike;
	
	BookRating() {
		System.out.println("Book Constructor called");
	}
	
	void print() {
		System.out.println("The user id is " + this.userId);
	}
	
	void defaultRating() {
		System.out.println("Book rating called");
		rate=4.0F;
	}

}
