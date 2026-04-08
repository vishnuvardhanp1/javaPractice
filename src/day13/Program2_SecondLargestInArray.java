/**
 * 
 */
package day13;

/**
 * 
 */
public class Program2_SecondLargestInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // int arr[]= {4,1,7,6,9,2};
   // int arr[]= {4,2,7,2,9,1};
		int arr[]= {1,2,3,4,5};
    int small=arr[0];
    int secSmall=Integer.MAX_VALUE;
   
    for(int i=0;i<arr.length;i++) {
    	
    	if(arr[i] <small)
    		small=arr[i];
    }
    System.out.println(small);
    for(int i=0;i<arr.length;i++) {
    	
    	if(arr[i] < secSmall && arr[i] > small)
    		secSmall=arr[i]; 
    }
    System.out.println(secSmall);
    
    
	}
	

}
