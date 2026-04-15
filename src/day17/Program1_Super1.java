/**
 * 
 */
package day17;
class Exam1 {
	int examCode;
	String examName;
	
	Exam1(int examCode,String examName) {
		this.examCode=examCode;
		this.examName=examName;
		System.out.println("Parent Constructor called");
	}
}

class BTechExam extends Exam1 {
	String branchName;
	void print() {
		System.out.println(super.examCode + " :" + super.examName + " : " + this.branchName);
	}

	BTechExam(int examCode, String examName,String branchName) {
		super(examCode, examName);
		// TODO Auto-generated constructor stub
		this.branchName=branchName;
		System.out.println("Child Constructor called");
	}
	
}
/**
 * 
 */
public class Program1_Super1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTechExam btechExam=new BTechExam(101, "kumar", "Computer Science");
		btechExam.print();
	}

}
