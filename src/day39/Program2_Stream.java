/**
 * 
 */
package day39;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Student {
	int rollNo;
	String name;
	String dept;
	int marks;
	public Student(int rollNo, String name, String dept, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, marks, name, rollNo);
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
		return Objects.equals(dept, other.dept) && marks == other.marks && Objects.equals(name, other.name)
				&& rollNo == other.rollNo;
	}
	
	
}
/**
 * 
 */
public class Program2_Stream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student obj=new Student(1,"Zainab","ECE",60);
    Student obj1=new Student(2,"Yatin","ECE",80);
    Student obj2=new Student(3,"Astha","CSE",90);
    Student obj3=new Student(4,"Bhawna","CSE",70);
    
    List<Student> studentList=new ArrayList<Student>();
    studentList.add(obj);
    studentList.add(obj1);
    studentList.add(obj2);
    studentList.add(obj3);
    
    //Filter name starts with Y or A
    List<Student> filterList=
    		studentList
    		.stream()
    		.filter(n->(n.getName().startsWith("Y") || n.getName().startsWith("A")))
    		//.toList(); immutable cannot add futher objects into collection //gives unsupportedoperation exception
    		.collect(Collectors.toList()); // mutable able to add new objects
    filterList.add(new Student(5,"Palak","MECH",50));
    for(Student data:filterList)
    	System.out.println(data.name+ " " +data.rollNo);
	
	
	System.out.println("\n For Each practice ");
	studentList
	.stream()
	.forEach(s->System.out.println(s.rollNo+ " " + s.name));
	
	
	System.out.println("\n Sort on marks ");
	
	studentList
	.stream()
	.sorted(Comparator.comparingInt(Student::getMarks))
	.forEach(s->System.out.println(s.name + " " + s.marks ));
	
	System.out.println("\n Sort on Name Desc");
	
	studentList
	.stream()
	.sorted(Comparator.comparing(Student::getName).reversed())
	.forEach(s->System.out.println(s.name + " " + s.marks ));
	}

}
