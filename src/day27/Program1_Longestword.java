/**
 * 
 */
package day27;

/**
 * 
 */
public class Program1_Longestword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]={"ramesheswar","raman","ramayya"};
	    String longest="";
	    int index=0;
	    int flag=0;
	    String name=names[0];
	    String current= "";
	    while(index<name.length()) {
	    	
	    	current=current + name.charAt(index);
	    	for(int i=1;i<=names.length-1;i++) {
	    	String userName=names[i];
	    	if(userName.startsWith(current)) {
	    		
	    	} else {
	    		flag=1;
	    		break;
	    	}
	    	}
	        
	    	if(flag == 0)	 
	    		longest=current;
	    		index++;
	    	}
	    	if(longest.isEmpty()) {
	    		System.out.println("No Prefix");
	    	}else {
	    		System.out.println(longest);
	    	}
	    
		}
	}

