/**
 * 
 */
package day18;

/**
 * 
 */
public class Program3_UserDetailsObj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    UserDetails user=new UserDetails();
    user.userId=101;
    user.name="Vishnu";
    UserDetails.Address address=user.new Address();
    address.city="coimbatore";
    address.state="tamilnadu";
    address.country="india";
    System.out.println(user.name + ":"+address.city);
	}

}
