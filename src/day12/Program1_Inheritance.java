/**
 * 
 */
package day12;

/**
 * 
 */
public class Program1_Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BookRating bookRating=new BookRating();
    bookRating.userId=101;
   // bookRating.rate=4.5F;
    bookRating.doYouLike=true;
    bookRating.defaultRating();
    System.out.println(bookRating.rate);
	}

}
