package day11;

public class Student {
	
	String name;
	
	int age;
	float yearsOfExperiance;
	
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the yearsOfExperiance
	 */
	public float getYearsOfExperiance() {
		return yearsOfExperiance;
	}
	/**
	 * @param yearsOfExperiance the yearsOfExperiance to set
	 */
	public void setYearsOfExperiance(float yearsOfExperiance) {
		this.yearsOfExperiance = yearsOfExperiance;
	}

	
	void checkYearsOfExperiance() {
		if(yearsOfExperiance >= 5) 
			System.out.println("EXPERIANCED");
	    else
		System.out.println("LESS EXPERIANCED");
		}
	Student() {
		System.out.println("Constructor called");
	}
	
	Student(String name1,int age1,float yearsOfExperiance1) {
		//Intialize the variables of the class
		name=name1;
		age=age1;
		yearsOfExperiance=yearsOfExperiance1;
	}

}
