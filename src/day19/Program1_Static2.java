/**
 * 
 */
package day19;


class Test {
	static int num1;
	int num2;
	void hello() {
		System.out.println("hello"+num1+num2);
		bye();
	}
	static void bye() {
		System.out.println("bye" + num1+num2);
		
	}
	static {
		System.out.println("static block called");
	}
}
/**
 * 
 */
public class Program1_Static2 {

	/**
	 * @param args
	 */
	int num3=20;
	static int num4=10;
	static {
		System.out.println("main block called");
	}
	static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	// public yes
	// static yes
	// Interchange yes static public
	// void yes
	// main yes
	// String args command line args 
	// args values
	static public void main(String[] values) {
		// TODO Auto-generated method stub
		add(10,20);
		//Test test=new Test();
		Test.num1=20;
		Program1_Static2 program_static2=new Program1_Static2();
		program_static2.num3=40;
		
	}

}
