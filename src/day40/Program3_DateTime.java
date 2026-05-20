/**
 * 
 */
package day40;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 */
public class Program3_DateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
     LocalDateTime today=LocalDateTime.parse("20/05/2026 08:03:02",formatter);
     System.out.println(today);
     System.out.println(today.getDayOfWeek());
     System.out.println(today.getHour());
     LocalDateTime current=LocalDateTime.now();
     System.out.println(current);
	}

}
