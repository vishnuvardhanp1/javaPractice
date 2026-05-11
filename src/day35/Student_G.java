package day35;

import java.io.Serializable;

public class Student_G implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rollNo;
	String name;
	transient char grade;
	public Student_G(int rollNo, String name,char grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade=grade;
	}
	
}
