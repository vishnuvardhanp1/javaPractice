/**
 * 
 */
package day12;


class Parent{
	String house;
}
class Child extends Parent {
	String car;
}
class GrandChild  extends Child{
	String bicycle;
}
/**
 * 
 */
public class Program2_MultiLevel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild grandChild=new GrandChild();
		grandChild.house="3BHK";
		grandChild.car="Cresta";
		grandChild.bicycle="Hero";

	}

}
