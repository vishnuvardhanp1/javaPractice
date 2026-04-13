/**
 * 
 */
package day16;

final class ExamA {
	int examCode=101;
}

class ExamB extends ExamA {
	
}

class TestP {
	final void hello() {
	System.out.println("Hello");	
	}
}

class TestQ extends TestP {
	void hello() {
		System.out.println("Bye");		
	}
}

/**
 * 
 */
public class Program1_Final {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExamA examA=new ExamA();
      examA.examCode=102;
      System.out.println("Exam code : "+ examA.examCode);
      TestQ testQ=new TestQ();
      testQ.hello();
      
	}

}
