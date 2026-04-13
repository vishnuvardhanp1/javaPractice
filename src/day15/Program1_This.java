/**
 * 
 */
package day15;
class Employee {
	int empId;
	String empName;
	int empAge;
	final String companyName="TCS Pvt Limited";
	
	void print() {
		System.out.println("Emp id  : " + this.empId);
	}
	
	Employee(int empId,String empName,int empAge) {
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
		
	}
	
}
/**
 * 
 */
public class Program1_This {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp=new Employee(101,"Rajat",43);
    emp.print();
    //gives error if we change final variable
   // emp.companyName="Infosys";
    System.out.println(emp.companyName);
	}

}
