/**
 * 
 */
package day25;

/**
 * 
 */
import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    int getEmpId() {
    	return this.id;
    }
    
    String getName() {
		return name;
    	
    }
}

public class Program2_EmployeeList {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "rajat"));
        list.add(new Employee(102, "rahul"));
        list.add(new Employee(103, "naveen"));

        // Print
        for (Employee e : list) {
            System.out.println(e.id + ":" + e.name);
        }
    }
}
