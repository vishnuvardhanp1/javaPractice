/**
 * 
 */
package day15;
class  StudentH {
	int bloodGroup;
}

class Student extends StudentH {
	int enRollno;
	String name;
	int age;
	
	Student() {
		System.out.println("PArent constructor called");
	}
	
	Student(int enRollno) {
		this.enRollno=enRollno;
		System.out.println("Parameterized PArent constructor called");
	}
}

class EngineeringStudent extends Student {
	String course = "BTech";
	void printData() {
		//this will give all the variables of current class
		System.out.println(this.enRollno + ":" + this.name + ":" + this.course);
		//super keyword is to take variables from inheriting class
		if(super.age > 25)
			System.out.println(":Late Admission");
	}
	EngineeringStudent() {
		super(103);
		System.out.println("child constructor called");
	}
}

/**
 * 
 */
public class Program2_Super {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngineeringStudent engineeringStudent= new EngineeringStudent();
		engineeringStudent.enRollno=183;
		engineeringStudent.name="Vaibhav";
		engineeringStudent.age=26;
		engineeringStudent.printData();
	}

}
