/**
 * 
 */
package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;





/**
 * 
 */
class Student  {
	int rollNo;
	String name;
	
	Student(int rollNo,String name) {
		super();
		this.rollNo=rollNo;
		this.name=name;
	}

	
	
	
	/*public int compareTo(Student ob) {
		//return this.name.compareTo(ob.name);
		return ob.name.compareTo(this.name);
	}*/
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo=o2.rollNo;
	}
	
}
public class Program1_Comparator{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Student> studentList=new ArrayList<>();
    studentList.add(new Student(105,"Zaheer"));
    studentList.add(new Student(107,"Praveen"));
    studentList.add(new Student(101,"Bala"));
    studentList.add(new Student(104,"Arun"));
    Collections.sort(studentList,new StudentComparator());
    for(Student obj:studentList) {
    	System.out.println(obj.rollNo+":"+obj.name);
    }
	}

}
