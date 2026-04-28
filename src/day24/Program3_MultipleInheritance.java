/**
 * 
 */
package day24;

interface ITestA {
	int num1=10;
	void hello();
	
	default void bye() {
		System.out.println("BYEA");
	}
}

interface ItestB {
	int num1=20;
	int hello();
default void bye() {
	System.out.println("BYEB");	
	}
	
	
	
}

class Test implements ITestA,ItestB {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
	System.out.println("hello:" + num1 + ":" +  num2);	
	}
	
	public int hello() {
		
	}
	
}

/**
 * 
 */
public class Program3_MultipleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

@Override
public void hello() {
	// TODO Auto-generated method stub
	
}
