/**
 * 
 */
package day30;
import java.util.*;
/**
 * the day today is a very very very warm day
 * the day today is a very warm
 */
public class Program3_SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<Integer> setA=new HashSet<Integer>();
   setA.add(10);
   setA.add(10);
   setA.add(10);
   setA.add(10);
   setA.add(20);
   setA.add(30);
   System.out.println(setA);
   for(Integer data:setA)
	   System.out.print(data + " ");
   System.out.println();
   Iterator<Integer> it=setA.iterator();
   while(it.hasNext())
	   System.out.print(it.next() + " ");
	}

}
