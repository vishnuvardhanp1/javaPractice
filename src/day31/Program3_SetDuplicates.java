/**
 * 
 */
package day31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	int rollno;
	String name;
	
	Student(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
		//return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
		//return rollno == other.rollno;
	}
	
}
/**
 * 
 */
public class Program3_SetDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student obj1=new Student(1,"Rahul");
    Student obj2=new Student(1,"Rahul");
    Student obj3=new Student(2,"Rohan");
    Set<Student> set=new LinkedHashSet<Student>();
    set.add(obj1);
    set.add(obj2);
    set.add(obj3);
    for(Student s:set) {
    	System.out.println(s.rollno + " " + s.name);
    }
	}

}
