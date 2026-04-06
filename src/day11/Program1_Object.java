package day11;

public class Program1_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student();
    s1.name="Vishnu";
    s1.age=44;
    s1.yearsOfExperiance=20;
    System.out.println(" Name of student : " + s1.name);
    System.out.println(" Age of student : " + s1.age);
    System.out.println(" YearsOfExperiance of student : " + s1.yearsOfExperiance);
    System.out.println( s1.name + ":" + s1.age +  ":" + s1.yearsOfExperiance);
    s1.checkYearsOfExperiance();
    Student s2=new Student("Hari",14,0);
    s2.checkYearsOfExperiance();
    System.out.println(" Name of student : " + s2.name);
    System.out.println(" Age of student : " + s2.age);
    System.out.println(" YearsOfExperiance of student : " + s2.yearsOfExperiance);
    System.out.println( s2.name + ":" + s2.age +  ":" + s2.yearsOfExperiance);
    Student s3=new Student();
    s3.setName("Rohit sharma");
    s3.setAge(36);;
    s3.setYearsOfExperiance(20);;
    s3.checkYearsOfExperiance();
    System.out.println(" Name of student : " + s3.getName());
    System.out.println(" Age of student : " + s3.getAge());
    System.out.println(" YearsOfExperiance of student : " + s3.getYearsOfExperiance());
    System.out.println( s3.getName() + ":" + s3.getAge() +  ":" + s3.getYearsOfExperiance());
	}

}
