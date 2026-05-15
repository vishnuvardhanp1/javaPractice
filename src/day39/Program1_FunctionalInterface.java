package day39;

public class Program1_FunctionalInterface {
	@FunctionalInterface
	interface ITest {
	String hello(String name);
	//String bye();
	
	}
			
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 ITest obj=(n) -> 
	 {
		 return " Hello " + n;
	 };
	 String output=obj.hello("GSIT Admin");
	 System.out.println(output);
	}
}	
