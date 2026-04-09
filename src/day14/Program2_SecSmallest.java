/**
 * 
 */
package day14;

import java.util.Arrays;
import java.util.Set;

/**
 * 
 */
public class Program2_SecSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // int arr[]= {99,100,4,3,1,1,7,2,9,1};
		int arr[]= {1,100,4,3,1,1,7,2,9,1};
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
		//int arr[]= {100,4,3,1,1,7,2,9,1};
		   // int arr[]= {4,2,7,2,9,1};
				//int arr[]= {1,2,3,4,5};
		 /*   int small=arr[0];
		    int secSmall=arr[0]; */
		    int small=Integer.MAX_VALUE;
		    int secSmall=Integer.MAX_VALUE;
		   
		    for(int i=0;i<arr.length-1;i++) {
		    	
		    	if(arr[i] <small) {
		    		//secSmall=small;
		    		small=arr[i];
		    	}
		    	else if(arr[i] > small && arr[i] < secSmall) {
		    		secSmall=arr[i];
		    	}
		    }
		    if(small == secSmall) {
		    	System.out.println("second smallest doesnot exist");
		    }
		    System.out.println(small);
		 /*   for(int i=0;i<arr.length;i++) {
		    	
		    	if(arr[i] < secSmall && arr[i] > small)
		    		secSmall=arr[i]; 
		    }*/
		    System.out.println(secSmall);
		    
	}

}
