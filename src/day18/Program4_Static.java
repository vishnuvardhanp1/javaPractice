/**
 * 
 */
package day18;
class UserEmployee {
	int empId;
	String empName;
	static String	companyName;
}
/**
 * 
 */
public class Program4_Static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserEmployee.companyName="Wipro";
		UserEmployee user1=new UserEmployee();
		user1.empId=101;
		user1.empName="Vishnu";
		//user1.companyName="Wipro";
		System.out.println(user1.empId + ": " + user1.empName + ":" + UserEmployee.companyName);
		UserEmployee user2=new UserEmployee();
		user2.empId=102;
		user2.empName="Ram";
		//user2.companyName="Wipro";
		System.out.println(user2.empId + ": " + user2.empName + ":" + user2.companyName);
		UserEmployee user3=new UserEmployee();
		user3.empId=103;
		user3.empName="Vinod";
		UserEmployee.companyName="Wipro pvt limited";
		System.out.println(user3.empId + ": " + user3.empName + ":" + user3.companyName);
		//user3.companyName="Wipro";
		
	}

}
