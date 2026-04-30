/**
 * 
 */
package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [5,1,8,9,3]
 * >0 swap
 * <0 noswap
 * 
 */

class Student implements Comparable<Student>{
	int rollNo;
	String name;
	
	Student(int rollNo,String name) {
		super();
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public int compareTo(Student ob) {
		return ob.rollNo-this.rollNo;
		
	}
}
public class Program3_SortingArrayList {

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
    Collections.sort(studentList);
    for(Student obj:studentList) {
    	System.out.println(obj.rollNo+":"+obj.name);
    }
	}

}
