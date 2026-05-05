/**
 * 
 */
package day30;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
class Test9 {
	int id;
	String name;
	
	Test9(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class Program1_PracticeLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int numList[]= {10,20,30,40,50,60};
    for(int num:numList) {
    	System.out.print(num + " ");
    }
    System.out.println("\n" + numList);
    
    List<Integer> numList2=new ArrayList<Integer>();
    numList2.add(20);
    numList2.add(30);
    numList2.add(40);
    System.out.println("\n"+ numList2);
    String dataList[]= {"hello","how","are","you"};
    System.out.println();
    for(String data:dataList) {
    	System.out.print(data + " ");
    }
    System.out.println();
    Test9 obj1=new Test9(1,"Harry Potter");
    Test9 obj2=new Test9(2,"Avatar");
    List<Test9> list=new ArrayList<Test9>();
    list.add(obj1);
    list.add(obj2);
    System.out.println(list);
    
    for(Test9 test:list) {
    	System.out.println(test.id + " " + test.name);
    }
	}

}
