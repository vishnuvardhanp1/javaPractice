/**
 * 
 */
package day19;
class UserData1 {
	int id;
	 static void hello() {
		System.out.println("hello");
	}
}

class UserData2 extends UserData1 {
	String name;
	static  void hello() {
		System.out.println("bye");
	}
}
/**
 * 
 */
public class Program2_StaticPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserData2 userData2=new UserData2();
		userData2.hello();
		//child will only have parent variables and methods
		UserData1 userData3=new UserData2();
		userData3.hello();
		//userData3.name="";
		
	}

}
