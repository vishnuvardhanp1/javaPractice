/**
 * 
 */
package day36;


enum Grade {
A,
B,
C,
D
}

class Student {
	int rollNo;
	String name;
	Grade grade;
	
	Student(int rollno,String name,Grade grade) {
		this.rollNo=rollno;
		this.name=name;
		this.grade=grade;
	}
}
/**
 * 
 */
public class Program1_Enum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student student=new Student(1, "Rahul", Grade.A);
    System.out.println(student.rollNo+" "+student.name+" "+student.grade);
	}

}
