/**
 * 
 */
package day16;


class UserG {
	int id;
	String name;
	
	UserG() {
		this(102);
		
		System.out.println("Constructor 1 called");
	}
	UserG(int id,String name) {
		//this(); //it should be first statement
		System.out.println("Constructor 2 called");
		
		this.id=id;
		this.name=name;
	}
	
	UserG(int id) {
		this.id=id;
		System.out.println("Constructor 3 called");
	}
	void print() {
		//this(); //this cannot be called in normal method
		System.out.println(this.id + ": " + this.name + " ");
	}
}
/**
 * 
 */
public class Program2_This2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      UserG userG=new UserG(1,"rajat");
      userG.print();
      UserG userG1=new UserG();
      userG1.print();
	}

}
